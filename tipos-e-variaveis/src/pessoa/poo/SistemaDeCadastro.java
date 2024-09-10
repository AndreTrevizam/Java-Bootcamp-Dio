package pessoa.poo;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "171");

        marcos.setEndereco("Rua dos Bobos");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
