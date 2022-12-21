package entities.model.cliente;

import entities.enums.TipoEndereco;

public class Endereco {
    private Integer idEndereco;
    private TipoEndereco tipoEndereco;
    private String logradouro;
    private String nomeRua;
    private Integer numero;
    private String bairro;
    private String cep;
    private String complemento;
    private Integer idCliente;

    public Endereco() {
    }

    public Endereco(Integer idEndereco, TipoEndereco tipoEndereco, String logradouro, String nomeRua, Integer numero, String bairro, String cep, String complemento, Integer idCliente) {
        this.idEndereco = idEndereco;
        this.tipoEndereco = tipoEndereco;
        this.logradouro = logradouro;
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.idCliente = idCliente;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "idEndereco=" + idEndereco +
                ", tipoEndereco=" + tipoEndereco +
                ", logradouro='" + logradouro + '\'' +
                ", nomeRua='" + nomeRua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", complemento='" + complemento + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
