package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarPedidoBalcao();
        pegarLancheCozinha();
        System.out.println("Servindo mesa");
    }

    //private
    private void pegarLancheCozinha() {
        System.out.println("Pegando o lanche na cozinha");
    }

    public void receberPagamento() {
        System.out.println("Recebendo pagamento");
    }

    //default (só é visto dentro do pacote ou cozinha)
    void trocarGas() {
        System.out.println("Atendente trocando o gás");
    }

    //private
    private void pegarPedidoBalcao() {
        System.out.println("Pegando o pedido no balcão");
    }
}
