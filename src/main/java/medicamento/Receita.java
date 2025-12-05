package medicamento;

import idoso.Idoso;

import java.io.FileWriter;
import java.io.IOException;
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
        return  "====================Receita========================" +
                "\nMedicamento: " + medicamento.getNome() +
                "\nDosagem: " + dosagem +
                "\nFrequência: " + frequencia +
                "\nHorário: " + horario +
                "==================================================";
    }

    public void geraReceita(){
        String arquivo = "Receita" + medicamento.getId() + ".txt";


        try {
            FileWriter writer = new FileWriter(arquivo);
            writer.write("==================Receita======================");
            writer.write("\nMedicamento: " + medicamento.getNome());
            writer.write("\nDosagem: " + dosagem );
            writer.write("\nFrequência: " + frequencia);
            writer.write("\nHorário: " + horario);
            writer.write("===============================================");
            writer.close();

            System.out.println("Arquivo " + arquivo + " foi criado com sucesso !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

