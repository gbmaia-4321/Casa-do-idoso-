package funcionarios;

import java.util.ArrayList;

public class Cuidador {
    ArrayList<Idoso> idososCuidador = new ArrayList<>();

    public Cuidador(ArrayList<Idoso> idososCuidador) {
        this.idososCuidador = idososCuidador;
    }

    public ArrayList<Idoso> listarIdosos(){
        return idososCuidador;
    }

    public String redigirProblemaSobreIdoso(){

    }

}
