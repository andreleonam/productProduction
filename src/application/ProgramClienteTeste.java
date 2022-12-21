package application;

import entities.enums.TipoCliente;
import entities.enums.TipoEndereco;
import entities.enums.TipoTelefone;
import entities.model.cliente.*;
import java.util.Locale;

public class ProgramClienteTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ClientePessoaFisica cpf1 = new ClientePessoaFisica(1, "ANDRE LEONAM", "ANDRELEONAM@HOTMAIL.COM", TipoCliente.PF, 1,"58948953591");
        System.out.println(cpf1);

        ClientePessoaJuridica cnpj1 = new ClientePessoaJuridica(1,"lav 60 minutos", "lav@lav60.com", TipoCliente.PJ, 1, "36535945000155", "isento", "12345678910");
        System.out.println(cnpj1);

        Endereco end1cpf1 = new Endereco(1, TipoEndereco.CASA, "rua", "armando fonte", 1500, "siqueira campos", "49082110", "conjunto costa e silva", 1);
        System.out.println(end1cpf1);

        Telefone fone1cpf1 = new Telefone(1, TipoTelefone.CELULAR, 79, 999363370, 1);
        System.out.println(fone1cpf1);
    }
}
