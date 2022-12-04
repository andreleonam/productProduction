package entities.model.produto;

public class Produto {
    private Integer codigo;
    private String nome;
    private Integer codigoCategoriaProduto;
    private Integer codigoUnidadeProduto;
    private Double saldoEstoque;
    private Double totalProdutosPedidosA_Entregar;

    public Produto(Integer codigo, String nome, Integer codigoCategoriaProduto, Integer codigoUnidadeProduto) {
        this.codigo = codigo;
        this.nome = nome;
        this.codigoCategoriaProduto = codigoCategoriaProduto;
        this.codigoUnidadeProduto = codigoUnidadeProduto;
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

    public Integer getCodigoCategoriaProduto() {
        return codigoCategoriaProduto;
    }

    public void setCodigoCategoriaProduto(Integer codigoCategoriaProduto) {
        this.codigoCategoriaProduto = codigoCategoriaProduto;
    }

    public Integer getCodigoUnidadeProduto() {
        return codigoUnidadeProduto;
    }

    public void setCodigoUnidadeProduto(Integer codigoUnidadeProduto) {
        this.codigoUnidadeProduto = codigoUnidadeProduto;
    }

    public Double getSaldoEstoque() {
        return saldoEstoque;
    }


    public Double getTotalProdutosPedidosA_Entregar() {
        return totalProdutosPedidosA_Entregar;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", codigoCategoriaProduto=" + codigoCategoriaProduto +
                ", codigoUnidadeProduto=" + codigoUnidadeProduto +
                ", saldoEstoque=" + saldoEstoque +
                ", totalProdutosPedidosA_Entregar=" + totalProdutosPedidosA_Entregar +
                '}';
    }
}
