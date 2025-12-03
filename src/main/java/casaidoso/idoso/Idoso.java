package casaidoso.idoso;

import casaidoso.consulta.Consulta;

import java.sql.Date;
import java.util.ArrayList;

public class Idoso {

    private int id;
    private String nome;
    private int idade;
    private String condicaoSaude;
    private String quarto;
    private String cuidadorResponsavel;
    private ArrayList<Consulta> historicoConsultas = new ArrayList<>();
    Consulta consulta;
    Date date;


    public Idoso(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void solicitarConsulta(Consulta consulta1){
        consulta1.gerarRelatorio();
    }

    public void visualizarConsulta(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCondicaoSaude() {
        return condicaoSaude;
    }

    public void setCondicaoSaude(String condicaoSaude) {
        this.condicaoSaude = condicaoSaude;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getCuidadorResponsavel() {
        return cuidadorResponsavel;
    }

    public void setCuidadorResponsavel(String cuidadorResponsavel) {
        this.cuidadorResponsavel = cuidadorResponsavel;
    }

    public ArrayList<Consulta> getHistoricoConsultas() {
        return historicoConsultas;
    }

    public void setHistoricoConsultas(ArrayList<Consulta> historicoConsultas) {
        this.historicoConsultas = historicoConsultas;
    }
}