package pesquisa;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean conclusao;

    //constructor
    public Tarefa(String descricao, boolean conclusao) {
        this.descricao = descricao;
        this.conclusao = conclusao;
    }

    //getters
    public String getDescricao() {
        return descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    //setters
    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    //toString
    @Override
    public String toString() {
        return "{" + descricao + ", conclusao=" + conclusao + "}";
        
    }
}
