package estadoBrasileiro;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "Sao Paulo", 11),
    RIO_DE_JANEIRO ("RJ", "Rio De Janeiro", 12),
    PIAUI ("PI", "Piaui", 13),
    MARANHAO ("MA", "Maranhao", 14),
    CEARA ("CE", "Ceara", 15);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
