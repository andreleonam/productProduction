package entities.model.pedido;

import entities.enums.StatusDoPedido;
import entities.enums.TipoFrete;

import java.util.Date;

public class Pedido {
    private Integer idPedido;
    private Date dataPedido;
    private Date dataEntrega;
    private TipoFrete tipoFrete;
    private StatusDoPedido statusDoPedido;
    private String observacao;
    private Integer idCliente;
    private Integer idEndereco;

    public Pedido() {
    }

    public Pedido(Integer idPedido, Date dataPedido, Date dataEntrega, TipoFrete tipoFrete, StatusDoPedido statusDoPedido, String observacao, Integer idCliente, Integer idEndereco) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.tipoFrete = tipoFrete;
        this.statusDoPedido = statusDoPedido;
        this.observacao = observacao;
        this.idCliente = idCliente;
        this.idEndereco = idEndereco;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public TipoFrete getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(TipoFrete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public StatusDoPedido getStatusDoPedido() {
        return statusDoPedido;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", dataPedido=" + dataPedido +
                ", dataEntrega=" + dataEntrega +
                ", tipoFrete=" + tipoFrete +
                ", statusDoPedido=" + statusDoPedido +
                ", observacao='" + observacao + '\'' +
                ", idCliente=" + idCliente +
                ", idEndereco=" + idEndereco +
                '}';
    }
}
