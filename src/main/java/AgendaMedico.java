import java.util.ArrayList;

public class AgendaMedico {
    ArrayList<Consulta> consultas = new ArrayList<>();

    public void registrarConsulta(Consulta c) {
        consultas.add(c);
    }
    public void cancelarConsulta(Consulta c) {
        consultas.remove(c);
    }

    public ArrayList<Consulta> listarConsultas() {
        return consultas;
    }
}
