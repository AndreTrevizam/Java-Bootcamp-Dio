package msn;

public class TelegramMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectandoInternet();
        System.out.println("Mensagem enviada pelo Telegram Messenger.");
    }

    public void receberMensagem() {
        validarConectandoInternet();
        System.out.println("Mensagem recebida pelo Telegram Messenger.");
    }
}
