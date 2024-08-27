package Exercicios;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int i = 1;
        int resultado;

        do {
            resultado = num * (num - i++);
        }  while (num == 1);
        System.out.println(resultado);
    }
}