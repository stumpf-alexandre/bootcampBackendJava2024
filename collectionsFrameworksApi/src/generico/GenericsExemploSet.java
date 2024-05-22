package generico;


import java.util.HashSet;
import java.util.Set;

public class GenericsExemploSet {
    public static void main(String[] args) {
        //Exemplo sem generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);
        //Permite adicionar qualquer tipo de objeto

        //Exemplo com generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        //Iterarando sobre o conjunto com generics
        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }

        //Iterando sobre o conjunto sem generics (necessario fazer cast)
        for (Object elemento : conjuntoSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
