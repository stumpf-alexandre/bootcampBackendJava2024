public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();
        System.out.println("Facebook");
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tel = new Telegram();
        System.out.println("Telegram");
        tel.enviarMensagem();
        tel.receberMensagem();
    }
}
