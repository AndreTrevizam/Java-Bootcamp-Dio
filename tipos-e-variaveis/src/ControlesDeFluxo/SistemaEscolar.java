package ControlesDeFluxo;

public class SistemaEscolar {
    public static void main(String[] args) {
        double nota = 10;

        if (nota >= 7) {
            System.out.println("aprovado");
        } else if (nota >=5 && nota <=7){
            System.out.println("recuperação");
        } else {
            System.out.println("reprovado");
        }

        //operador ternario
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <= 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
