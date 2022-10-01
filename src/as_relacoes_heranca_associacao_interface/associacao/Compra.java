package as_relacoes_heranca_associacao_interface.associacao;

public class Compra {

    Double valorCompra;
    Integer codigoProduto;


    public Compra(Double valorCompra, Integer codigoProduto) {
        this.valorCompra = valorCompra;
        this.codigoProduto = codigoProduto;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public Double retornaValorComDesconto(Cupom cupom){

        Double valorDesconto = this.valorCompra * cupom.getDesconto();

        return this.valorCompra - valorDesconto;
    }
}
