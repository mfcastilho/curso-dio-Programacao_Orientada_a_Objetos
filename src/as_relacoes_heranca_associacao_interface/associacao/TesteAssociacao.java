package as_relacoes_heranca_associacao_interface.associacao;

public class TesteAssociacao {

    public static void main(String[] args) {
        Compra compra = new Compra(300d, 57628576);
        Cupom cupom = new Cupom();

        System.out.println("Valor a ser pago com o cupom de desconto:"+compra.retornaValorComDesconto(cupom)+" reais");
    }



}
