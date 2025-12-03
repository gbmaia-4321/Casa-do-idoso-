package casaidoso.medicamento;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }
}