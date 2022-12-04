package entities.model.cliente;

import java.util.ArrayList;
import java.util.List;

abstract class Cliente {
    private Integer codigo;
    private String nome;

    private List<Endereco> enderecos = new ArrayList<>();
    private List<Telefone> telefones = new ArrayList<>();
    private List<Email> emails = new ArrayList<>();

    public Cliente(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome.toUpperCase();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", enderecos=" + enderecos +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
