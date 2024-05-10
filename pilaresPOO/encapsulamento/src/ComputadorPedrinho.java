public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        //msn.validarConectadoInternet();
        msn.enviarMensagem();
        //msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}
