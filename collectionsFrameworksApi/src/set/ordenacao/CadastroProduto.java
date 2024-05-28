package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributo
    private Set<Produto> produtoSet;

    //constructor
    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    //add produto
    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
        System.out.println("Foi adicionado um produto com sucesso ao Set de Produto");
    }

    //remove produto
    public void removerProduto(String nome) {
        Produto produtoParaRemover = null;
        for (Produto p : produtoSet) {
            if (p.getNome() == nome) {
                produtoParaRemover = p;
                break;
            }
        }
        System.out.println("O produto " + produtoParaRemover.getNome() + " foi removido da Set de Produto");
        produtoSet.remove(produtoParaRemover);
    }

    //exibir produtos por nome
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    //exibir produtos por preco
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    //atualizar produto pelo nome
    public Produto atualizarProduto(String nome, int novoCodigo, double novoPreco, int novoQuantidade) {
        Produto produtoAtualizado = null;
        for (Produto p : produtoSet) {
            if (p.getNome().equals(nome)) {
                p.setCodigo(novoCodigo);
                p.setPreco(novoPreco);
                p.setQuantidade(novoQuantidade);
                produtoAtualizado = p;
                break;
            }
        }
        return produtoAtualizado;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("Banana Prata", 123456, 1.25, 10);
        cadastroProduto.adicionarProduto("Café", 444444, 14.25, 30);
        cadastroProduto.adicionarProduto("Leite", 555555, 5.25, 100);
        cadastroProduto.adicionarProduto("Chocolate", 999999, 4.55, 80);
        cadastroProduto.adicionarProduto("Banana da Terra", 324443, 5.25, 49);
        cadastroProduto.adicionarProduto("Açucar", 888888, 6.78, 35);
        cadastroProduto.adicionarProduto("Banana Prata", 123456, 9.25, 30);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirProdutosPorPreco());

        System.out.println("Produto atualizado: " + cadastroProduto.atualizarProduto("Açucar", 055543, 2.99, 189));

        System.out.println(cadastroProduto.produtoSet);

        cadastroProduto.removerProduto("Leite");

        System.out.println(cadastroProduto.produtoSet);
    }
}
