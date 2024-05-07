package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionado lanche natural hamburguer no balcão");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionar suco no balcão");
    }

    public void adicionandoComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    //private
    private void prepararLanche() {
        System.out.println("Preparar lanche tipo hamburguer");
    }

    //private
    private void prepararVitamina() {
        System.out.println("Preparando suco");
    }

    //private
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    //private
    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }

    //private
    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionando frutas, leite e suco");
    }

    //private
    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    //private
    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina liquidificador");
    }

    //private
    private void fritarIngredientesLanche() {
        System.out.println("Fritar a carne e ovo para o hamburger");
    }

    //public void pedirParaTrocarGas(Atendente meuAmigo) {
    //    meuAmigo.trocarGas();
    //}

    //private
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    //private
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
