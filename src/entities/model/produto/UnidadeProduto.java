package entities.model.produto;

import java.util.Objects;

public class UnidadeProduto {
    private Integer codigo;
    private String nomeUnidadeProduto;

    public UnidadeProduto(Integer codigo, String nomeUnidadeProduto) {
        this.codigo = codigo;
        this.nomeUnidadeProduto = nomeUnidadeProduto.toUpperCase();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeUnidadeProduto() {
        return nomeUnidadeProduto;
    }

    public void setNomeUnidadeProduto(String nomeUnidadeProduto) {
        this.nomeUnidadeProduto = nomeUnidadeProduto.toUpperCase();
    }

    @Override
    public String toString() {
        return "UnidadeProduto{" +
                "codigo=" + codigo +
                ", nomeUnidadeProduto='" + nomeUnidadeProduto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnidadeProduto that)) return false;
        return getCodigo().equals(that.getCodigo()) && getNomeUnidadeProduto().equals(that.getNomeUnidadeProduto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getNomeUnidadeProduto());
    }
}
