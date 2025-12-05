package funcionarios;

import consulta.Consulta;
import consulta.StatusConsulta;
import exceptions.DadosinvalidosException;
import exceptions.OperacaoInvalidaException;
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

        if (gerI == null || gerF == null || gerQ == null) {
            throw new DadosinvalidosException("Gerenciadores não podem ser nulos.");
        }

        this.gerI = gerI;
        this.gerF = gerF;
        this.gerQ = gerQ;
    }



    public Idoso cadastrarIdoso(String nome, int idade, int quarto, boolean usaInsulina) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do idoso não pode ser vazio.");
        }

        if (idade <= 0) {
            throw new IllegalArgumentException("Idade inválida.");

        }

        return gerI.cadastrar(nome, idade, quarto, usaInsulina);
    }

    public Funcionario cadastrarFuncionario(String cpf, int idade, String nome, Cargo cargo, String especialidade) {

        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF está inválido.");
        }

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome está inválido.");
        }

        if (cargo == null) {
            throw new IllegalArgumentException("Cargo não pode ser nulo.");
        }

        return gerF.cadastrar(cpf, nome, cargo, especialidade);
    }


    public boolean alocarIdosoEmQuarto(int idosoId, int numeroQuarto) {
        if (numeroQuarto <= 0) {
            throw new IllegalArgumentException("Número de quarto inválido.");
        }

        Quarto quarto = gerQ.buscarPorNumero(numeroQuarto);

        if (quarto == null) {
            throw new OperacaoInvalidaException("Quarto não encontrado.");
        }

        boolean sucesso = quarto.adicionarIdoso(idosoId);

        if (!sucesso) {
            throw new OperacaoInvalidaException("O quarto está cheio.");
        }


        return true;
    }


    public void agendarConsulta(Consulta consulta) throws DadosinvalidosException {
        if (consulta == null) {
            throw new IllegalArgumentException("Consulta não pode ser nula.");
        }

        if (consulta.getMedico() == null) {
            throw new DadosinvalidosException("Consulta sem médico associado.");
        }

        Medico medico = consulta.getMedico();
        Date data = consulta.getData();
        String hora = consulta.getHora();

        if (data == null) {
            throw new DadosinvalidosException("Data da consulta não pode ser nula.");
        }

        if (hora == null || hora.isBlank()) {
            throw new DadosinvalidosException("Hora da consulta inválida.");
        }

        // Verifica disponibilidade do médico
        if (!medico.isDisponivel(data, hora)) {
            throw new OperacaoInvalidaException("Médico indisponível nesta data e hora.");
        }

        // Se chegou aqui, está disponível → agenda
        medico.getConsultas().add(consulta);
        consulta.setStatus(StatusConsulta.AGENDADA);
    }

}



