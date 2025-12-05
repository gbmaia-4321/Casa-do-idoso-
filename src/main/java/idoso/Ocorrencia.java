package idoso;

import funcionarios.Cuidador;
import java.util.Date;

/**
 * Occurrence/Note created by a cuidador or system about an idoso.
 */
public class Ocorrencia {
    private Date data;
    private Cuidador autor;
    private String descricao;

    public Ocorrencia(Cuidador autor, String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição da ocorrência não pode ser vazia.");
        }

        if (descricao.length() < 5) {
            throw new IllegalArgumentException("A descrição deve ter pelo menos 5 caracteres.");
        }

        // Não obriga autor (pois pode ser sistema), mas se fornecido, valida
        if (autor != null && (autor.getNome() == null || autor.getNome().trim().isEmpty())) {
            throw new IllegalArgumentException("O nome do cuidador é inválido.");
        }

        this.data = new Date();
        this.autor = autor;
        this.descricao = descricao;
    }

    public Date getData() { return data; }
    public Cuidador getAutor() { return autor; }
    public String getDescricao() { return descricao; }

    @Override
    public String toString() {
        return "["+data+"] "+(autor!=null?autor.getNome():"Sistema")+": "+descricao;
    }
}
