package apps;
public class MSNMessenger extends ServicoMensagemInstantania {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN messenger");
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo  pelo MSN messenger");
    }
}
