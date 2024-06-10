public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Alexandre");
        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

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
    }
}
