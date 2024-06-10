public class Cliente {
    //atributo
    private String nome;

    //constructor
    public Cliente(String nome) {
        this.nome = nome;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //toString
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + "]";
    }
       
}