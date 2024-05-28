package operacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> conjuntoPalavrasUnicasSet;

    //constructor
    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicasSet = new HashSet<>();
    }
    
    //add convidado
    public void adicionarConjuntoPalavrasUnicas(String palavra) {
        conjuntoPalavrasUnicasSet.add(palavra);
        System.out.println("Foi adicionado a palavra " + palavra + " ao Set de Conjunto de Palavras Unicas com sucesso");
    }
    
    //remove convidado
    public void removerConjuntoPalavrasUnicas(String palavra) {
        if (verificarPalavra(palavra)) {
            System.out.println("A palavra " + palavra + " foi removido da Set de Conjunto de Palavras Unicas");
            conjuntoPalavrasUnicasSet.remove(palavra);
        } else {
            System.out.println("A palavra " + palavra + " não foi encontrada na Set de Conjunto de Palavras Unicas");
        }    
    }

    //verifica se existe a palavra no set
    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicasSet.contains(palavra);
    }

    //exibe todas as palavras únicas do conjunto
    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.adicionarConjuntoPalavrasUnicas("Java");
        conjuntoPalavras.adicionarConjuntoPalavrasUnicas("JavaSript");
        conjuntoPalavras.adicionarConjuntoPalavrasUnicas("C#");
        conjuntoPalavras.adicionarConjuntoPalavrasUnicas("PHP");
        conjuntoPalavras.adicionarConjuntoPalavrasUnicas("Kotlin");
        conjuntoPalavras.adicionarConjuntoPalavrasUnicas("HTML");
        conjuntoPalavras.adicionarConjuntoPalavrasUnicas("C#");

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.removerConjuntoPalavrasUnicas("C#");

        conjuntoPalavras.exibirPalavrasUnicas();

        System.out.println("A palavra Java está no Conjunto de Palavras Unicas? " + conjuntoPalavras.verificarPalavra("Java"));

        System.out.println("A palavra C# está no Conjunto de Palavras Unicas? " + conjuntoPalavras.verificarPalavra("C#"));
    }
}
