package gerenciadores;

import idoso.Idoso;
import java.util.ArrayList;
import java.util.List;


public class GerenciamentoIdosos {
    private ArrayList<Idoso> idosos = new ArrayList<>();

    public Idoso cadastrar(String nome, int idade, int quarto, boolean usaInsulina) {
        Idoso novo = new Idoso(nome, idade, quarto, usaInsulina);
        idosos.add(novo);
        return novo;
    }

    public List<Idoso> listar() {
        return new ArrayList<>(idosos);
    }

    public Idoso buscarPorId(int id) {
        return idosos.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
