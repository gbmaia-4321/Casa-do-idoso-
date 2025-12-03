package casaidoso.funcionarios;

import casaidoso.exceptions.DadosInvalidosException;

/**
 * Base class for funcionarios.
 */
public abstract class Funcionario {
    protected int id;
    protected String cpf;
    protected String nome;
    protected String cargo;

    public Funcionario(int id, String cpf, String nome, String cargo) throws DadosInvalidosException {
        if (id < 0) throw new DadosInvalidosException("id não pode ser negativo");
        if (cpf == null || cpf.isBlank()) throw new DadosInvalidosException("cpf inválido");
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
