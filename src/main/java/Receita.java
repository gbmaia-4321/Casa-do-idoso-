import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Receita {
    private int id;
    private String dosagem;
    private String frequencia;
    private String horario;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();


    public Receita(int id, String dosagem, String frequencia, String horario) {
        this.id = id;
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }



    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }



    public void gerarReceita(Medicamento medicamento){
        medicamentos.add(medicamento);

        for (Medicamento m : medicamentos){
            System.out.println("=========Receita==============");
            System.out.println("Nome: "+m.getNome());
            System.out.println("Dosagem: "+m.getDosagem());
            System.out.println("Instruções: "+m.getInstrucoes());
            System.out.println("Frequencia do remedio: "+getFrequencia());
            System.out.println("Horario: "+getHorario());
            System.out.println("==============================");
        }
        String arquivo = "Receita"+getId()+".txt";
        File file = new File(arquivo);
        try {
            file.createNewFile();

            FileWriter writer = new FileWriter(arquivo);
            writer.write("=========Receita==============");
            writer.write("\nNome: "+medicamento.getNome());
            writer.write("\nDosagem: "+medicamento.getDosagem());
            writer.write("\nInstruções: "+medicamento.getInstrucoes());
            writer.write("\nFrequencia do remedio: "+getFrequencia());
            writer.write("\nHorario: "+getHorario());
            writer.write("\n==============================");
            writer.close();
            System.out.println("Arquivo "+arquivo+" criado com sucesso");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
