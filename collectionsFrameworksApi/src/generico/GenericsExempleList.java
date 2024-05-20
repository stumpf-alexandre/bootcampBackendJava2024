package generico;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        //Exemplo sem generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);
        // Permite adicionar qualquer tipo de objeto

        //Exemplo com generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //Iterarando sobre a lista com generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        //Iterando sobre a lista sem generics (necessario fazer cast)
        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
