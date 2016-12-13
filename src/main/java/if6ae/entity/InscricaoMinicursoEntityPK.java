package if6ae.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bruno on 13/12/16.
 */
public class InscricaoMinicursoEntityPK implements Serializable {
    private int numeroInscricao;
    private int minicurso;

    @Column(name = "numero_inscricao", nullable = false)
    @Id
    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    @Column(name = "minicurso", nullable = false)
    @Id
    public int getMinicurso() {
        return minicurso;
    }

    public void setMinicurso(int minicurso) {
        this.minicurso = minicurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InscricaoMinicursoEntityPK that = (InscricaoMinicursoEntityPK) o;

        if (numeroInscricao != that.numeroInscricao) return false;
        if (minicurso != that.minicurso) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroInscricao;
        result = 31 * result + minicurso;
        return result;
    }
}
