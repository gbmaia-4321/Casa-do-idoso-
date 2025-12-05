package agendas;

import atividade.Atividade;
import java.util.ArrayList;

/**
 * Agenda simples para um idoso (atividades e lembretes).
 */
public class AgendaIdoso {
    private int idosoId;
    private ArrayList<Atividade> atividades = new ArrayList<>();

    public AgendaIdoso(int idosoId) {
        this.idosoId = idosoId;
    }

    public void adicionar(Atividade atividade) {
        atividades.add(atividade);
    }

    public void listarAtividades() {
        return atividades.forEach(atividade -> );
    }
}



