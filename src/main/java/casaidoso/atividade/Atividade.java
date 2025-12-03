package casaIdoso.atividade;

public class Atividade {
    private int id;
    private String descricao;
    private casaidoso.atividade.TipoAtividade tipo;

    public Atividade(int id, String descricao, casaidoso.atividade.TipoAtividade tipo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() { return descricao; }
    public casaidoso.atividade.TipoAtividade getTipo() { return tipo; }
}
