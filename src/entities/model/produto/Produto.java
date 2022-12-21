package entities.model.produto;

public class Produto {
    private Integer idProduto;
    private Integer idCategoriaProduto;
    private Integer idUnidadeProduto;
    private String descricao;

    public Produto() {
    }

    public Produto(Integer idProduto, Integer idCategoriaProduto, Integer idUnidadeProduto, String descricao) {
        this.idProduto = idProduto;
        this.idCategoriaProduto = idCategoriaProduto;
        this.idUnidadeProduto = idUnidadeProduto;
        this.descricao = descricao;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdCategoriaProduto() {
        return idCategoriaProduto;
    }

    public void setIdCategoriaProduto(Integer idCategoriaProduto) {
        this.idCategoriaProduto = idCategoriaProduto;
    }

    public Integer getIdUnidadeProduto() {
        return idUnidadeProduto;
    }

    public void setIdUnidadeProduto(Integer idUnidadeProduto) {
        this.idUnidadeProduto = idUnidadeProduto;
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
                "idProduto=" + idProduto +
                ", idCategoriaProduto=" + idCategoriaProduto +
                ", idUnidadeProduto=" + idUnidadeProduto +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
