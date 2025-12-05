package agendas;

import atividade.Atividade;
import exceptions.DadosinvalidosException;

import java.util.ArrayList;

/**
 * Agenda simples para um idoso (atividades e lembretes).
 */
public class AgendaIdoso {
    private int idosoId;
    private String nome;
    private ArrayList<Atividade> atividades = new ArrayList<>();

    public AgendaIdoso(int idosoId, String nome) throws DadosinvalidosException {
        if (idosoId < 0) {
            throw new DadosinvalidosException("O id do idoso não pode ser negativo.");
        }
        if (nome == null || nome.isBlank()){
            throw new DadosinvalidosException("O nome do idoso não pode ser nulo ou vazio.");
        }

        this.idosoId = idosoId;
        this.nome = nome;
    }

    public void adicionar(Atividade atividade) throws DadosinvalidosException{
        if (atividade == null){
            throw new DadosinvalidosException("Atividade não pode ser nula.");
        }
        atividades.add(atividade);
    }

    public void listarAtividades() {
        System.out.println("\n--- Agenda do Idoso: "  +this.nome + " ID: " + this.idosoId + " ---");
        if (atividades.isEmpty()) {
            System.out.println("Nenhuma atividade registrada.");
            return;
        }

        for(Atividade atividade : atividades){
            // O System.out.println(atividade) chama implicitamente o toString() de Atividade
            System.out.println(atividade);
        }
    }
}



