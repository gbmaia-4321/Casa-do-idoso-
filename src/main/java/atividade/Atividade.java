package atividade;

import exceptions.DadosinvalidosException;

public class Atividade {
    private String descricao;
    private String hora;
    private boolean concluida;
    private atividade.TipoAtividade tipo;


    public Atividade(String descricao, String hora, boolean concluida, TipoAtividade tipo) throws DadosinvalidosException {

        if (descricao == null || descricao.isBlank()) {
            throw new DadosinvalidosException("A descrição da atividade não pode ser vazia.");
        }

        if (hora == null || hora.isBlank()) {
            throw new DadosinvalidosException("A hora da atividade não pode ser vazia. ");
        }

        if (tipo == null){
            throw new DadosinvalidosException("O tipo da atividade não pode ser nulo.");
        }

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