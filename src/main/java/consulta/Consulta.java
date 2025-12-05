package consulta;

import idoso.Idoso;
import funcionarios.Medico;
import java.util.Date;
import java.util.Objects;

/**
 * Domain object: Consulta (POJO). No persistence, no file I/O here.
 */
public class Consulta {
    private static int contador = 1;
    private int id;
    private Date data;
    private String hora;
    private Idoso idoso;
    private Medico medico;
    private String descricao;
    private StatusConsulta status;

    public Consulta(int id, Date data, String hora, Idoso idoso, Medico medico, String descricao, StatusConsulta status) {
        this.id = contador++;
        this.data = data;
        this.hora = hora;
        this.idoso = idoso;
        this.medico = medico;
        this.descricao = descricao;
        this.status = status;
    }

    // getters and setters
    public int getId() { return id; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    public Idoso getIdoso() { return idoso; }
    public Medico getMedico() { return medico; }
    public String getDescricao() { return descricao; }
    public StatusConsulta getStatus() { return status; }
    public void setStatus(StatusConsulta status) { this.status = status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consulta)) return false;
        Consulta c = (Consulta) o;
        return id == c.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


//    public String relatorioConsulta(){
//        return "=========================================================" + "\n"
//                +"ID: " + id +"\n"
//                +"Data: " + data + "\n"
//                +"Hora: " + hora + "\n"
//                +"Paciente: " + (idoso!=null?idoso.getNome():"null") + "\n"
//                +"Medico: " + (medico!=null?medico.getNome():"null") + "\n"
//                +"Descrição: " + descricao + "\n"
//                + "Status: " + status + "\n"
//                +"========================================================";
//    }

}
