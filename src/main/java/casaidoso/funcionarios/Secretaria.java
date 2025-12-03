package casaidoso.funcionarios;


import casaidoso.exceptions.DadosinvalidosException;
import casaidoso.gerenciadores.GerenciamentoFuncionario;
import casaidoso.gerenciadores.GerenciamentoIdosos;
import casaidoso.idoso.Idoso;

public class Secretaria extends Funcionario {
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

    // Corrigido: Para listar TODOS, remova o argumento e use o plural
    public void listarIdosos (){
        gerIdosos.listar();
    }

    // -------------------------
    // MÉTODOS PARA FUNCIONÁRIO
    // -------------------------
    // Corrigido: Convenção de nome (camelCase)
    public void cadastrarFuncionario(Funcionario funcionario){
        gerFunc.adicionar(funcionario);
    }

    public void listarFuncionario(){
        gerFunc.listar();
    }

    // ... (alocarIdosoQuarto, agendarConsulta)
}