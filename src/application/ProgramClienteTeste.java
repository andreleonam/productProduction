package application;

import entities.enums.TipoEmail;
import entities.enums.TipoEndereco;
import entities.enums.TipoTelefone;
import entities.model.cliente.*;
import entities.model.produto.CategoriaProduto;
import entities.model.produto.Produto;
import entities.model.produto.UnidadeProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramClienteTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ClientePessoaFisica cpf1 = new ClientePessoaFisica(1, "andre costa", "58948953591");
        ClientePessoaJuridica cnpj1 = new ClientePessoaJuridica(1, "premic", "36535945000155");

        cpf1.getEnderecos().add(new Endereco(1,TipoEndereco.CASA,"AVENIda","sao joao batista",638,"ponto novo","49097000","bl-01 ap-203",1));
        cpf1.getEnderecos().add(new Endereco(2,TipoEndereco.TRABALHO, "rua","astrogesilo santana s. filho",15,"siqueira campos","49000000","conj costa e silva",1));
        cpf1.getTelefones().add(new Telefone(1,TipoTelefone.CELULAR,79,999363370,1));
        cpf1.getTelefones().add(new Telefone(1,TipoTelefone.CASA,79,32419300,1));
        cpf1.getTelefones().add(new Telefone(1,TipoTelefone.TRABALHO,79,32413900,1));
        cpf1.getEmails().add(new Email(1, TipoEmail.CASA,"andreleonam@hotmail.com",1));
        cpf1.getEmails().add(new Email(1, TipoEmail.TRABALHO,"se01@lavanderia60minutos.com.br",1));

        System.out.println(cpf1);
        System.out.println(cnpj1);


    }
}
