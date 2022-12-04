package entities.model.cliente;

import entities.enums.TipoEndereco;

public class Endereco {
    private Integer codigo;
    private TipoEndereco tipoEndereco;
    private String logradouro;
    private String nomeRua;
    private Integer numero;
    private String bairro;
    private String cep;
    private String complemento;

    public Endereco(Integer codigo, TipoEndereco tipoEndereco, String logradouro, String nomeRua, Integer numero, String bairro, String cep, String complemento) {
        this.codigo = codigo;
        this.tipoEndereco = tipoEndereco;
        this.logradouro = logradouro.toUpperCase();
        this.nomeRua = nomeRua.toUpperCase();
        this.numero = numero;
        this.bairro = bairro.toUpperCase();
        this.cep = cep.toUpperCase();
        this.complemento = complemento.toUpperCase();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
        this.logradouro = logradouro.toUpperCase();
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua.toUpperCase();
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
        this.bairro = bairro.toUpperCase();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep.toUpperCase();
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento.toUpperCase();
    }

    @Override
    public String toString() {
        return "entities.model.cliente.Endereco{" +
                "codigo=" + codigo +
                ", tipoEndereco=" + tipoEndereco +
                ", logradouro='" + logradouro + '\'' +
                ", nomeRua='" + nomeRua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
