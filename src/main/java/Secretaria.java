public class Secretaria extends Funcionario{
    private GerenciamentoFuncionario gerFunc;
    private GerenciamentoIdosos gerIdosos;

    public Secretaria(int id, String cpf, String nome, String cargo, GerenciamentoFuncionario gerFunc, GerenciamentoIdosos gerIdosos) {
        super(id, cpf, nome, cargo);
        this.gerFunc = gerFunc;
        this.gerIdosos = gerIdosos;
    }

    public Secretaria(){
        gerFunc = new GerenciamentoFuncionario();
        gerIdosos = new GerenciamentoIdosos();
    }

    // -------------------------
    // MÉTODOS PARA IDOSOS
    // -------------------------
    public void cadastrarIdoso(Idoso idoso){
        gerIdosos.adicionar(idoso);
    }

    public void listarIdoso (Idoso idoso){
        gerIdosos.listar();
    }



    // -------------------------
    // MÉTODOS PARA FUNCIONÁRIO
    // -------------------------
    public void CadastrarFuncionario(Funcionario funcionario){
        gerFunc.adicionar(funcionario);
    }

    public void listarFuncionario(){
        gerFunc.listar();
    }

    public void alocarIdosoQuarto(){}

    public void agendarConsulta(){}

    public boolean verificarVisponibilidadeMedico(Medico medico){
        if (medico.isDisponibilidade() == true){
            return true;
            System.out.println("O medico esta disponivel");
        }

        else{
            return false;
            System.out.println("O medico nao esta disponivel");
        }
    }


}
