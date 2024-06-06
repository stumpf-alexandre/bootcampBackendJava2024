package expressoesLambda;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    //atributo
    private List<Item> itemList;

    //constructor
    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    //metodo para calcular valor dos itens utilizando o Stream API
    public double calcularValorTotal() {
        if (itemList.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        return itemList.stream().mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum();
    }
}