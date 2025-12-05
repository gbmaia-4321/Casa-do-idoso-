package funcionarios;

import consulta.Consulta;
import exceptions.DadosinvalidosException;

/**
 * Secretaria: responsável por validar e agendar consultas.
 */
public class Secretaria extends Funcionario {

    public Secretaria(int id, String cpf, String nome, String cargo) throws DadosinvalidosException {
        super(id, cpf, nome, cargo);
    }

    public void agendarConsulta(Consulta consultaa) {
        if (consultaa.getMedico() == null) throw new IllegalArgumentException("Consulta sem médico");
        consultaa.getMedico().getAgenda();
        consultaa.setStatus(consulta.StatusConsulta.AGENDADA);
    }

    public Idoso cadastrarIdoso(){

    }



}



