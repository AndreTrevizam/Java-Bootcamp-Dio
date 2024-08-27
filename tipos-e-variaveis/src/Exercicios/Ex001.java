package Exercicios;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        // Escreva um programa que peça ao usuário para inserir um número e, em seguida, determine se ele é par ou ímpar.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é impar.");
        }
    }
}
