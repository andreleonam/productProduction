package entities.model.produto;

import java.util.Objects;

public class UnidadeProduto {
    private Integer idUnidadeProduto;
    private String sigla;
    private String medida;

    public UnidadeProduto() {
    }

    public UnidadeProduto(Integer idUnidadeProduto, String sigla, String medida) {
        this.idUnidadeProduto = idUnidadeProduto;
        this.sigla = sigla;
        this.medida = medida;
    }

    public Integer getIdUnidadeProduto() {
        return idUnidadeProduto;
    }

    public void setIdUnidadeProduto(Integer idUnidadeProduto) {
        this.idUnidadeProduto = idUnidadeProduto;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "UnidadeProduto{" +
                "idUnidadeProduto=" + idUnidadeProduto +
                ", sigla='" + sigla + '\'' +
                ", medida='" + medida + '\'' +
                '}';
    }
}
