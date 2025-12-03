package casaIdoso.funcionarios;

import casaIdoso.exceptions.DadosinvalidosException;

/**
 * Base class for funcionarios.
 */
public abstract class Funcionario {
    protected int id;
    protected String cpf;
    protected String nome;
    protected String cargo;

    public Funcionario(int id, String cpf, String nome, String cargo) throws DadosinvalidosException {
        if (id < 0) throw new DadosinvalidosException("id não pode ser negativo");
        if (cpf == null || cpf.isBlank()) throw new DadosinvalidosException("cpf inválido");
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() { return id; }
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return nome + " (" + cargo + ")";
    }
}
