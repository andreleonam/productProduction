package entities.model.produto;

import java.util.Objects;
import java.util.PrimitiveIterator;

public class CategoriaProduto {
    private Integer codigo;
    private String nomeCategoriaProduto;

    public CategoriaProduto(Integer codigo, String nomeCategoriaProduto) {
        this.codigo = codigo;
        this.nomeCategoriaProduto = nomeCategoriaProduto.toUpperCase();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeCategoriaProduto() {
        return nomeCategoriaProduto;
    }

    public void setNomeCategoriaProduto(String nomeCategoriaProduto) {
        this.nomeCategoriaProduto = nomeCategoriaProduto.toUpperCase();
    }

    @Override
    public String toString() {
        return "CategoriaProduto{" +
                "codigo=" + codigo +
                ", nomeCategoriaProduto='" + nomeCategoriaProduto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoriaProduto that)) return false;
        return getCodigo().equals(that.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
}
