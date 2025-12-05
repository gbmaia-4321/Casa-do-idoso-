package gerenciadores;

import idoso.Quarto;
import java.util.ArrayList;

public class GerenciamentoQuartos {
    private ArrayList<Quarto> quartos = new ArrayList<>();

    public void cadastrarQuarto(int numero, int capacidade) {
        quartos.add(new Quarto(numero, capacidade));
    }

    public Quarto buscarPorNumero(int numero) {
        return quartos.stream()
                .filter(q -> q.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }
}
