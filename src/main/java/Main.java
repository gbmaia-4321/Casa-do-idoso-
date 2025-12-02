import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws DadosinvalidosException {


        GerenciamentoFuncionario gerenciamentoFuncionario = new GerenciamentoFuncionario();

        GerenciamentoIdosos gerenciamentoIdosos = new GerenciamentoIdosos();
        ArrayList<Consulta> consultas = new ArrayList<>();

        Secretaria secretaria = new Secretaria(1,"258.359.587-52","Luiz","Secretaria",gerenciamentoFuncionario,gerenciamentoIdosos);

        Medico medico = new Medico(1,"165.896.741-23","Adão","Medico",true,"Medico","Ola",consultas);

        Idoso idoso1 = new Idoso("Luiz",56);
        Consulta consulta = new Consulta(1,"15/02/2026","15:00",idoso1,medico,"Tratamento",StatusConsulta.MARCADA);
         Funcionario f = new Funcionario() {
         }

        gerenciamentoFuncionario.adicionar(secretaria);
        gerenciamentoFuncionario.adicionar(medico);
        gerenciamentoFuncionario.listar();

        gerenciamentoIdosos.adicionar(idoso1);
        gerenciamentoIdosos.listar();


        idoso1.solicitarConsulta(consulta);
        consulta.registrarConsulta();





        Receita receita = new Receita(1,"3 gotas","3 vezes ao dia","Cada 6 horas");
        Medicamento medicamento = new Medicamento(1,"Paracetamol","3 Gotas","Durante os 7 dias.");
        receita.gerarReceita(medicamento);
    }

}