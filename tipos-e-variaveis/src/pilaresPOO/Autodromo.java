package pilaresPOO;

public class Autodromo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setChassi("213123");
        //carro.ligar();

        Moto moto = new Moto();
        moto.setChassi("123125");
        //moto.ligar();

        Veiculo coringa = moto;
        coringa.ligar();
    }
}
