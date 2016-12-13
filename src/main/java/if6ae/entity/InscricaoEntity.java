package if6ae.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by bruno on 13/12/16.
 */
@Entity
@Table(name = "inscricao", schema = "public", catalog = "cema")
public class InscricaoEntity {
    private int numero;
    private int cpf;
    private String complementoCategoria;
    private String atuacaoEmpresa;
    private String nome;
    private String fone;
    private String email;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private boolean participacao;
    private Timestamp dataHora;
    private int situacao;

    @Id
    @Column(name = "numero", nullable = false)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "cpf", nullable = false, precision = 0)
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Basic
    @Column(name = "complemento_categoria", nullable = false, length = 50)
    public String getComplementoCategoria() {
        return complementoCategoria;
    }

    public void setComplementoCategoria(String complementoCategoria) {
        this.complementoCategoria = complementoCategoria;
    }

    @Basic
    @Column(name = "atuacao_empresa", nullable = true, length = 50)
    public String getAtuacaoEmpresa() {
        return atuacaoEmpresa;
    }

    public void setAtuacaoEmpresa(String atuacaoEmpresa) {
        this.atuacaoEmpresa = atuacaoEmpresa;
    }

    @Basic
    @Column(name = "nome", nullable = false, length = 50)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "fone", nullable = false, length = 20)
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "endereco", nullable = false, length = 100)
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Basic
    @Column(name = "complemento", nullable = true, length = 20)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Basic
    @Column(name = "bairro", nullable = true, length = 50)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Basic
    @Column(name = "cidade", nullable = false, length = 50)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Basic
    @Column(name = "estado", nullable = false, length = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "cep", nullable = false)
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Basic
    @Column(name = "participacao", nullable = false)
    public boolean isParticipacao() {
        return participacao;
    }

    public void setParticipacao(boolean participacao) {
        this.participacao = participacao;
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

        InscricaoEntity that = (InscricaoEntity) o;

        if (numero != that.numero) return false;
        if (cpf != that.cpf) return false;
        if (cep != that.cep) return false;
        if (participacao != that.participacao) return false;
        if (situacao != that.situacao) return false;
        if (complementoCategoria != null ? !complementoCategoria.equals(that.complementoCategoria) : that.complementoCategoria != null)
            return false;
        if (atuacaoEmpresa != null ? !atuacaoEmpresa.equals(that.atuacaoEmpresa) : that.atuacaoEmpresa != null)
            return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (fone != null ? !fone.equals(that.fone) : that.fone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (endereco != null ? !endereco.equals(that.endereco) : that.endereco != null) return false;
        if (complemento != null ? !complemento.equals(that.complemento) : that.complemento != null) return false;
        if (bairro != null ? !bairro.equals(that.bairro) : that.bairro != null) return false;
        if (cidade != null ? !cidade.equals(that.cidade) : that.cidade != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (dataHora != null ? !dataHora.equals(that.dataHora) : that.dataHora != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numero;
        result = 31 * result + cpf;
        result = 31 * result + (complementoCategoria != null ? complementoCategoria.hashCode() : 0);
        result = 31 * result + (atuacaoEmpresa != null ? atuacaoEmpresa.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (fone != null ? fone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (complemento != null ? complemento.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + cep;
        result = 31 * result + (participacao ? 1 : 0);
        result = 31 * result + (dataHora != null ? dataHora.hashCode() : 0);
        result = 31 * result + situacao;
        return result;
    }
}
