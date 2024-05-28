package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    //atributo
    private Set<Contato> contatoSet;

    //constructor
    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    //add contato
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
        System.out.println("Foi adicionado um contato com sucesso ao Set de Contato");
    }

    //remove contato
    public void removerContato(String nome) {
        Contato contatoParaRemover = null;
        for (Contato c : contatoSet) {
            if (c.getNome() == nome) {
                contatoParaRemover = c;
                break;
            }
        }
        System.out.println("O contato " + contatoParaRemover.getNome() + " foi removido da Set de Contato");
        contatoSet.remove(contatoParaRemover);
    }

    //exibir contatos
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    //pesquisar contato por nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        System.out.println("Pesquisando contatos com nome de " + nome);
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    //atualizar o numero de contato pelo nome
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equals(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        
        
    }
}
