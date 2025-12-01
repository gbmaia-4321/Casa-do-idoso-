public class Medicamento {
    private int id;
    private String nome;
    private Receita receita;

    public Medicamento(int id, String nome, Receita receita) {
        this.id = id;
        this.nome = nome;
        this.receita = receita;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Receita getReceita() {
        return receita;
    }
}
