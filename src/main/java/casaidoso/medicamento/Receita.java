package casaidoso.medicamento;

import java.util.ArrayList;
import java.util.List;

/**
 * Receita simples: mantém lista de medicamentos.
 */
public class Receita {
    private int id;
    private int idosoId;
    private int medicoId;
    private List<Medicamento> medicamentos = new ArrayList<>();

    public Receita(int id, int idosoId, int medicoId) {
        this.id = id;
        this.idosoId = idosoId;
        this.medicoId = medicoId;
    }

    public void adicionarMedicamento(Medicamento m) { medicamentos.add(m); }
    public List<Medicamento> getMedicamentos() { return new ArrayList<>(medicamentos); }
}
