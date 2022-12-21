package entities.model.cliente;

import entities.enums.TipoCliente;

public class ClientePessoaJuridica extends  Cliente{
    private Integer idClientePj;
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;

    public ClientePessoaJuridica (){
        super();
    }

    public ClientePessoaJuridica(Integer idCliente, String nome, String email, TipoCliente tipoCliente, Integer idClientePj, String cnpj, String inscricaoEstadual, String inscricaoMunicipal) {
        super(idCliente, nome, email, tipoCliente);
        this.idClientePj = idClientePj;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public Integer getIdClientePj() {
        return idClientePj;
    }

    public void setIdClientePj(Integer idClientePj) {
        this.idClientePj = idClientePj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "idClientePj=" + idClientePj +
                ", cnpj='" + cnpj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", inscricaoMunicipal='" + inscricaoMunicipal + '\'' +
                "} " + super.toString();
    }
}
