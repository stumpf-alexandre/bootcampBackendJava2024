package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    //construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
        System.out.println("Item adicionada com sucesso");
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
            System.out.println("Item removido com sucesso");
        } else {
            System.out.println("Carrinho vazio");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                valorTotal += (i.getPreco() * i.getQuantidade());
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(itemList);
        } else {
            System.out.println("Carrinho vazio");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listaCarrinho = new CarrinhoDeCompras();

        listaCarrinho.exibirItens();

        listaCarrinho.adicionarItem("cimento", 60.00, 2);
        listaCarrinho.adicionarItem("tijolo", 2.50, 1);
        listaCarrinho.adicionarItem("vergalhão", 15.80, 1);
        listaCarrinho.adicionarItem("tinta", 75.00, 2);
        listaCarrinho.adicionarItem("pincel", 23.50, 3);
        listaCarrinho.adicionarItem("areia", 23.90, 1);

        listaCarrinho.exibirItens();

        listaCarrinho.removerItem("areia");

        listaCarrinho.exibirItens();

        System.out.println("O valor total dos itens que sobraram na lista é R$" + listaCarrinho.calcularValorTotal());
    }
}