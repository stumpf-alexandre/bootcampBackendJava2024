public class ContaCorrente extends Conta {
    //constructor
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    //metodo
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}