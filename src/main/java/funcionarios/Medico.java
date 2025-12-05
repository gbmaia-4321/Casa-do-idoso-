package funcionarios;

import agendas.AgendaMedico;
import consulta.Consulta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * Médico: possui agenda.
 */
public class Medico extends funcionarios.Funcionario {
    private String especialidade;
    private AgendaMedico agenda;

    public Medico(String cpf, String nome, String especialidade) throws Exception {
        super(cpf, nome, Cargo.MEDICO);
        this.especialidade = especialidade;
        this.agenda = new AgendaMedico(id);
    }

    public AgendaMedico getAgenda() {
        return agenda;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void agendarConsulta(Consulta c) {
        agenda.agendar(c);
    }

    public void cancelarConsulta(Consulta c) {
        agenda.cancelar(c);
    }

    public ArrayList<Consulta> listarConsultas() {
        return agenda.listar();
    }

    //MÉTODOS QUE A SECRETARIA PRECISA

    public boolean isDisponivel(Date data, String hora) {
        return agenda.isDisponivel(data, hora);
    }

    public ArrayList<Consulta> getConsultas() {
        return agenda.listar();
    }
}
