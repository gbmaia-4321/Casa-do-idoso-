package idoso;

import java.util.ArrayList;
import java.util.List;
import consulta.Consulta;


public class Idoso {
    private int id;
    private String nome;
    private int idade;
    private int quarto;
    private List<idoso.Ocorrencia> ocorrencias = new ArrayList<>();
    private List<Consulta> historicoConsultas = new ArrayList<>();

    public Idoso(int id, String nome, int idade, int quarto) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.quarto = quarto;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getQuarto() { return quarto; }

    public void adicionarOcorrencia(idoso.Ocorrencia o) { ocorrencias.add(o); }
    public List<idoso.Ocorrencia> getOcorrencias() { return new ArrayList<>(ocorrencias); }

    public void adicionarConsultaHistorico(Consulta c) { historicoConsultas.add(c); }
    public List<Consulta> getHistoricoConsultas() { return new ArrayList<>(historicoConsultas); }

    @Override
    public String toString() {
        return "Idoso{"+"id="+id+", nome='"+nome+"', idade="+idade+"}";
    }
}
