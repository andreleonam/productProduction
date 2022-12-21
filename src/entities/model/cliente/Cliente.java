package entities.model.cliente;

import entities.enums.TipoCliente;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

abstract class Cliente {
    private Integer idCliente;
    private String nome;
    private String email;
    private TipoCliente tipoCliente;

    public Cliente(){
    }

    public Cliente(Integer idCliente, String nome, String email, TipoCliente tipoCliente) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.tipoCliente = tipoCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }
}
