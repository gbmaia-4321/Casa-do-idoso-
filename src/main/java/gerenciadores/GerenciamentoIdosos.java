package gerenciadores;

import exceptions.DadosinvalidosException;
import idoso.Idoso;
import java.util.ArrayList;
import java.util.List;


public class GerenciamentoIdosos {
    private ArrayList<Idoso> idosos = new ArrayList<>();

    public Idoso cadastrar(String nome, int idade, int quarto, boolean usaInsulina) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");

        }

        if (idade <= 0 || idade > 120) {
            throw new IllegalArgumentException("A idade deve estar entre 1 e 120 anos.");
        }

        if (quarto <= 0) {
            throw new IllegalArgumentException("O número do quarto deve ser maior que zero.");
        }


        Idoso novo = null;
        try {
            novo = new Idoso(nome, idade, quarto, usaInsulina);
        } catch (DadosinvalidosException e) {
            throw new RuntimeException(e);
        }
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
