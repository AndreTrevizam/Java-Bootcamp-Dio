package ControlesDeFluxo;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano){
            case "T": {
                System.out.println("5GB de YouTube");
            }
            case "M": {
                System.out.println("Insta + Whats Ilimitado");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
