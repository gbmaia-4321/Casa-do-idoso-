package casaidoso.agendas;

import java.util.ArrayList;
import java.util.List;

/**
 * Agenda simples para um idoso (atividades e lembretes).
 */
public class AgendaIdoso {
    private int idosoId;
    private List<String> itens = new ArrayList<>();

    public AgendaIdoso(int idosoId) {
        this.idosoId = idosoId;
    }

    public void adicionar(String item) {
        itens.add(item);
    }

    public List<String> listar() {
        return new ArrayList<>(itens);
    }
}
