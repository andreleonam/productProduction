package entities.model.cliente;

import entities.enums.TipoTelefone;

public class Telefone {
    private Integer idTelefone;
    private TipoTelefone tipoTelefone;
    private Integer ddd;
    private Integer numero;
    private Integer idCliente;

    public Telefone() {
    }

    public Telefone(Integer idTelefone, TipoTelefone tipoTelefone, Integer ddd, Integer numero, Integer idCliente) {
        this.idTelefone = idTelefone;
        this.tipoTelefone = tipoTelefone;
        this.ddd = ddd;
        this.numero = numero;
        this.idCliente = idCliente;
    }

    public Integer getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Integer idTelefone) {
        this.idTelefone = idTelefone;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "idTelefone=" + idTelefone +
                ", tipoTelefone=" + tipoTelefone +
                ", ddd=" + ddd +
                ", numero=" + numero +
                ", idCliente=" + idCliente +
                '}';
    }
}
