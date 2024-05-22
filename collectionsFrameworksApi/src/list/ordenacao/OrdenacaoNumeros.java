package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributo
    private List<Integer> listNumero;

    //constructor
    public OrdenacaoNumeros() {
        this.listNumero = new ArrayList<>();
        //cria uma lista vazia
    }

    public OrdenacaoNumeros(List<Integer> listNumero) {
        this.listNumero = listNumero;
    }

    public void adicionarNumero(int numero) {
        this.listNumero.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeroAscendente = new ArrayList<>(listNumero);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeroDescendente = new ArrayList<>(listNumero);
        numeroDescendente.sort(Collections.reverseOrder());
        return numeroDescendente;
    }

    public void listarNumeros() {
        System.out.println(listNumero);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        ordenacao.adicionarNumero(3);
        ordenacao.adicionarNumero(0);
        ordenacao.adicionarNumero(20);
        ordenacao.adicionarNumero(56);
        ordenacao.adicionarNumero(-10);
        ordenacao.adicionarNumero(9);
        ordenacao.adicionarNumero(1);

        ordenacao.listarNumeros();

        System.out.println(ordenacao.ordenarAscendente());

        System.out.println(ordenacao.ordenarDescendente());
    }
}
