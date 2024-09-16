package ExemploInterface.equipamentos.impressora;

public class DeskJet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo com Deskjet...");
    }
}
