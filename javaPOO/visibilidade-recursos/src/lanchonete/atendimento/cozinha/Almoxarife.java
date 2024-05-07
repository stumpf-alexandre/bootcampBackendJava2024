package lanchonete.atendimento.cozinha;

public class Almoxarife {
    //private
    private void controlarEntrada() {
        System.out.println("Controlando a entrada dos itens");
    }

    //private
    private void controlarSaida() {
        System.out.println("Controlando a saida dos itens");
    }

    //default (só é visto dentro do pacote ou cozinha)
    void entregarIngredientes() {
        controlarSaida();
        System.out.println("Entregando ingredientes");
    }

    //default (só é visto dentro do pacote ou cozinha)
    void trocarGas() {
        System.out.println("Almoxarife trocando o gás");
    }
}
