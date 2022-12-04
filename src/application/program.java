package application;

import entities.model.cliente.ClientePessoaFisica;
import entities.model.cliente.ClientePessoaJuridica;
import entities.model.produto.CategoriaProduto;
import entities.model.produto.Produto;
import entities.model.produto.UnidadeProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ClientePessoaFisica cpf1 = new ClientePessoaFisica(1, "andre costa", "58948953591");
        ClientePessoaJuridica cnpj1 = new ClientePessoaJuridica(1, "premic", "36535945000155");

        System.out.println(cpf1);
        System.out.println(cnpj1);

        UnidadeProduto uniProd1 = new UnidadeProduto(1, "pç");
        UnidadeProduto uniProd2 = new UnidadeProduto(2, "sc");
        UnidadeProduto uniProd3 = new UnidadeProduto(3, "m2");

        List<UnidadeProduto> uniProdList = new ArrayList<>();
        uniProdList.add(uniProd1);
        uniProdList.add(uniProd2);
        uniProdList.add(uniProd3);

        CategoriaProduto catProd1 = new CategoriaProduto(1, "mourao");
        CategoriaProduto catProd2 = new CategoriaProduto(2, "tg8l");
        CategoriaProduto catProd3 = new CategoriaProduto(3, "tg8m");

        List<CategoriaProduto> catProdList = new ArrayList<>();
        catProdList.add(catProd1);
        catProdList.add(catProd2);
        catProdList.add(catProd3);

        Produto prod1 = new Produto(1, "mourao pv tipo 'T' 3,20m", 1,1);

        System.out.println(prod1);
    }
}
