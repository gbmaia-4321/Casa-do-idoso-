package agendas;

import atividade.Atividade;
import java.util.ArrayList;

/**
 * Agenda simples para um idoso (atividades e lembretes).
 */
public class AgendaIdoso {
    private int idosoId;
    private String nome;
    private ArrayList<Atividade> atividades = new ArrayList<>();

    public AgendaIdoso(int idosoId, String nome) {
        this.idosoId = idosoId;
        this.nome = nome;
    }

    public void adicionar(Atividade atividade) {
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



