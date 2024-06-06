package functionalInterface;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Function;
//import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

public class FunctionExample {
    public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar a Function com expressão lambda para dobrar todos os números
    //2 Function<Integer, Integer> dobrar = numero -> numero * 2;

    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
    //1 List<Integer> numerosDobrados = numeros.stream()
    //1     .map(dobrar)
    //1     .collect(Collectors.toList());
    //2 List<Integer> numerosDobrados = numeros.stream()
    //2     .map(dobrar)
    //2     .toList();
    //3 List<Integer> numerosDobrados = numeros.stream()
    //3     .map(
    //3         new Function<Integer, Integer>() {
    //3             @Override
    //3             public Integer apply(Integer n) {
    //3                 return n * 2;
    //3             }         
    //3         }
    //3     )
    //3     .toList();
    List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2)
        .toList();

    // Imprimir a lista de números dobrados
    // numerosDobrados.forEach(n -> System.out.println(n));
    numerosDobrados.forEach(System.out::println);
  }
}
