import java.util.ArrayList;

public class Medico extends Funcionario{
    private boolean disponibilidade;
    private String especialidade;
    private String crm;
    ArrayList<Consulta> consultas = new ArrayList<>();

    public Medico(int id, String cpf, String nome, String cargo, boolean disponibilidade, String especialidade, String crm, ArrayList<Consulta> consultas) {
        super(id, cpf, nome, cargo);
        this.disponibilidade = disponibilidade;
        this.especialidade = especialidade;
        this.crm = crm;
        this.consultas = consultas;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
}
