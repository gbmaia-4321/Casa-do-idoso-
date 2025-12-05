package agendas;

import consulta.Consulta;
import exceptions.DadosinvalidosException;

import java.util.ArrayList;
import java.util.Date;

/**
 * Simple in-memory agenda for a medico.
 */
public class AgendaMedico {
    private int medicoId;
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public AgendaMedico(int medicoId) throws DadosinvalidosException {
        if (medicoId < 0) {
            throw new DadosinvalidosException("O id médico não pode ser negativo.");
        }
        this.medicoId = medicoId;
    }

    public void agendar(Consulta consulta) throws DadosinvalidosException{
        if (consulta == null){
            throw new DadosinvalidosException("A consulta não pode ser nula.");
        }
        if (consulta.getData() == null) {
            throw new DadosinvalidosException("A data da consulta não pode ser nula.");
        }
        if (consulta.getHora() == null || consulta.getHora().isBlank()){
            throw new DadosinvalidosException("A hora da consulta não pode ser vazia.");
        }

        if (!isDisponivel(consulta.getData(), consulta.getHora())) {
            throw new IllegalStateException("Horário indisponível para agendamento.");
        }
        consultas.add(consulta);
    }

    public boolean cancelar(Consulta consulta) throws DadosinvalidosException {
        if (consulta == null){
            throw new DadosinvalidosException("Não é possível cancelar uma consulta nula. ");
        }
        return consultas.remove(consulta);

    }

    public ArrayList<Consulta> listar() {
        return new ArrayList<>(consultas);
    }

    public boolean isDisponivel(Date data, String hora) throws DadosinvalidosException {
        if (data == null) {
            throw new DadosinvalidosException("A data não pode ser nula.");

        }
        if (hora == null || hora.isBlank()) {
            throw new DadosinvalidosException("A hora não pode ser vazia.");

        }

        return consultas.stream()
                .noneMatch(c -> c.getData().equals(data) && c.getHora().equals(hora));
    }

}
