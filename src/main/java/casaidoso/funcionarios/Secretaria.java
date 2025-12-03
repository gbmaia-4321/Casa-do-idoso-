package casaidoso.funcionarios;

import casaidoso.consulta.Consulta;

/**
 * Secretaria: responsável por validar e agendar consultas.
 */
public class Secretaria extends Funcionario {

    public Secretaria(int id, String cpf, String nome) throws Exception {
        super(id, cpf, nome, "Secretaria");
    }

    public void agendarConsulta(Consulta consulta) {
        if (consulta.getMedico() == null) throw new IllegalArgumentException("Consulta sem médico");
        consulta.getMedico().getAgenda().agendar(consulta);
        consulta.setStatus(casaidoso.consulta.StatusConsulta.AGENDADA);
    }
}
