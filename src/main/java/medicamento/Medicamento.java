package medicamento;
public class Medicamento {
    private int id;
    private String nome;
    private String dosagem;
    private String instrucoes;

    public Medicamento(int id, String nome, String dosagem, String instrucoes) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID do medicamento deve ser maior que zero.");
        }

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do medicamento não pode estar vazio.");
        }

        if (dosagem == null || dosagem.trim().isEmpty()) {
            throw new IllegalArgumentException("A dosagem do medicamento não pode estar vazia.");
        }

        if (instrucoes == null || instrucoes.trim().isEmpty()) {
            throw new IllegalArgumentException("As instruções do medicamento não podem estar vazias.");
        }

        this.id = id;
        this.nome = nome;
        this.dosagem = dosagem;
        this.instrucoes = instrucoes;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getDosagem() { return dosagem; }
    public String getInstrucoes() { return instrucoes; }

    @Override
    public String toString() {
        return nome + " (" + dosagem + ")";
    }
}
