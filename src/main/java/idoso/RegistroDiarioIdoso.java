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

    public RegistroDiarioIdoso(LocalDate data, LocalTime hora, double pressaoSistolica, double pressaoDiastolica, double glicose, boolean insulinaAplicada, String observacoes) {
        this.data = data;
        this.hora = hora;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.glicose = glicose;
        this.insulinaAplicada = insulinaAplicada;
        this.observacoes = observacoes;
    }

    // getters/setters omitted for brevity


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(double pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public double getPressaoDiastolica() {
        return pressaoDiastolica;
    }

    public void setPressaoDiastolica(double pressaoDiastolica) {
        this.pressaoDiastolica = pressaoDiastolica;
    }

    public double getGlicose() {
        return glicose;
    }

    public void setGlicose(double glicose) {
        this.glicose = glicose;
    }

    public boolean isInsulinaAplicada() {
        return insulinaAplicada;
    }

    public void setInsulinaAplicada(boolean insulinaAplicada) {
        this.insulinaAplicada = insulinaAplicada;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


}
