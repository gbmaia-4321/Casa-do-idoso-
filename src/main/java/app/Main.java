package app;

import gerenciadores.GerenciamentoFuncionario;
import gerenciadores.GerenciamentoIdosos;
import funcionarios.Medico;
import funcionarios.Secretaria;
import funcionarios.Cuidador;
import gerenciadores.GerenciamentoQuartos;
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
        GerenciamentoQuartos gerQ = new GerenciamentoQuartos();

        Medico medico = new Medico("11111111111", "Dra. Silva", "Geriatria");
        Secretaria sec = new Secretaria( "22222222222", "Mariana",);
        Cuidador cuid = new Cuidador( "33333333333", "João");

        gf.cadastrar(medico.getCpf(),medico.getNome(),medico.getCargo(),medico.getEspecialidade());
        gf.cadastrar(sec.getCpf(),sec.getNome(),sec.getCargo(),"");
        gf.cadastrar(cuid.getCpf(), cuid.getNome(), cuid.getCargo(),"");

        Idoso id1 = new Idoso("Seu Antônio",78, 200,true);
        gi.cadastrar(id1.getNome(), id1.getIdade(),200,true);

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


