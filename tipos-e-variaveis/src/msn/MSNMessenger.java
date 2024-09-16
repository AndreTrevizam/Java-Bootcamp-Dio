package msn;

public class MSNMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectandoInternet();
        System.out.println("Mensagem enviada pelo MSN.");
    }

    public void receberMensagem() {
        validarConectandoInternet();
        System.out.println("Mensagem recebida pelo MSN.");
    }
}
