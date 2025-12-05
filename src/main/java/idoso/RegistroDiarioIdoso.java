package idoso;

import java.io.FileWriter;
import java.io.IOException;
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
    private int id;

    public RegistroDiarioIdoso(int id, LocalDate data, LocalTime hora, double pressaoSistolica, double pressaoDiastolica, double glicose, boolean insulinaAplicada, String observacoes) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.glicose = glicose;
        this.insulinaAplicada = insulinaAplicada;
        this.observacoes = observacoes;
    }

    // getters/setters omitted for brevity


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "=========================Registro Diario Idoso===========================\n" +
                "\nData = " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() +
                "\nHora = " + hora.getHour() + ":" + hora.getMinute() +
                "\nPressao Sistolica = " + pressaoSistolica +
                "\nPressao Diastolica = " + pressaoDiastolica +
                "\nGlicose = " + glicose +
                "\nInsulinaAplicada = " + insulinaAplicada +
                "\nObservacoes = " + observacoes +
                " " +
                "\n=======================================================================";
    }

    public void registrarDiarioIdoso() {
        String arquivo = "Registrodiarioidoso" + getId() + ".txt";


        try {
            FileWriter writer = new FileWriter(arquivo);

            writer.write("==============Consulta================");
            writer.write("\nData = " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear());
            writer.write("\nHora = " + hora.getHour() + ":" + hora.getMinute());
            writer.write("\nPressao Sistolica = " + pressaoSistolica);
            writer.write("\nPressao Diastolica = " + pressaoDiastolica);
            writer.write("\nGlicose = " + glicose);
            writer.write("\nInsulinaAplicada = " + insulinaAplicada);
            writer.write("\nObservacoes = " + observacoes);
            writer.write("\n======================================");
            writer.close();

            System.out.println("Arquivo " + arquivo + " foi criado com sucesso !");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

