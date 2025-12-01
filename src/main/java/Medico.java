import java.util.ArrayList;

public class Medico extends Funcionario{
    private boolean disponibilidade;
    private String especialidade;
    private String crm;
    private AgendaMedico agenda = new AgendaMedico();


    public Medico(int id, String cpf, String nome, String cargo, boolean disponibilidade, String especialidade, String crm, ArrayList<Consulta> consultas)
    throws DadosinvalidosException {

        super(id, cpf, nome, cargo);
        this.disponibilidade = disponibilidade;
        this.especialidade = especialidade;
        this.crm = crm;
        if (consultas == null) {
            throw new DadosinvalidosException("A lista de consultas não pode estar vazia.");
        }
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

    public void setEspecialidade(String especialidade) throws DadosinvalidosException {
        if (especialidade == null || especialidade.isBlank()) {
            throw new DadosinvalidosException("A especialidade do médico não pode estar vazia.");
        }
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws DadosinvalidosException {
        if (crm == null || crm.isBlank()){
            throw new DadosinvalidosException("O CRM não pode estar vazio.");
        }
        this.crm = crm;
    }


    public AgendaMedico verificarAgenda (){



    }


}
