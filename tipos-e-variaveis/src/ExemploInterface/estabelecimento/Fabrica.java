package ExemploInterface.estabelecimento;

import ExemploInterface.equipamentos.impressora.DeskJet;
import ExemploInterface.equipamentos.impressora.Impressora;
import ExemploInterface.equipamentos.impressora.LaserJet;
import ExemploInterface.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultiFuncional();
        EquipamentoMultiFuncional emf = new EquipamentoMultiFuncional();

        emf.digitalizar();
        emf.imprimir();
        emf.copiar();
    }
}
