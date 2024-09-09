package POO.Lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO LANCHE");
    }

    public void fazerPedido() {
        System.out.println("FAZENDO PEDIDO");
    }

    private void consultarSaldoApp() {
        System.out.println("CONSULTANDO SALDO NO APP");
    }

    public void pagarConta() {
        consultarSaldoApp();
        System.out.println("CLIENTE PAGANDO A CONTA");
    }
}
