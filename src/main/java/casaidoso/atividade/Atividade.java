package atividade;

public class Atividade {
    private int id;
    private String descricao;
    private atividade.TipoAtividade tipo;

    public Atividade(int id, String descricao, atividade.TipoAtividade tipo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() { return descricao; }
    public atividade.TipoAtividade getTipo() { return tipo; }
}
