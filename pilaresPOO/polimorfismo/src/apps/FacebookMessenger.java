package apps;
public class FacebookMessenger extends ServicoMensagemInstantania {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook messenger");
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Facebook messenger");
    }
}
