import java.util.ArrayList;

public class Quarto {
    private int id;
    private int numero;
    private int capacidade;
    ArrayList<Idoso> listaIdoso = new ArrayList<>();
    Idoso senhor;

    public void adicionarIdoso(){
        System.out.println("Adicionado na lista o senhor " + senhor.getNome());
        listaIdoso.add(senhor);
        int numero = 0;
        numero ++;
        setId(numero);
        System.out.println(getId());
    }


    public void removerIdoso(){
        System.out.println("Removido o senhor " + senhor.getNome());
        System.out.println("Removido o Id " + getId());
        listaIdoso.remove(senhor);
        setId(0);
    }

    public void verLista(){
        for (Idoso listaIdoso1: listaIdoso) {
            System.out.println(" ");
            System.out.println(listaIdoso1.getNome());
            System.out.println(listaIdoso1.getIdade());
            System.out.println("========================");
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Quarto(Idoso senhor) {
        this.senhor = senhor;
    }
}





