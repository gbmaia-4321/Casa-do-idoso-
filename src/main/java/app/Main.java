package app;

import funcionarios.Secretaria;
import gerenciadores.GerenciamentoFuncionario;
import gerenciadores.GerenciamentoIdosos;
import idoso.Idoso;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {

        GerenciamentoFuncionario gerenciamentoFuncionario = new GerenciamentoFuncionario();

        GerenciamentoIdosos gerenciamentoIdosos = new GerenciamentoIdosos();


        Secretaria secretaria = new Secretaria(0,"589.687.257-58","Maria","funcionarios.Secretaria",gerenciamentoFuncionario, gerenciamentoIdosos);
        Idoso idoso = new Idoso("Luiz",75);


        gerenciamentoFuncionario.adicionar(secretaria);
        gerenciamentoFuncionario.listar();
        gerenciamentoIdosos.adicionar(idoso);
        gerenciamentoIdosos.listar();


    }

}