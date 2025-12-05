package idoso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import consulta.Consulta;
import exceptions.DadosinvalidosException;
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
    private ArrayList<Receita> receitas = new ArrayList<>();

    public Idoso(String nome, int idade, int quarto, boolean insulinaAplicada) throws DadosinvalidosException {

        if (nome == null || nome.isBlank()) {
            throw new DadosinvalidosException("O nome do idoso não pode ser vazio.");
        }

        if (idade <= 0 || idade > 120) {
            throw new DadosinvalidosException("Idade inválida para o idoso.");
        }

        if (quarto <= 0) {
            throw new DadosinvalidosException("Número de quarto inválido.");
        }

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

    public void adicionarOcorrencia(idoso.Ocorrencia o) {
        if (o != null) {
            ocorrencias.add(o);

        }
    }
    public List<idoso.Ocorrencia> getOcorrencias() { return new ArrayList<>(ocorrencias); }

    public void adicionarConsultaHistorico(Consulta c) {
        if (c != null)
            historicoConsultas.add(c);
    }

    public List<Consulta> getHistoricoConsultas() {
        return new ArrayList<>(historicoConsultas);
    }

    public void adicionarReceita(Receita receita) {
        if (receita != null)
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

