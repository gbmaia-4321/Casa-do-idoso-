import java.util.ArrayList;
import java.util.Scanner;

public class Idoso {
    private int id;
    private String nome;
    private int idade;
    Scanner input = new Scanner(System.in);
    Cuidador cuidadorResponsavel;
    ArrayList<String> hitoricoConsultas = new ArrayList<>();





    public void cadastrar() {
        System.out.println("Digite o nome do idoso: ");
        setNome(input.nextLine());
        System.out.println("Digite a idade do " + getNome());
        setIdade(Integer.parseInt(input.nextLine()));
        int geradordeid = 0;
        geradordeid ++;
        setId(geradordeid);
        System.out.println(getId());
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}


