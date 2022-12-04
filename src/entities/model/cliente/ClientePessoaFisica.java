package entities.model.cliente;

public class ClientePessoaFisica extends Cliente{
    private String cpf;

    public ClientePessoaFisica(Integer codigo, String nome, String cpf) {
        super(codigo, nome);
        this.cpf = cpf;
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
                "cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
