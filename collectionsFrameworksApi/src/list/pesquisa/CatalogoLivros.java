package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> listaLivros;

    //construtor
    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        listaLivros.add(new Livro(titulo, autor, ano));
        System.out.println("Livro adicionado ao catalogo");
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
             for (Livro l : listaLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
             }
        } else {
            System.out.println("Lista de livros está vazio");
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
             for (Livro l : listaLivros) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
             }
        } else {
            System.out.println("Lista de livros está vazio");
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
               if (l.getTitulo().equalsIgnoreCase(titulo)) {
                   livroPorTitulo = l;
                   break;
               } 
            }
       } else {
           System.out.println("Lista de livros está vazio");
       }
       return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogo.pesquisarPorAutor("Autor 2"));

        System.out.println(catalogo.pesquisarPorIntervaloAno(2020, 2022));

        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
    }
}
