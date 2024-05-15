package interfaces.src.equipamentos.multifuncional;

import interfaces.src.equipamentos.equipamentoCopiadora.Copiadora;
import interfaces.src.equipamentos.equipamentoDigitalizadora.Digitalizadora;
import interfaces.src.equipamentos.equipamentoImpressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
