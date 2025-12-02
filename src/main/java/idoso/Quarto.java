package idoso;

import java.util.ArrayList;

public class Quarto {
    private int id;
    private int numero;
    private int capacidade;
    ArrayList<Idoso> idososNoQuarto = new ArrayList<>();

    public Quarto(int id, int numero, int capacidade, ArrayList<Idoso> idososNoQuarto) {
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
        this.idososNoQuarto = idososNoQuarto;
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

    public ArrayList<Idoso> getIdososNoQuarto() {
        return idososNoQuarto;
    }

    public void setIdososNoQuarto(ArrayList<Idoso> idososNoQuarto) {
        this.idososNoQuarto = idososNoQuarto;
    }


    public void addIdoso(Idoso idoso){
        idososNoQuarto.add(idoso);
    }

    public void removerIdoso(Idoso idoso){
        idososNoQuarto.remove(idoso);
    }
}
