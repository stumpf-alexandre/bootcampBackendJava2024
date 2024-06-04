package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
        //atributo
    private Map<String, String> dicionarioMap;

    //constructor
    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    //add
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
        System.out.println(palavra + " adicionado com sucesso na Dicionário");
    }

    //remove
    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(palavra + " removido com sucesso da Agenda de Contatos");
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Dicionario vazio");
        }
    }

    //listar
    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    //pesquisar por palavra
    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Cavalo", "Animal quadrupede");
        dicionario.adicionarPalavra("Casa", "Moradia");
        dicionario.adicionarPalavra("Carro", "Meio de locomoção");
        dicionario.adicionarPalavra("Peixe", "Animal aquatico");
        dicionario.adicionarPalavra("Televisão", "Aparelho para assistir programas");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Televisão");;

        dicionario.exibirPalavras();

        System.out.println("A definição é: " + dicionario.pesquisarPorPalavra("Peixe"));
    }
}
