package casaidoso.gerenciadores;

import casaidoso.funcionarios.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple in-memory manager for funcionarios.
 */
public class GerenciamentoFuncionario {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionar(Funcionario f) { funcionarios.add(f); }
    public List<Funcionario> listar() { return new ArrayList<>(funcionarios); }
}
