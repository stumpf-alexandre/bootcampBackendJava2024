package collectionsFrameworksApi.generico;

import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
    public static void main(String[] args) {
        //Exemplo sem generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", "valor");
        // Permite adicionar qualquer tipo de objeto

        //Exemplo com generics
        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20);

        //Iterarando sobre o mapa com generics
        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", valor: " + valor);
        }

        //Iterando sobre o mapa sem generics (necessario fazer cast)
        for (Object elemento : mapaSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) elemento;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + ", valor: " + valor);
        }
    }
}
