package casaidoso.gerenciadores;

import casaidoso.idoso.Idoso;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple in-memory manager for idosos.
 */
public class GerenciamentoIdosos {
    private List<Idoso> idosos = new ArrayList<>();

    public void adicionar(Idoso i) { idosos.add(i); }
    public List<Idoso> listar() { return new ArrayList<>(idosos); }
}
