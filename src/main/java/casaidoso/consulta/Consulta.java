package casaidoso.consulta;

import funcionarios.Medico;
import casaidoso.idoso.Idoso;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Consulta {
    private int id;
    private String dataConsulta;
    private String hora;
    Idoso idoso;
    Medico medico;
    private String descricao;
    StatusConsulta status;
    Scanner input = new Scanner(System.in);
    public Consulta(int id, String dataConsulta, String hora, Idoso idoso, Medico medico, String descricao, StatusConsulta status) {
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

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
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

    public void registrarConsulta()  {
        String arquivo = "ConsultaRegistrada"+ getId() + ".txt";



        try {
            FileWriter writer = new FileWriter(arquivo);
            writer.write("=========================Consulta=======================");
            writer.write("\nID: "+ getId());
            writer.write("\nData: "+ getDataConsulta());
            writer.write("\nHora: "+ getHora());
            writer.write("\nPaciente: " + idoso.getNome());
            writer.write("\nMedico: " + medico.getNome());
            writer.write("\nDescrição: "+ getDescricao());
            writer.write("\n========================================================");
            writer.close();
            System.out.println("Salvando consulta em " + arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void gerarRelatorio(){
        System.out.println(
                "=========================================================" + "\n"
                        +"ID: " + getId() +"\n"
                        +"Data: " + getDataConsulta() + "\n"
                        +"Hora: " + getHora() + "\n"
                        +"Paciente: " + idoso.getNome() + "\n"
                        +"Medico: " + medico.getNome() + "\n"
                        +"Descrição: " + getDescricao() + "\n"
                        +"========================================================"
        );
    }



}