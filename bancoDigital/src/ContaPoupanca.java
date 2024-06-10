public class ContaPoupanca extends Conta {
    //constructor
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    //metodo
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}