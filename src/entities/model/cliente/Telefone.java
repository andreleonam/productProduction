package entities.model.cliente;

import entities.enums.TipoTelefone;

public class Telefone {
    private Integer codigo;
    private TipoTelefone tipoTelefone;
    private Integer ddd;
    private Integer numero;

    public Telefone() {
    }

    public Telefone(Integer codigo, TipoTelefone tipoTelefone, Integer ddd, Integer numero) {
        this.codigo = codigo;
        this.tipoTelefone = tipoTelefone;
        this.ddd = ddd;
        this.numero = numero;
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

    @Override
    public String toString() {
        return "entities.model.cliente.Telefone{" +
                "codigo=" + codigo +
                ", tipoTelefone=" + tipoTelefone +
                ", ddd=" + ddd +
                ", numero=" + numero +
                '}';
    }
}
