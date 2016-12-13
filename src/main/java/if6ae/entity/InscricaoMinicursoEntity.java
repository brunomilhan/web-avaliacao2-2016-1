package if6ae.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by bruno on 13/12/16.
 */
@Entity
@Table(name = "inscricao_minicurso", schema = "public", catalog = "cema")
@IdClass(InscricaoMinicursoEntityPK.class)
public class InscricaoMinicursoEntity {
    private int numeroInscricao;
    private int minicurso;
    private Timestamp dataHora;
    private int situacao;
    private InscricaoEntity inscricaoByNumeroInscricao;

    @Id
    @Column(name = "numero_inscricao", nullable = false)
    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    @Id
    @Column(name = "minicurso", nullable = false)
    public int getMinicurso() {
        return minicurso;
    }

    public void setMinicurso(int minicurso) {
        this.minicurso = minicurso;
    }

    @Basic
    @Column(name = "data_hora", nullable = false)
    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    @Basic
    @Column(name = "situacao", nullable = false)
    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InscricaoMinicursoEntity that = (InscricaoMinicursoEntity) o;

        if (numeroInscricao != that.numeroInscricao) return false;
        if (minicurso != that.minicurso) return false;
        if (situacao != that.situacao) return false;
        if (dataHora != null ? !dataHora.equals(that.dataHora) : that.dataHora != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroInscricao;
        result = 31 * result + minicurso;
        result = 31 * result + (dataHora != null ? dataHora.hashCode() : 0);
        result = 31 * result + situacao;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "numero_inscricao", referencedColumnName = "numero", nullable = false)
    public InscricaoEntity getInscricaoByNumeroInscricao() {
        return inscricaoByNumeroInscricao;
    }

    public void setInscricaoByNumeroInscricao(InscricaoEntity inscricaoByNumeroInscricao) {
        this.inscricaoByNumeroInscricao = inscricaoByNumeroInscricao;
    }
}
