package funcionarios;

import consulta.Consulta;

/**
 * Secretaria: responsável por validar e agendar consultas.
 */
public class Secretaria extends Funcionario {



    public Secretaria(int id, String cpf, String nome, Funcionario funcionario) throws Exception {
        super(id, cpf, nome, funcionario.cargo);
    }

    public void agendarConsulta(Consulta consultaa) {
        if (consultaa.getMedico() == null) throw new IllegalArgumentException("Consulta sem médico");
        consultaa.getMedico().getAgenda();
        consultaa.setStatus(consulta.StatusConsulta.AGENDADA);
    }
}



