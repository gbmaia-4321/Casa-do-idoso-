package gerenciadores;

import funcionarios.Funcionario;

import java.util.ArrayList;

public class GerenciamentoFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listar() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
