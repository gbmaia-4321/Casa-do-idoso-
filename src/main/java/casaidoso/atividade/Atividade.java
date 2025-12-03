package casaidoso.atividade;

public class Atividade {
    private int id;
    private String descricao;
    private TipoAtividade tipo;

    public Atividade(int id, String descricao, TipoAtividade tipo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() { return descricao; }
    public TipoAtividade getTipo() { return tipo; }
}
