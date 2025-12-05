package funcionarios;

import exceptions.DadosinvalidosException;
import idoso.Idoso;
import idoso.Ocorrencia;
import consulta.Consulta;

import java.util.ArrayList;

/**
 * Cuidador: tem lista de ids de idosos sob responsabilidade.
 */
public class Cuidador extends funcionarios.Funcionario {

    private ArrayList<Idoso> idosos = new ArrayList<>();

    public Cuidador( String cpf, String nome) throws DadosinvalidosException {
        super(cpf, nome, Cargo.CUIDADOR);
        if (nome == null || nome.isBlank()){
            throw new DadosinvalidosException("O nome do cuidador não pode ser vazio.");
        }
    }




    public void adicionarIdoso(Idoso idoso) { idosos.add(idoso); };
    public ArrayList<Idoso> idosos() { return new ArrayList<>(idosos); }

    public void listarIdosos (){
        for (Idoso idosos : idosos){
            System.out.println(idosos);
        }

    }

    public Ocorrencia redigirOcorrencia(int idosoId, String texto) {
        // cria ocorrência (autor será este cuidador)
        Ocorrencia o = new Ocorrencia(this, texto);
        return o;
    }

    public void solicitarConsulta(Consulta consulta, Secretaria secretaria) {
        secretaria.agendarConsulta(consulta);
    }


}
