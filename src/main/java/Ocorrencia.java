public class Ocorrencia {
    private Date data;
    private Cuidador autor;
    private String descricao;

    public Ocorrencia(Cuidador autor, String descricao) {
        this.data = new Date();
        this.autor = autor;
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public Cuidador getAutor() {
        return autor;
    }

    public String getDescricao() {
        return descricao;
    }
}
