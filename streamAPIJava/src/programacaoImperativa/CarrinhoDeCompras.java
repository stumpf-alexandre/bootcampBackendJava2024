package programacaoImperativa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    //constructor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //metodopara calcular valor total dos itens sem utilizar o Stream API
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
}