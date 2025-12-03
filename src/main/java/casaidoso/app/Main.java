package casaidoso.app;

import casaidoso.gerenciadores.GerenciamentoFuncionario;
import casaidoso.gerenciadores.GerenciamentoIdosos;
import casaidoso.funcionarios.Medico;
import casaidoso.funcionarios.Secretaria;
import casaidoso.funcionarios.Cuidador;
import casaidoso.idoso.Idoso;
import casaidoso.consulta.Consulta;
import casaidoso.consulta.StatusConsulta;
import java.util.Date;

/**
 * Main de demonstração com fluxo básico.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        GerenciamentoFuncionario gf = new GerenciamentoFuncionario();
        GerenciamentoIdosos gi = new GerenciamentoIdosos();

        Medico medico = new Medico(1, "11111111111", "Dra. Silva", "Geriatria");
        Secretaria sec = new Secretaria(2, "22222222222", "Mariana");
        Cuidador cuid = new Cuidador(3, "33333333333", "João");

        gf.adicionar(medico);
        gf.adicionar(sec);
        gf.adicionar(cuid);

        Idoso id1 = new Idoso(1, "Seu Antônio", 78, 101);
        gi.adicionar(id1);

        // Cuidador redige ocorrência
        casaidoso.idoso.Ocorrencia o = cuid.redigirOcorrencia(id1.getId(), "Acordou agitado");
        id1.adicionarOcorrencia(o);

        // Cuidador solicita consulta via secretaria
        Consulta c = new Consulta(1, new Date(), "10:00", id1, medico, "Dor no joelho", StatusConsulta.AGENDADA);
        cuid.solicitarConsulta(c, sec);

        System.out.println("Consultas do medico: " + medico.getAgenda().listar().size());
        System.out.println("Ocorrencias do idoso: " + id1.getOcorrencias().size());
    }
}
