package entities.model.saida;

import java.util.Date;

public class Saida {
    private Integer idSaida;
    private Date dataSaida;
    private String observacao;
    private Integer idPedido;

    public Saida() {
    }

    public Saida(Integer idSaida, Date dataSaida, String observacao, Integer idPedido) {
        this.idSaida = idSaida;
        this.dataSaida = dataSaida;
        this.observacao = observacao;
        this.idPedido = idPedido;
    }

    public Integer getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(Integer idSaida) {
        this.idSaida = idSaida;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public String toString() {
        return "Saida{" +
                "idSaida=" + idSaida +
                ", dataSaida=" + dataSaida +
                ", observacao='" + observacao + '\'' +
                ", idPedido=" + idPedido +
                '}';
    }
}
