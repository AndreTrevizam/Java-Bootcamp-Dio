package Excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();


            //imprimindo os dados
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " Anos");
            System.out.println("Minha altura é " + altura + " metros");
            scanner.close();
        }
        catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser númericos.");
        }
    }
}
