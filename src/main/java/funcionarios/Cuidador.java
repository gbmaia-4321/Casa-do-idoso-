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

        if (cpf == null || cpf.isBlank()){
            throw new DadosinvalidosException("O CPF do cuidadoe não pode ser vazio");
        }
    }




    public void adicionarIdoso(Idoso idoso) throws DadosinvalidosException {
        if (idoso == null) {
            throw new DadosinvalidosException("Idoso não pode ser nulo.");
        }
        idosos.add(idoso);
    }
    public ArrayList<Idoso> idosos() {
        return new ArrayList<>(idosos);

    }

    public void listarIdosos (){
        if (idosos.isEmpty()){
            System.out.println("Nenhum idoso sob responsabilidade deste cuidador.");
            return;
        }
        for (Idoso idosos : idosos){
            System.out.println(idosos);
        }

    }

    public Ocorrencia redigirOcorrencia(int idosoId, String texto) throws DadosinvalidosException {

        if (texto == null || texto.isBlank()){
            throw new DadosinvalidosException("O texto da ocorrência não pode ser vazio. ");
        }
        return new Ocorrencia(this, texto);
    }


    public void solicitarConsulta(Consulta consulta, Secretaria secretaria) throws DadosinvalidosException{
        if (consulta == null) {
            throw new DadosinvalidosException("Consulta não pode ser nula.");
        }

        if (secretaria == null) {
            throw new DadosinvalidosException("Secretaria não pode ser nula.");
        }

        secretaria.agendarConsulta(consulta);
    }


}
