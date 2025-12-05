package medicamento;

import idoso.Idoso;

import java.util.ArrayList;
import java.util.List;

/**
 * Receita simples: mantém lista de medicamentos.
 */
public class Receita {
    private String dosagem;
    private String frequencia;
    private String horario;

    private Medicamento medicamento;  // agregação
    private Idoso idoso;              // dono da receita (relação do diagrama)

    public Receita(String dosagem, String frequencia, String horario,
                   Medicamento medicamento, Idoso idoso) {
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.horario = horario;
        this.medicamento = medicamento;
        this.idoso = idoso;
    }

    public String getDosagem() { return dosagem; }
    public String getFrequencia() { return frequencia; }
    public String getHorario() { return horario; }
    public Medicamento getMedicamento() { return medicamento; }
    public Idoso getIdoso() { return idoso; }

    @Override
    public String toString() {
        return "Medicamento: " + medicamento.getNome() +
                " | Dosagem: " + dosagem +
                " | Frequência: " + frequencia +
                " | Horário: " + horario;
    }
}

