package Exercicios.Desafio;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal(5);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal(10);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal(15);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);
    }
}
