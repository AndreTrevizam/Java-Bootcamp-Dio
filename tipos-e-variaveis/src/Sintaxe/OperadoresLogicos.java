package Sintaxe;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int lado1 = 3;
        int lado2 = 3;
        int lado3 = 3;

        if (lado1 == 3 && lado2 == 3 && lado3 == 3) {
            System.out.println("Triangulo equilatero");
        }

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Ambas as expressões são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das expressões é verdadeira");
        }
    }
}
