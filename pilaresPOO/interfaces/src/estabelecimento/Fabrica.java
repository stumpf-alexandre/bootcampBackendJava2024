package interfaces.src.estabelecimento;

import interfaces.src.equipamentos.equipamentoCopiadora.Copiadora;
import interfaces.src.equipamentos.equipamentoCopiadora.Xerox;
import interfaces.src.equipamentos.equipamentoDigitalizadora.Digitalizadora;
import interfaces.src.equipamentos.equipamentoDigitalizadora.Scanner;
import interfaces.src.equipamentos.equipamentoImpressora.Deskjet;
import interfaces.src.equipamentos.equipamentoImpressora.Impressora;
import interfaces.src.equipamentos.equipamentoImpressora.Laserjet;
import interfaces.src.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional multi = new Multifuncional();

        Impressora impressora = multi;
        Digitalizadora digitalizadora = multi;
        Copiadora copiadora = multi;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
        multi.imprimir();
        multi.digitalizar();
        multi.copiar();

    }
}
