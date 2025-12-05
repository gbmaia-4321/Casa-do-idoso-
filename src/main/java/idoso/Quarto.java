package idoso;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private int capacidade;
    private List<Integer> idsIdosos = new ArrayList<>();

    public Quarto(int numero, int capacidade){
        if (numero <= 0) {
            throw new IllegalArgumentException("O número do quarto deve ser maior que zero.");
        }

        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade do quarto deve ser maior que zero.");
        }

        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() { return numero; }
    public int getCapacidade() { return capacidade; }

    public List<Integer> getIdsIdosos() { return new ArrayList<>(idsIdosos); }

    public boolean adicionarIdoso(int idosoId) {
        if (idosoId <= 0) {
            throw new IllegalArgumentException("ID do idoso inválido.");
        }

        if (idsIdosos.contains(idosoId)) {
            throw new IllegalStateException("Este idoso já está registrado no quarto.");
        }

        if (idsIdosos.size() >= capacidade) {
            return false; // quarto cheio
        }

        idsIdosos.add(idosoId);
        return true;
    }
}
