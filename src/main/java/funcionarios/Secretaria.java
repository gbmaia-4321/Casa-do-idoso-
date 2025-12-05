package funcionarios;

import consulta.Consulta;
import consulta.StatusConsulta;
import exceptions.DadosinvalidosException;
import gerenciadores.GerenciamentoFuncionario;
import gerenciadores.GerenciamentoIdosos;
import gerenciadores.GerenciamentoQuartos;
import idoso.Idoso;
import idoso.Quarto;

import java.util.Date;

/**
 * Secretaria: responsável por validar e agendar consultas.
 */
public class Secretaria extends Funcionario {

    private GerenciamentoIdosos gerI;
    private GerenciamentoFuncionario gerF;
    private GerenciamentoQuartos gerQ;

    public Secretaria(String cpf, String nome, GerenciamentoIdosos gerI, GerenciamentoFuncionario gerF, GerenciamentoQuartos gerQ) throws DadosinvalidosException {

        super(cpf, nome, Cargo.SECRETARIA);
        this.gerI = gerI;
        this.gerF = gerF;
        this.gerQ = gerQ;
    }



    public Idoso cadastrarIdoso(String nome, int idade, int quarto, boolean usaInsulina) {
        return gerI.cadastrar(nome, idade, quarto, usaInsulina);
    }

    public Funcionario cadastrarFuncionario(String cpf, String nome, Cargo cargo, String especialidade) {
        return gerF.cadastrar(cpf, nome, cargo, especialidade);
    }

    public boolean alocarIdosoEmQuarto(int idosoId, int numeroQuarto) {
        Quarto quarto = gerQ.buscarPorNumero(numeroQuarto);

        if (quarto == null) {
            System.out.println("Quarto não encontrado.");
            return false;
        }

        boolean sucesso = quarto.adicionarIdoso(idosoId);

        if (!sucesso) {
            System.out.println("Quarto cheio!");
        }

        return sucesso;
    }


    public void agendarConsulta(Consulta consulta) {

        Medico medico = consulta.getMedico();
        Date data = consulta.getData();
        String hora = consulta.getHora();

        if (medico == null) {
            throw new IllegalArgumentException("Consulta sem médico.");
        }

        if (!medico.isDisponivel(data, hora)) {
            throw new IllegalArgumentException("Médico indisponível para esta data e hora.");
        }

        // Se chegou aqui, está disponível → agenda
        medico.getConsultas().add(consulta);
        consulta.setStatus(StatusConsulta.AGENDADA);
    }

}



