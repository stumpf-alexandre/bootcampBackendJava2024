public abstract class Conta {
    //atributo
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int conta;
    private double saldo;

    //constructor
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    //metodos
    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {
        
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
}