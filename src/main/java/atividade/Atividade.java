package atividade;

public class Atividade {
    private String descricao;
    private String hora;
    private boolean concluida;
    private atividade.TipoAtividade tipo;


    public Atividade(String descricao, String hora, boolean concluida, TipoAtividade tipo) {
        this.descricao = descricao;
        this.hora = hora;
        this.concluida = concluida;
        this.tipo = tipo;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }


    @Override
    public String toString() {
        String status = this.concluida ? "[CONCLUÍDA]" : "[PENDENTE]";
        return String.format("%s - Hora: %s | Descrição: %s", status, this.hora, this.descricao, this.tipo);
    }
}