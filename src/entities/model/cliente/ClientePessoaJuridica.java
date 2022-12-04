package entities.model.cliente;

public class ClientePessoaJuridica extends  Cliente{
    private String cnpj;

    public ClientePessoaJuridica(Integer codigo, String nome, String cnpj) {
        super(codigo, nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                "} " + super.toString();
    }
}
