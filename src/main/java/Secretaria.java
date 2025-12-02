public class Secretaria extends Funcionario{
    private GerenciamentoFuncionario gerFunc;
    private GerenciamentoIdosos gerIdosos;

    public Secretaria(int id, String cpf, String nome, String cargo, GerenciamentoFuncionario gerFunc, GerenciamentoIdosos gerIdosos) throws DadosinvalidosException {
        super(id, cpf, nome, cargo);
        this.gerFunc = gerFunc;
        this.gerIdosos = gerIdosos;
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

    public void agendarConsulta(){

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

    public void alocarIdosoQuarto(){

    }



    public boolean verificarVisponibilidadeMedico(Medico medico){
        if (medico.isDisponibilidade() == true){
            System.out.println("O medico esta disponivel");
            return true;

        }

        else{
            System.out.println("O medico nao esta disponivel");
            return false;

        }
    }


}
