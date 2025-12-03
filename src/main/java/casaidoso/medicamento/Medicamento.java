package casaIdoso.medicamento;

public class Medicamento {
    private int id;
    private String nome;
    private String dosagem;
    private String instrucoes;

    public Medicamento(int id, String nome, String dosagem, String instrucoes) {
        this.id = id;
        this.nome = nome;
        this.dosagem = dosagem;
        this.instrucoes = instrucoes;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
}
