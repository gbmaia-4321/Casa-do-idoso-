package consulta;

import funcionarios.Medico;
import idoso.Idoso;

import java.util.Date;

public class Consulta {
    private int id;
    private Date dataConsulta;
    private String hora;
    Idoso idoso;
    Medico medico;
    private String descricao;
    StatusConsulta status;

    public Consulta() {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.hora = hora;
        this.idoso = idoso;
        this.medico = medico;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Idoso getIdoso() {
        return idoso;
    }

    public void setIdoso(Idoso idoso) {
        this.idoso = idoso;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusConsulta status) {
        this.status = status;
    }


    public String relatorioConsulta(){
        return "=========================================================" + "\n"
                +"ID: " + id +"\n"
                +"Data: " + dataConsulta + "\n"
                +"Hora: " + hora + "\n"
                +"Paciente: " + idoso + "\n"
                +"funcionarios.Medico: " + medico + "\n"
                +"Descrição: " + descricao + "\n"
                +"========================================================";
    }


}
