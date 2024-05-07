package lanchonete.areaCliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Escolhendo lanche");
    }

    public void fazerPedido() {
        System.out.println("Fazendo o pedido");
    }

    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("Pagando a Conta");
    }

    //private
    private void consultarSaldoAplicativo() {
        System.out.println("Consultando saldo no aplicativo");
    }

    //refatorando o código
    //public void pegarPedidoBalcao() {
    //    System.out.println("Pegando o pedido no balcão");
    //}
}
