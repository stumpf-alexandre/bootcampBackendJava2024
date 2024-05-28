package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Aluno> alunoSet;

    //constructor
    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    //add aluno
    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
        System.out.println("Foi adicionado um aluno com sucesso ao Set de Alunos");
    }

    //remove aluno
    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatrícula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        System.out.println("O aluno " + alunoParaRemover.getNome() + " foi removido da Set de Alunos");
        alunoSet.remove(alunoParaRemover);
    }

    //exibir alunos por nome
    public Set<Aluno> exibirAlunoPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    //exibir aluno por nota
    public Set<Aluno> exibirAlunoPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    //exibir lista alunos
    public void exibirAluno() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos aluno = new GerenciadorAlunos();

        aluno.adicionarAluno("Alice Cruz", 3, 6.0);
        aluno.adicionarAluno("Maria Costa", 1, 6.0);
        aluno.adicionarAluno("Manoel Veiga", 4, 9.1);
        aluno.adicionarAluno("Maria Costa", 1, 5.2);
        aluno.adicionarAluno("Antonio Rios", 5, 7.9);
        aluno.adicionarAluno("João Braga", 2, 8.8);

        aluno.exibirAluno();

        aluno.removerAluno(5);

        aluno.exibirAluno();

        System.out.println(aluno.exibirAlunoPorNome());

        System.out.println(aluno.exibirAlunoPorNota());
    }
}
