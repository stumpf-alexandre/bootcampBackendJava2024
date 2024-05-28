package ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matrícula;
    private double media;
    
    //constructor
    public Aluno(String nome, long matrícula, double media) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.media = media;
    }

    //comparable
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    //getters
    public String getNome() {
        return nome;
    }

    public long getMatrícula() {
        return matrícula;
    }

    public double getMedia() {
        return media;
    }

    //equals hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + (int) (matrícula ^ (matrícula >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (matrícula != other.matrícula)
            return false;
        return true;
    }

    //toString
    @Override
    public String toString() {
        return "{" + nome + ", matrícula=" + matrícula + ", media=" + media + "}";
    }
}

class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}