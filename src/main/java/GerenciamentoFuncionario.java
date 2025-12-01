import java.util.ArrayList;

public class GerenciamentoFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionar(Funcionario f) throws FuncionarioJaExistenteException, IllegalArgumentException {
        if (f == null){
            throw new IllegalArgumentException("Tentativa de adicionar um funcionário nulo.");
        }
        for (Funcionario funcionario : funcionarios){
            if (funcionario.getId() == f.getId()){
                throw new IllegalArgumentException(
                        "já existe um funcionário com o ID" + f.getId());
            }
            if (funcionario.getCpf().equals(f.getCpf())){
                throw new FuncionarioJaExistenteException(
                        "Já existente um funcionário com o CPF" + f.getCpf());

            }
        }
        funcionarios.add(f);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    public void listar() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastro.");
            return;
        }

        for (Funcionario f : funcionarios) {
            System.out.println(f.ExibirInformacoes());
        }
    }
}
