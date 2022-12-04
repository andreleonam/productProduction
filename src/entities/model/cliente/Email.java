package entities.model.cliente;

import entities.enums.TipoEmail;

public class Email {
    private Integer codigo;
    private TipoEmail tipoEmail;
    private String email;
    private Integer codigoCliente;

    public Email() {
    }

    public Email(Integer codigo, TipoEmail tipoEmail, String email, Integer codigoCliente) {
        this.codigo = codigo;
        this.tipoEmail = tipoEmail;
        this.email = email.toLowerCase();
        this.codigoCliente = codigoCliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public TipoEmail getTipoEmail() {
        return tipoEmail;
    }

    public void setTipoEmail(TipoEmail tipoEmail) {
        this.tipoEmail = tipoEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Email{" +
                "codigo=" + codigo +
                ", tipoEmail=" + tipoEmail +
                ", email='" + email + '\'' +
                ", codigoCliente=" + codigoCliente +
                '}';
    }
}
