package desafioJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular:");
        String titular = scanner.next();
        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        System.out.println("Digite a taxa de juros:");
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(titular, numeroConta, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
        scanner.close();
    }
}

class ContaBancaria {
    protected String titular;
    protected int numero;
    protected double saldo;

    public ContaBancaria( String titular, int numero, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String titular, int numero, double saldo, double taxaJuros) {
        //TODO: Implementar adequadamente esta sobrecarga de construtores.
        super(titular, numero, saldo);
        this.taxaJuros = taxaJuros;
    }


    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros) + "%");
    }
}
