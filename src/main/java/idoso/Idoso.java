package idoso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import consulta.Consulta;
import medicamento.Receita;


public class Idoso {
    private static int contador = 1;

    private int id;
    private String nome;
    private int idade;
    private int quarto;
    private boolean insulinaAplicada;

    private ArrayList<Ocorrencia> ocorrencias = new ArrayList<>();
    private ArrayList<Consulta> historicoConsultas = new ArrayList<>();
    private ArrayList<Receita> receitas;

    public Idoso(String nome, int idade, int quarto, boolean insulinaAplicada) {
        this.id = contador++;
        this.nome = nome;
        this.idade = idade;
        this.quarto = quarto;
        this.insulinaAplicada = insulinaAplicada;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getQuarto() { return quarto; }
    public boolean isInsulinaAplicada() {
        return insulinaAplicada;
    }

    public void adicionarOcorrencia(idoso.Ocorrencia o) { ocorrencias.add(o); }
    public List<idoso.Ocorrencia> getOcorrencias() { return new ArrayList<>(ocorrencias); }

    public void adicionarConsultaHistorico(Consulta c) { historicoConsultas.add(c); }
    public List<Consulta> getHistoricoConsultas() { return new ArrayList<>(historicoConsultas); }

    public void adicionarReceita(Receita receita) {
        receitas.add(receita);
    }

    public ArrayList<Receita> getReceitas() {
        return receitas;
    }

    @Override
    public String toString() {
        return "Idoso{"+"id="+id+", nome='"+nome+"', idade="+idade+"}";
    }
}

