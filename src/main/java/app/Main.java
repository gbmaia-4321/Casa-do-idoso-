package app;

import gerenciadores.GerenciamentoConsultas;
import gerenciadores.GerenciamentoFuncionario;
import gerenciadores.GerenciamentoIdosos;
import funcionarios.Medico;
import funcionarios.Secretaria;
import funcionarios.Cuidador;
import gerenciadores.GerenciamentoQuartos;
import idoso.Idoso;
import consulta.Consulta;
import consulta.StatusConsulta;
import idoso.RegistroDiarioIdoso;
import medicamento.Medicamento;
import medicamento.Receita;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Main de demonstração com fluxo básico.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Chamando alguma classes do projeto e classes de biblioteca


        Medicamento medicamento = new Medicamento(1,"Parecetamol","3 vezes","Uso diario ate em 7 dias");
        Scanner input = new Scanner(System.in);
        ArrayList<Consulta> listaConsulta = new ArrayList<>();
        Date date = new Date();
        GerenciamentoFuncionario gf = new GerenciamentoFuncionario();
        GerenciamentoIdosos gi = new GerenciamentoIdosos();
        GerenciamentoQuartos gerQ = new GerenciamentoQuartos();

        // Adicionando Funcionario no sistema

        Medico medico = new Medico("11111111111", "Dra. Silva", "Geriatria");
        Secretaria sec = new Secretaria( "22222222222", "Mariana",gi,gf,gerQ);
        Cuidador cuid = new Cuidador( "33333333333", "João");

        gf.cadastrar(medico.getCpf(),medico.getNome(),medico.getCargo(),medico.getEspecialidade());
        gf.cadastrar(sec.getCpf(),sec.getNome(),sec.getCargo(),"");
        gf.cadastrar(cuid.getCpf(), cuid.getNome(), cuid.getCargo(),"");

        //Inicio
        System.out.println("Seja bem vindo a casa de idoso!");
        System.out.println("Digite o nome do idoso: ");
        String nome = input.nextLine();

        System.out.println("Digite a idade do "+ nome);
        int idade = Integer.parseInt(input.nextLine());

        System.out.println("Digite o numero do quarto: ");
        int numero_quarto = Integer.parseInt(input.nextLine());

        System.out.println("A insulina foi aplicada no idoso ?");
        String pergunta_insulina = input.nextLine();
        boolean insulina = pergunta_insulina.equalsIgnoreCase("sim");



        Idoso id1 = new Idoso(nome,idade, numero_quarto,insulina);
        gi.cadastrar(id1.getNome(), id1.getIdade(),numero_quarto,insulina);

        // Cuidador redige ocorrência

        idoso.Ocorrencia o1 = cuid.redigirOcorrencia(id1.getId(), "Acordou agitado");
        id1.adicionarOcorrencia(o1);
        RegistroDiarioIdoso registroDiarioIdoso = new RegistroDiarioIdoso(1,LocalDate.now(),LocalTime.now(),120.0,80.0,90.5,true,"Tudo Ok !");
        System.out.println(registroDiarioIdoso.toString());
        registroDiarioIdoso.registrarDiarioIdoso();

        // Cuidador solicita consulta via secretaria
        Consulta c = new Consulta(1, new Date(), "15:00", id1, medico, "Dor no joelho", StatusConsulta.AGENDADA);
        cuid.solicitarConsulta(c, sec);
        Receita receita = new Receita("5mg","3 vezes ao dia","5 horas",medicamento,id1);
        System.out.println(receita.toString());
        receita.geraReceita();


        System.out.println("Consultas do medico: " + medico.getAgenda().listar().size());
        System.out.println("Ocorrencias do idoso: " + id1.getOcorrencias().size());
        GerenciamentoConsultas gc = new GerenciamentoConsultas(1, new Date(),"14:50", id1,medico,"Paciente estar com problema de pressão",StatusConsulta.AGENDADA, listaConsulta);
        System.out.println(gc.relatorioConsulta());

    }
}


