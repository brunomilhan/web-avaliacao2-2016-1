package if6ae.entity;

import javax.persistence.*;

/**
 * Created by bruno on 13/12/16.
 */
@Entity
@Table(name = "minicurso", schema = "public", catalog = "cema")
public class MinicursoEntity {
    private int codigo;
    private String descricao;
    private String ministrante;
    private int vagas;

    @Id
    @Column(name = "codigo", nullable = false)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "descricao", nullable = false, length = -1)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Basic
    @Column(name = "ministrante", nullable = false, length = -1)
    public String getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(String ministrante) {
        this.ministrante = ministrante;
    }

    @Basic
    @Column(name = "vagas", nullable = false)
    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MinicursoEntity that = (MinicursoEntity) o;

        if (codigo != that.codigo) return false;
        if (vagas != that.vagas) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        if (ministrante != null ? !ministrante.equals(that.ministrante) : that.ministrante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (ministrante != null ? ministrante.hashCode() : 0);
        result = 31 * result + vagas;
        return result;
    }
}
