package msn;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectandoInternet();
        System.out.println("Mensagem enviada pelo Facebook Messenger.");
    }

    public void receberMensagem() {
        validarConectandoInternet();
        System.out.println("Mensagem recebida pelo Facebook Messenger.");
    }
}
