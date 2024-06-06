package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
  public static void main(String[] args) {
    // Criar uma lista de palavras
    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

    // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
    // imprimir cada palavra que passou no filtro
    //1 palavras.stream()
    //1     .filter(maisDeCincoCaracteres)
    //1     .forEach(System.out::println);
    //2 palavras.stream()
    //2     .filter(
    //2       new Predicate<String>() {
    //2         @Override
    //2         public boolean test(String p) {
    //2           return p.length() > 5;
    //2         }
    //2       }
    //2     )
    //2     .forEach(System.out::println);
    palavras.stream()
        .filter(p -> p.length() > 5)
        .forEach(System.out::println);
  }
}
