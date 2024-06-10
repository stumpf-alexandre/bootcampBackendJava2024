public class ContaPoupanca extends Conta {
    //constructor
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    //metodo
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}