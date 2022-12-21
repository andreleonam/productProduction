package entities.model.saida;

public class ItemDeSaida {
    private Integer idProduto;
    private Integer idSaida;
    private float quantidade;

    public ItemDeSaida() {
    }

    public ItemDeSaida(Integer idProduto, Integer idSaida, float quantidade) {
        this.idProduto = idProduto;
        this.idSaida = idSaida;
        this.quantidade = quantidade;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(Integer idSaida) {
        this.idSaida = idSaida;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemDeSaida{" +
                "idProduto=" + idProduto +
                ", idSaida=" + idSaida +
                ", quantidade=" + quantidade +
                '}';
    }
}
