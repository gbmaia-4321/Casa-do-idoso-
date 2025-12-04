package agendas;

import casaidoso.consulta.Consulta;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Simple in-memory agenda for a medico.
 */
public class AgendaMedico {
    private int medicoId;
    private List<Consulta> consultas = new ArrayList<>();

    public AgendaMedico(int medicoId) {
        this.medicoId = medicoId;
    }

    public void agendar(Consulta consulta) {
        if (!isDisponivel(consulta.getData(), consulta.getHora())) {
            throw new IllegalStateException("Horário indisponível");
        }
        consultas.add(consulta);
    }

    public boolean cancelar(Consulta consulta) {
        return consultas.remove(consulta);
    }

    public List<Consulta> listar() {
        return new ArrayList<>(consultas);
    }

    public boolean isDisponivel(Date data, String hora) {
        return consultas.stream().noneMatch(c -> c.getData().equals(data) && c.getHora().equals(hora));
    }
}
