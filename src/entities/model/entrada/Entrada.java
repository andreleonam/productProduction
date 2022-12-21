package entities.model.entrada;

import entities.enums.TipoEntrada;

import java.util.Date;

public class Entrada {
    private Integer idEntrada;
    private Date dataEntrada;
    private TipoEntrada tipoEntrada;
    private String observacao;

    public Entrada() {
    }

    public Entrada(Integer idEntrada, Date dataEntrada, TipoEntrada tipoEntrada, String observacao) {
        this.idEntrada = idEntrada;
        this.dataEntrada = dataEntrada;
        this.tipoEntrada = tipoEntrada;
        this.observacao = observacao;
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "idEntrada=" + idEntrada +
                ", dataEntrada=" + dataEntrada +
                ", tipoEntrada=" + tipoEntrada +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
