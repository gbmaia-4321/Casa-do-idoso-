package casaidoso.gerenciadores;

import casaidoso.idoso.Idoso;

import java.util.ArrayList;

public class GerenciamentoIdosos {
    private ArrayList<Idoso> idosos = new ArrayList<>();

    public void adicionar(Idoso i) {
        idosos.add(i);
    }

    public void listar() {
        for (Idoso i : idosos) {
            System.out.println("============");
            System.out.println("==================");
            System.out.println("Nome: "+i.getNome());
            System.out.println("Idade: " + i.getIdade());
            System.out.println("==================");
        }

    }
}