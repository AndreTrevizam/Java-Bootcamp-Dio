package POO.Lanchonete;

import POO.Lanchonete.area.cliente.Cliente;
import POO.Lanchonete.atendimento.Atendente;
import POO.Lanchonete.atendimento.cozinha.Almoxerife;
import POO.Lanchonete.atendimento.cozinha.Cozinheiro;
//private = somente a propria classe consegue enxergar
//public = todas as classes conseguem enxergar
//default =

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //açoes que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.pagarConta();


    }
}
