package consulta;

import exceptions.DadosinvalidosException;
import idoso.Idoso;
import funcionarios.Medico;

import java.io.FileWriter;
import java.io.IOException;
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

    public Consulta(int id, Date data, String hora, Idoso idoso, Medico medico, String descricao, StatusConsulta status) throws DadosinvalidosException {
        if (data == null)
            throw new DadosinvalidosException("A data da consulta não pode ser nula.");

        if (hora == null || hora.isBlank())
            throw new DadosinvalidosException("A hora da consulta é obrigatória.");

        if (idoso == null)
            throw new DadosinvalidosException("A consulta deve ter um idoso associado.");

        if (medico == null)
            throw new DadosinvalidosException("A consulta deve ter um médico associado.");

        if (status == null)
            throw new DadosinvalidosException("O status da consulta não pode ser nulo.");

        this.id = contador++;
        this.data = data;
        this.hora = hora;
        this.idoso = idoso;
        this.medico = medico;
        this.descricao = descricao;
        this.status = status;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        if (data == null)
            throw new IllegalArgumentException("Nova data não pode ser nula");
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (hora == null || hora.isBlank())
            throw new IllegalArgumentException("Nova hora não pode ser vazio.");
        this.hora = hora;

    }

    public Idoso getIdoso() {
        return idoso;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusConsulta status) {
        if (status == null)
            throw new IllegalArgumentException("Status não pode ser nulo.");
        this.status = status;
    }

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


    public void registrarConsulta() {
        String arquivo = "Consulta" + getId() + ".txt";


        try {
            FileWriter writer = new FileWriter(arquivo);

            writer.write("==============Consulta================");
            writer.write("\nId= " + id);
            writer.write("\nData= " + data);
            writer.write("\nHora= " + hora);
            writer.write("\nIdoso= " + (idoso != null ? idoso.getNome() : "null"));
            writer.write("\nMedico= " + (medico != null ? medico.getNome() : "null"));
            writer.write("\nStatus= " + status);
            writer.write("\n======================================");
            writer.close();

            System.out.println("Arquivo " + arquivo + " foi criado com sucesso !");

        } catch (IOException e) {
            throw new RuntimeException(e);
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
}

