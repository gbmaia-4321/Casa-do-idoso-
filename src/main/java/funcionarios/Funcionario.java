package funcionarios;

import exceptions.DadosinvalidosException;
import exceptions.FuncionarioJaExistenteException;

/**
 * Base class for funcionarios.
 */
public abstract class Funcionario {
    protected int id;
    protected String cpf;
    protected String nome;
    protected String cargo;

    public Funcionario(int id, String cpf, String nome, String cargo) throws exceptions.DadosinvalidosException {
//         Id
        if (id <= 0) {
            throw new exceptions.DadosinvalidosException("O ID do funcionário deve ser maior que zero.");
        }
//         CPF
        if (cpf == null || cpf.isBlank()){
            throw new exceptions.DadosinvalidosException("O CPF do funcionário não pode ser vazio.");
        }
//         Nome
        if (nome == null || nome.isBlank()){
            throw new exceptions.DadosinvalidosException("O nome do funcionário não pode ser vazio.");
        }
//         Cargo
        if (cargo == null || cargo.isBlank()){
            throw new exceptions.DadosinvalidosException("O cargo do funcionário não pode ser vazio.");
        }

        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() { return id; }
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }

    public void setNome(String nome) throws exceptions.DadosinvalidosException {
        if (nome == null || nome.isBlank()) {
            throw new exceptions.DadosinvalidosException("O nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public void setCargo(String cargo) throws exceptions.DadosinvalidosException{
        if (cargo == null || cargo.isBlank()){
            throw new exceptions.DadosinvalidosException("O cargo não pode ser vazio.");
        }
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome +
                " | ID: " + id +
                " | CPF: " + cpf +
                " | Cargo: " + cargo;
    }
}
