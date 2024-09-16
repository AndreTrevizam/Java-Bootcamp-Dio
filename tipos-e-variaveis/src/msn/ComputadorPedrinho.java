package msn;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fcb")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new TelegramMessenger();
        }

        smi.receberMensagem();
        smi.enviarMensagem();
    }
}
