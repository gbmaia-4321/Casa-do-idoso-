import java.util.ArrayList;

public abstract class Funcionario {
 protected int id;
 protected String cpf;
 protected  String nome;
 protected String cargo;

    public Funcionario(int id, String cpf, String nome, String cargo) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    public void setCargo(String cargo) {
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
