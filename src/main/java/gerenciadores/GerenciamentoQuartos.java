package gerenciadores;

import idoso.Quarto;
import java.util.ArrayList;

public class GerenciamentoQuartos {

    private ArrayList<Quarto> quartos = new ArrayList<>();

    public void cadastrarQuarto(int numero, int capacidade) {
        if (numero <= 0) {
            throw new IllegalArgumentException("O número do quarto deve ser maior que zero.");
        }

        // Capacidade
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }

        if (capacidade > 6) {
            throw new IllegalArgumentException("Capacidade máxima permitida é 6 idosos por quarto.");
        }

        quartos.add(new Quarto(numero, capacidade));
    }

    public Quarto buscarPorNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("O número do quarto informado é inválido.");

        }

        return quartos.stream()
                .filter(q -> q.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }
}
