public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";
        // maneira de simplificar um if else. <condiçao> ? <caso seja true> : <caso seja false>

        System.out.println(resultado);
    }
}
