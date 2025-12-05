package app;

import gerenciadores.GerenciamentoFuncionario;
import gerenciadores.GerenciamentoIdosos;
import funcionarios.Medico;
import funcionarios.Secretaria;
import funcionarios.Cuidador;
import idoso.Idoso;
import consulta.Consulta;
import consulta.StatusConsulta;
import java.util.Date;

/**
 * Main de demonstração com fluxo básico.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        GerenciamentoFuncionario gf = new GerenciamentoFuncionario();
        GerenciamentoIdosos gi = new GerenciamentoIdosos();

        Medico medico = new Medico(1, "11111111111", "Dra. Silva", "Geriatria");
        Secretaria sec = new Secretaria(2, "22222222222", "Mariana","Secretaria");
        Cuidador cuid = new Cuidador(3, "33333333333", "João");

        gf.cadastrar(medico);
        gf.cadastrar(sec);
        gf.cadastrar(cuid);

        Idoso id1 = new Idoso(1, "Seu Antônio", 78, 101);
        gi.adicionar(id1);

        // Cuidador redige ocorrência
        idoso.Ocorrencia o1 = cuid.redigirOcorrencia(id1.getId(), "Acordou agitado");
        id1.adicionarOcorrencia(o1);

        // Cuidador solicita consulta via secretaria
        Consulta c = new Consulta(1, new Date(), "10:00", id1, medico, "Dor no joelho", StatusConsulta.AGENDADA);
        cuid.solicitarConsulta(c, sec);

        System.out.println("Consultas do medico: " + medico.getAgenda().listar().size());
        System.out.println("Ocorrencias do idoso: " + id1.getOcorrencias().size());
    }
}


