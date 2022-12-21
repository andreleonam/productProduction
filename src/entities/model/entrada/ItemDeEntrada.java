package entities.model.entrada;

public class ItemDeEntrada {
    private Integer idEntrada;
    private Integer idProduto;
    private float quantidade;

    public ItemDeEntrada() {
    }
    public ItemDeEntrada( Integer idEntrada, Integer idProduto, float quantidade) {
        this.idEntrada = idEntrada;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemDeEntrada{" +
                "idEntrada=" + idEntrada +
                ", idProduto=" + idProduto +
                ", quantidade=" + quantidade +
                '}';
    }
}
