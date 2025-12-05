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

//    public void cadastrar(Funcionario f) { funcionarios.add(f); }

    public Funcionario cadastrar(String cpf, String nome, Cargo cargo, String especialidade) {
        try {
            Funcionario novo;
            switch (cargo) {
                case MEDICO:
                    novo = new Medico(cpf, nome, especialidade);
                    break;
                case CUIDADOR:
                    novo = new Cuidador(cpf, nome);
                    break;
                case SECRETARIA:
                    novo = new Secretaria(cpf, nome, null, this); // secretaria pode criar outras
                    break;
                default:
                    throw new IllegalArgumentException("Cargo inválido.");
            }

    } catch (DadosinvalidosException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return null;
    }
    public void listarFuncionarios (){
        for (Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }
    }
}

