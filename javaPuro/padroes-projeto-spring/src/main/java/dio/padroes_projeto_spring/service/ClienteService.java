package dio.padroes_projeto_spring.service;

import dio.padroes_projeto_spring.model.Cliente;
/**
 * Interface que define o padrão <b>Strategy</b> no dominio do cliente. Com 
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface
 * 
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}