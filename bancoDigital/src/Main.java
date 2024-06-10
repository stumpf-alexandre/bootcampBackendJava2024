public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alexandre");
        Banco banco1 = new Banco("Santander");
        Conta cc = new ContaCorrente(cliente1, banco1);
        Conta poupanca = new ContaPoupanca(cliente1, banco1);

        cc.sacar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.depositar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.transferir(50, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.sacar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.depositar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        poupanca.transferir(100, cc);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        banco1.exibirContas();
        banco1.exibirClientes();
    }
}
