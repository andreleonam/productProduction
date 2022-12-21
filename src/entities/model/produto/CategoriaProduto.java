package entities.model.produto;

public class CategoriaProduto {
    private Integer idCategoriaProduto;
    private String descricao;

    public CategoriaProduto() {
    }

    public CategoriaProduto(Integer idCategoriaProduto, String descricao) {
        this.idCategoriaProduto = idCategoriaProduto;
        this.descricao = descricao;
    }

    public Integer getIdCategoriaProduto() {
        return idCategoriaProduto;
    }

    public void setIdCategoriaProduto(Integer idCategoriaProduto) {
        this.idCategoriaProduto = idCategoriaProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "CategoriaProduto{" +
                "idCategoriaProduto=" + idCategoriaProduto +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
