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
