package entities.model.pedido;

public class ItemDePedido {
    private Integer idPedido;
    private Integer idProduto;
    private float quantidade;

    public ItemDePedido() {
    }

    public ItemDePedido(Integer idPedido, Integer idProduto, float quantidade) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }


    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
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
        return "ItemDePedido{" +
                "idPedido=" + idPedido +
                ", idProduto=" + idProduto +
                ", quantidade=" + quantidade +
                '}';
    }
}
