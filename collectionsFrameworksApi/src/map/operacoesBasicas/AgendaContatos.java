package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatosMap;

    //constructor
    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    //add
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
        System.out.println(nome + " adicionado com sucesso na Agenda de Contatos");
    }

    //remove
    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            System.out.println(nome + " removido com sucesso da Agenda de Contatos");
            agendaContatosMap.remove(nome);
        } else {
            System.out.println("Agenda vazia");
        }
    }

    //listar
    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    //pesquisar por nome
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.adicionarContato("Camila", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}