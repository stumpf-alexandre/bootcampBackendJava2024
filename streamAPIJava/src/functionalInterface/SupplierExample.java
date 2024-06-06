package functionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter uma lista com 5 saudações
    //1 List<String> listaSaudacoes = Stream.generate(saudacao)
    //1     .limit(5)
    //1     .collect(Collectors.toList());
    //2 List<String> listaSaudacoes = Stream.generate(saudacao)
    //2     .limit(5)
    //2     .toList();
    //3 List<String> listaSaudacoes = Stream.generate(
    //3     new Supplier<String>() {
    //3         @Override
    //3         public String get() {
    //3             return "Olá, seja bem-vindo(a)!";
    //3         }
    //3     }
    //3 )
    //3     .limit(5)
    //3     .toList();
    List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
        .limit(5)
        .toList();

    // Imprimir as saudações geradas
    //1 listaSaudacoes.forEach(s -> System.out.println(s));
    listaSaudacoes.forEach(System.out::println);
  }
}
