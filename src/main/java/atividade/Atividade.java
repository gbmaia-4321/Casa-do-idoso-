package atividade;

public class Atividade {
    private String descricao;
    private TipoAtividade tipo;
    private double duracao;

    public Atividade(String descricao, TipoAtividade tipo, double duracao) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoAtividade getTipo() {
        return tipo;
    }

    public double getDuracao() {
        return duracao;
    }

    public String executarAtividade(Atividade atividade){
        return "atividade.Atividade: " + atividade + " Realizada";
    }

    //metodo editar atividades faltando


}
