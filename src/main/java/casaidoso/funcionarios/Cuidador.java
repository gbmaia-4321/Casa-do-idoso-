package casaidoso.funcionarios;

import casaidoso.idoso.Idoso;
import casaidoso.idoso.Ocorrencia;
import casaidoso.consulta.Consulta;
import casaidoso.funcionarios.Secretaria;
import java.util.ArrayList;
import java.util.List;

/**
 * Cuidador: tem lista de ids de idosos sob responsabilidade.
 */
public class Cuidador extends Funcionario {
    private List<Integer> idsIdosos = new ArrayList<>();

    public Cuidador(int id, String cpf, String nome) throws Exception {
        super(id, cpf, nome, "Cuidador");
    }

    public void adicionarIdoso(int idosoId) { idsIdosos.add(idosoId); }
    public List<Integer> getIdsIdosos() { return new ArrayList<>(idsIdosos); }

    public Ocorrencia redigirOcorrencia(int idosoId, String texto) {
        // cria ocorrência (autor será este cuidador)
        Ocorrencia o = new Ocorrencia(this, texto);
        return o;
    }

    public void solicitarConsulta(Consulta consulta, Secretaria secretaria) {
        secretaria.agendarConsulta(consulta);
    }
}
