import java.util.ArrayList;
import java.util.List;

public class Banco {
    //atributo
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    //constructor
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    //metodo
    public void exibirContas() {
        if (!contas.isEmpty()) {
            System.out.println(contas);
        } else {
            System.out.println("Não possui conta cadastrada!!!");
        }
    }

    public void exibirClientes() {
        if (!clientes.isEmpty()) {
            System.out.println(this.clientes);
        } else {
            System.out.println("Não possui cliente cadastrado!!!");
        }
    }
}