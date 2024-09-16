package ExemploInterface.multifuncional;

import ExemploInterface.equipamentos.copiadora.Copiadora;
import ExemploInterface.equipamentos.digitalizadora.Digitalizadora;
import ExemploInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional...");
    }
}
