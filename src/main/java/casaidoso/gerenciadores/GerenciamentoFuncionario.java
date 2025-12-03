package casaidoso.gerenciadores;

import casaidoso.funcionarios.Funcionario;

import java.util.ArrayList;

public class GerenciamentoFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }


        public void listar() {
            for (Funcionario f : funcionarios) {
                System.out.println(f);
                System.out.println("=================");
                System.out.println("Nome: "+f.getNome());
                System.out.println("Cargo: "+f.getCargo());
                System.out.println("=================");
            }
    }
}
