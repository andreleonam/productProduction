package entities.model.cliente;

import entities.enums.TipoCliente;

public class ClientePessoaFisica extends Cliente{
    private Integer idClientePf;
    private String cpf;

    public ClientePessoaFisica() {
        super();
    }

    public ClientePessoaFisica(Integer idCliente, String nome, String email, TipoCliente tipoCliente, Integer idClientePf, String cpf) {
        super(idCliente, nome, email, tipoCliente);
        this.idClientePf = idClientePf;
        this.cpf = cpf;
    }

    public Integer getIdClientePf() {
        return idClientePf;
    }

    public void setIdClientePf(Integer idClientePf) {
        this.idClientePf = idClientePf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisica{" +
                "idClientePf=" + idClientePf +
                ", cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
