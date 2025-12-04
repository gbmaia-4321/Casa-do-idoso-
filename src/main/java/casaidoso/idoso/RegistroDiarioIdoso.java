package idoso;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Registro diário com métricas simples.
 */
public class RegistroDiarioIdoso {
    private LocalDate data;
    private LocalTime hora;
    private double pressaoSistolica;
    private double pressaoDiastolica;
    private double glicose;
    private boolean insulinaAplicada;
    private String observacoes;

    public RegistroDiarioIdoso(LocalDate data, LocalTime hora) {
        this.data = data;
        this.hora = hora;
    }

    // getters/setters omitted for brevity
}
