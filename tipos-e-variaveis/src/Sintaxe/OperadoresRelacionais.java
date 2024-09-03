package Sintaxe;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        boolean igual = num1 != num2;

        System.out.println(num1 + " é diferente de " + num2 + "? " + igual);

        boolean maior = num1 > num2;

        System.out.println(num1 + " é maior que " + num2 + "? " + maior);


        String nome = "André";
        String nomeDois = new String("André");

        System.out.println(nome.equals(nomeDois));
    }
}
