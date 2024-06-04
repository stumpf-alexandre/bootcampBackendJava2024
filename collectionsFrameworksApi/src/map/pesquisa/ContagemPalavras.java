package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    private Map<String, Integer> contagemPalavrasMap;

    //constructor
    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    //add
    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
        System.out.println(palavra + " adicionado com sucesso");
    }

    //remove
    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            System.out.println(palavra + " removido com sucesso");
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("Texto vazio");
        }
    }

    //exibir todas as palavras e sua contagem
    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int cont : contagemPalavrasMap.values()) {
            contagemTotal += cont;
        }
        return contagemTotal;
    }

    //encontrar palavra com maior contagem
    public String encontrarPalavraMaisFrequente() {
        String palavraFrequente = null;
        int maiorContagem = 0;
        if (!contagemPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraFrequente = entry.getKey();
                }
            }
        }
        return palavraFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Java", 2);
        contagem.adicionarPalavra("Python", 8);
        contagem.adicionarPalavra("JavaScript", 1);
        contagem.adicionarPalavra("C#", 6);
    
        System.out.println("Existem " + contagem.exibirContagemPalavras() + " palavras.");
    
        String linguagemMaisFrequente = contagem.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
