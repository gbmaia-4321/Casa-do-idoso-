package funcionarios;

import exceptions.DadosinvalidosException;
import idoso.Idoso;
import idoso.Ocorrencia;
import consulta.Consulta;
import funcionarios.Secretaria;
import java.util.ArrayList;
import java.util.List;

/**
 * Cuidador: tem lista de ids de idosos sob responsabilidade.
 */
public class Cuidador extends funcionarios.Funcionario {

    private List<Integer> idsIdosos = new ArrayList<>();

    public Cuidador(int id, String cpf, String nome) throws DadosinvalidosException {
        super(id, cpf, nome, "Cuidador");
        if (nome == null || nome.isBlank()){
            throw new DadosinvalidosException("O nome do cuidador não pode ser vazio.");
        }
    }

    public void adicionarIdoso(int idosoId) t{ idsIdosos.add(idosoId); }
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
