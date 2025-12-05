package gerenciadores;

import exceptions.DadosinvalidosException;
import funcionarios.*;
import idoso.Idoso;


import java.util.ArrayList;


/**
 * Simple in-memory manager for funcionarios.
 */
public class GerenciamentoFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private GerenciamentoIdosos gi;
    private GerenciamentoQuartos geQ;

//    public void cadastrar(Funcionario f) { funcionarios.add(f); }

    public Funcionario cadastrar(String cpf, String nome, Cargo cargo, String especialidade) {
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF não pode ser vazio.");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (cargo == null) {
            throw new IllegalArgumentException("Cargo não pode ser nulo.");
        }

        // 2 — verifica se já existe funcionário com o mesmo CPF
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                throw new IllegalArgumentException("Já existe um funcionário com este CPF.");
            }
        }

        try {
            Funcionario novo;
            switch (cargo) {
                case MEDICO:
                    if (especialidade == null || especialidade.isBlank()){
                        throw new DadosinvalidosException("Especialidade do médico não pode ser vazia. ");
                    }
                    novo = new Medico(cpf, nome, especialidade);
                    break;

                case CUIDADOR:
                    novo = new Cuidador(cpf, nome);
                    break;

                case SECRETARIA:
                    novo = new Secretaria(cpf, nome, gi, this,geQ); // secretaria pode criar outras
                    break;
                default:
                    throw new IllegalArgumentException("Cargo inválido.");
            }
            funcionarios.add(novo);

            return novo;

    } catch (DadosinvalidosException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException("Erro inesperado ao cadastrar funcionario.", e);
        }

    }
    public void listarFuncionarios (){
        for (Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }
    }
}

