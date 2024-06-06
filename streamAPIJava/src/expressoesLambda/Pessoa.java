package expressoesLambda;

public class Pessoa {
    //atributo
    private String nome;
    private double altura;

    //constructor
    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    //toString
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", altura=" + altura + "]";
    }    
}
