public abstract class Conta implements IConta {
    //atributo
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private boolean transacao = true;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    //constructor
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //metodos
    @Override
    public void sacar(double valor) {
        if (saldo == 0 || valor > saldo) {
            erroTransacao();
        } else {
            saldo -= valor;
            if (transacao) {
                sucessoTransacao();
            }
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        if (transacao) {
            sucessoTransacao();
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo != 0 && valor < saldo) {
            transacao = false;
            this.sacar(valor);
            contaDestino.depositar(valor);
            transacao = true;
        }
        erroTransacao();
    }

    //getters
    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }

    private void sucessoTransacao() {
        System.out.println("Transação realizada com sucesso");
    }

    private void erroTransacao() {
        System.out.println("Saldo insuficiente");
    }
}