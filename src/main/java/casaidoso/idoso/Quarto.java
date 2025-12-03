package casaIdoso.idoso;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private int capacidade;
    private List<Integer> idsIdosos = new ArrayList<>();

    public Quarto(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() { return numero; }
    public int getCapacidade() { return capacidade; }

    public boolean adicionarIdoso(int idosoId) {
        if (idsIdosos.size() >= capacidade) return false;
        idsIdosos.add(idosoId);
        return true;
    }
}
