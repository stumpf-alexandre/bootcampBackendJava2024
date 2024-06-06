package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerExample {
     public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

    // Usar o Consumer com expressão lambda para imprimir números pares
    // Consumer<Integer> imprimirNumeroPar = numero -> {
    //   if (numero % 2 == 0) {
    //     System.out.println(numero);
    //   }
    // };

    // Usar o Consumer para imprimir números pares no Stream
    //1 numeros.stream().forEach(imprimirNumeroPar);
    //2 numeros.stream().forEach(new Consumer<Integer>() {
    //2     @Override
    //2     public void accept(Integer t) {
    //2         if (t % 2 == 0) {
    //2             System.out.println(t);
    //2         }            
    //2     }        
    //2 });
    numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
  }
}
