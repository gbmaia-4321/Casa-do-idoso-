package funcionarios;

import agendas.AgendaMedico;
import consulta.Consulta;
import exceptions.DadosinvalidosException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * Médico: possui agenda.
 */
public class Medico extends funcionarios.Funcionario {
    private String especialidade;
    private AgendaMedico agenda;

    public Medico(String cpf, String nome, String especialidade) throws DadosinvalidosException {
        super(cpf, nome, Cargo.MEDICO);

        if (especialidade == null || especialidade.isBlank()){
            throw new DadosinvalidosException("A especialidade do médico não pode ser vazia. ");
        }

        this.especialidade = especialidade;
        this.agenda = new AgendaMedico(id);
    }

    public AgendaMedico getAgenda() {
        return agenda;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void agendarConsulta(Consulta c) throws DadosinvalidosException{
        if (c == null){
            throw new DadosinvalidosException("A consulta não pode ser nula.");
        }
        agenda.agendar(c);
    }

    public void cancelarConsulta(Consulta c) throws DadosinvalidosException {
        if (c == null) {
            throw new DadosinvalidosException("Consulta inválida para cancelamento.");
        }
        agenda.cancelar(c);
    }

    public ArrayList<Consulta> listarConsultas() {
        return agenda.listar();
    }

    //MÉTODOS QUE A SECRETARIA PRECISA

    public boolean isDisponivel(Date data, String hora) throws DadosinvalidosException {
        if (data == null) {
            throw new DadosinvalidosException("Data não pode ser nula.");

        }
        if (hora == null || hora.isBlank()) {
            throw new DadosinvalidosException("Hora não pode ser vazia.");

        }

        return agenda.isDisponivel(data, hora);
    }

    public ArrayList<Consulta> getConsultas() {
        return agenda.listar();
    }
}
