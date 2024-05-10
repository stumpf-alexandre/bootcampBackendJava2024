public class MSNMessenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
    }
    //métodos privados, visiveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.err.println("Salvando o histórico da mensagem");
    }
}
