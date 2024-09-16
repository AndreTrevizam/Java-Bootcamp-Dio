package msn;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectandoInternet() {
        System.out.println("Validando a conexão da internet.");
    }
}
