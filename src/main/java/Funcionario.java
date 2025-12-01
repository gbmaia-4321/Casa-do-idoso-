import java.util.ArrayList;

public abstract class Funcionario {
 protected int id;
 protected String cpf;
 protected  String nome;
 protected String cargo;

    public Funcionario(int id, String cpf, String nome, String cargo) throws DadosinvalidosException {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws DadosinvalidosException {
        if (id < 0){
            throw new DadosinvalidosException("O id não pode ser negativo.");
        }
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws DadosinvalidosException {
        if (cpf == null || cpf.isBlank()){
            throw new DadosinvalidosException("Cpf não pode estar vazio.");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws DadosinvalidosException {
        if (nome == null || cargo.isBlank()) {
            throw new DadosinvalidosException("O cargo não pode estar vazio.");
        }
        this.cargo = cargo;
    }

    public void registrarPresenca(){

 }


    public String ExibirInformacoes() {
        return "Funcionario: " + nome +"\n"+
                "Id: " + id + "\n"+
                "Cpf: " +cpf + "\n"+
                "Cargo: "+cargo +"\n";
    }
}
