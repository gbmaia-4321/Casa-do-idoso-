package medicamento;

public class Receita {
    private String dosagem;
    private String frequencia;
    private String horario;

    public Receita(String dosagem, String frequencia, String horario) {
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.horario = horario;
    }

    public String getDosagem() {
        return dosagem;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public String getHorario() {
        return horario;
    }
}
