package funcionarios;

/**
 * Base class for funcionarios.
 */
public abstract class Funcionario {
    private static int contador = 1;


    protected int id;
    protected String cpf;
    protected String nome;
    protected Cargo cargo;

    public Funcionario(String cpf, String nome, Cargo cargo) throws exceptions.DadosinvalidosException {

//         CPF
        if (cpf == null || cpf.isBlank()){
            throw new exceptions.DadosinvalidosException("O CPF do funcionário não pode ser vazio.");
        }
//         Nome
        if (nome == null || nome.isBlank()){
            throw new exceptions.DadosinvalidosException("O nome do funcionário não pode ser vazio.");
        }
//         Cargo
        if (cargo == null){
            throw new exceptions.DadosinvalidosException("O cargo do funcionário não pode ser vazio.");
        }

        this.id = contador++;
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() { return id; }
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public Cargo getCargo() { return cargo; }

    public void setNome(String nome) throws exceptions.DadosinvalidosException {
        if (nome == null || nome.isBlank()) {
            throw new exceptions.DadosinvalidosException("O nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public void setCargo(Cargo cargo) throws exceptions.DadosinvalidosException{
        if (cargo == null){
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
