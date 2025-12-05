package gerenciadores;

import funcionarios.Funcionario;
import java.util.ArrayList;


/**
 * Simple in-memory manager for funcionarios.
 */
public class GerenciamentoFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionar(Funcionario f) { funcionarios.add(f); }
    public ArrayList<Funcionario> listar() { return new ArrayList<>(funcionarios);}
}
