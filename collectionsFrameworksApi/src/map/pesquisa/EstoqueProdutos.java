package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    //constructor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //add
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //exibir todos os produtos
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    //calcular valor total dos produtos em estoque
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    //obter produto mais caro
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    //obter produto mais barato
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    //obter produtos com maior valor total em estoque
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorValorEstoque = null;
        double maiorValorEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProduto = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProduto > maiorValorEstoque) {
                    maiorValorEstoque = valorProduto;
                    produtoMaiorValorEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorValorEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1, "Produto A", 10, 5.00);
        estoque.adicionarProduto(2, "Produto B", 5, 11.00);
        estoque.adicionarProduto(3, "Produto C", 2, 15.00);
        estoque.adicionarProduto(4, "Produto D", 3, 35.00);
        estoque.adicionarProduto(5, "Produto E", 20, 2.50);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
