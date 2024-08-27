package Exercicios;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        // Crie um programa que exiba a tabuada de um número fornecido pelo usuário, do 1 ao 10.
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- TABUADA --");
        System.out.print("Digite um número: ");

        int num = scanner.nextInt();

        for (int i = 0; i < 11 ; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
