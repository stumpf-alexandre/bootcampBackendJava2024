package expressoesLambda;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    //constructor
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenarPorAltura() {
        if (!pessoaList.isEmpty()) {
            List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
            pessoaPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
            return pessoaPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
}
