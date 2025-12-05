package gerenciadores;

import consulta.Consulta;
import consulta.StatusConsulta;
import funcionarios.Medico;
import idoso.Idoso;
import java.util.ArrayList;
import java.util.Date;

public class GerenciamentoConsultas extends consulta.Consulta {
    private ArrayList<Consulta> consultas = new ArrayList<>();


    public GerenciamentoConsultas(int id, Date data, String hora, Idoso idoso, Medico medico, String descricao, StatusConsulta status, ArrayList<Consulta> consultas) {
        super(id, data, hora, idoso, medico, descricao, status);
        this.consultas = consultas;
    }

    public void registrarConsulta (Consulta consulta){
        consultas.add(consulta);
    };

    public String relatorioConsulta(){
        return "=========================================================" + "\n"
                +"ID: " + getId() +"\n"
                +"Data: " + getData() + "\n"
                +"Hora: " + getHora() + "\n"
                +"Paciente: " + (getIdoso()!=null? getIdoso().getNome():"null") + "\n"
                +"Medico: " + (getMedico()!=null?getMedico().getNome():"null") + "\n"
                +"Descrição: " + getDescricao() + "\n"
                + "Status: " + getStatus() + "\n"
                +"========================================================";
    }



}
