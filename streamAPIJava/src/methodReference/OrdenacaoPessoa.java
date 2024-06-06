package methodReference;

import java.util.ArrayList;
import java.util.Comparator;
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
            pessoaPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoaPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
}
