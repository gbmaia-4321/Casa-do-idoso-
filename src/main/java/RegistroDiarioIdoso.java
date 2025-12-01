import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroDiarioIdoso {
    private LocalDate data; // Use LocalDate para a data
    private LocalTime hora; // Use LocalTime para a hora

    // Métricas de saúde
    private double pressaoSistolica; // Medida da pressão
    private double pressaoDiastolica;
    private double glicose;
    private boolean insulinaAplicada;
    private double temperatura;
    private String observacoes;

    // Construtor

    public RegistroDiarioIdoso(LocalDate data, LocalTime hora, double pressaoSistolica, double pressaoDiastolica, double glicose, boolean insulinaAplicada, double temperatura, String observacoes) {
        this.data = data;
        this.hora = hora;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.glicose = glicose;
        this.insulinaAplicada = insulinaAplicada;
        this.temperatura = temperatura;
        this.observacoes = observacoes;
    }

    //Getters e Setters


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

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}