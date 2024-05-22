package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    //atributos
    private List<Integer> numeros;

    //construtor
    public SomaNumero() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
        System.out.println("Número " + numero + " adicionado a lista");
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                soma += numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
          for (Integer numero : numeros) {
            if (numero >= maiorNumero) {
              maiorNumero = numero;
            }
          }
        }
        return maiorNumero;
      }
    
      public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
          for (Integer numero : numeros) {
            if (numero <= menorNumero) {
              menorNumero = numero;
            }
          }
        }
        return menorNumero;
      }

      public void exibirNumero() {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            System.out.println("Lista de número vazia");
        }
      }

      public static void main(String[] args) {
        SomaNumero soma = new SomaNumero();

        soma.exibirNumero();
        System.out.println("A soma dos números da lista é: " + soma.calcularSoma());

        soma.adicionarNumero(4);
        soma.adicionarNumero(90);
        soma.adicionarNumero(2);
        soma.adicionarNumero(4);
        soma.adicionarNumero(-100);
        soma.adicionarNumero(0);
        soma.adicionarNumero(4);

        soma.exibirNumero();
        System.out.println("A soma dos números da lista é: " + soma.calcularSoma());
        System.out.println("O maior número da lista é: " + soma.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + soma.encontrarMenorNumero());
      }
}
