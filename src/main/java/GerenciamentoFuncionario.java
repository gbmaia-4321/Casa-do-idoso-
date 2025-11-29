import java.util.ArrayList;

public class GerenciamentoFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public void adicionar(Funcionario f) {
        funcionarios.add(f);
    }

    public void listar() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
