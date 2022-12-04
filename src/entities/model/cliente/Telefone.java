package entities.model.cliente;

import entities.enums.TipoTelefone;

public class Telefone {
    private Integer codigo;
    private TipoTelefone tipoTelefone;
    private Integer ddd;
    private Integer numero;
    private Integer codigoCliente;

    public Telefone() {
    }

    public Telefone(Integer codigo, TipoTelefone tipoTelefone, Integer ddd, Integer numero, Integer codigoCliente) {
        this.codigo = codigo;
        this.tipoTelefone = tipoTelefone;
        this.ddd = ddd;
        this.numero = numero;
        this.codigoCliente = codigoCliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", tipoTelefone=" + tipoTelefone +
                ", ddd=" + ddd +
                ", numero=" + numero +
                ", codigoCliente=" + codigoCliente +
                '}';
    }
}
