package funcionarios;

import agendas.AgendaMedico;
import consulta.Consulta;
import java.util.ArrayList;

/**
 * Médico: possui agenda.
 */
public class Medico extends funcionarios.Funcionario {
    private String especialidade;
    private agendas.AgendaMedico agenda;

    public Medico(int id, String cpf, String nome, String especialidade) throws Exception {
        super(id, cpf, nome, "Medico");
        this.especialidade = especialidade;
        this.agenda = new AgendaMedico(id);
    }

    public AgendaMedico getAgenda() { return agenda; }
    public String getEspecialidade() { return especialidade; }


    public void agendarConsulta(Consulta c) {
        agenda.agendar(c);
    }

    public void cancelarConsulta(Consulta c) {
        agenda.cancelar(c);
    }

    public ArrayList<Consulta> listarConsultas() {
        return agenda.listar();
    }


}
