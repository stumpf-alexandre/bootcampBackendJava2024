package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefaSet;

    //constructor
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    
    //add tarefa
    public void adicionarTarefa(String tarefa, boolean execucao) {
        tarefaSet.add(new Tarefa(tarefa, execucao));
        System.out.println("Foi adicionado uma tarefa com sucesso ao Set de Tarefa");
    }

    //remove tarefa
    public void removerTarefa(String tarefa) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao() == tarefa) {
                tarefaParaRemover = t;
                break;
            }
        }
        System.out.println("A tarefa " + tarefaParaRemover.getDescricao() + " foi removido da Set de Tarefas");
        tarefaSet.remove(tarefaParaRemover);
    }

    //exibir tarefa
    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    //conta o número total de tarefas
    public void contarTarefas() {
        System.out.println("Total de tarefas: " + tarefaSet.size());
    }

    //tarefas concluídas
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConclusao()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    //tarefas pendentes
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConclusao()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    //marca uma tarefa como concluída
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConclusao(true);
                System.out.println(descricao + "está concluida");
            }
        }
    }

    //marca uma tarefa como pendente
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isConclusao()) {
                tarefaParaMarcarComoPendente.setConclusao(false);
                System.out.println(descricao + "está pendente");
            }
        } else {
            System.out.println("Tarefa não encontrada");
        }
      }

    //remove todas as tarefas
    public void limparListaTarefas() {
        tarefaSet.clear();
        System.out.println("Tarefas removidas da lista de tarefas");
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java", true);
        listaTarefas.adicionarTarefa("Fazer exercícios físicos", false);
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho", true);
        listaTarefas.adicionarTarefa("Ler livro", false);
        listaTarefas.adicionarTarefa("Preparar apresentação", true);
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Preparar apresentação");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        listaTarefas.contarTarefas();
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Fazer exercícios físicos");
        listaTarefas.marcarTarefaConcluida("Ler livro");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}