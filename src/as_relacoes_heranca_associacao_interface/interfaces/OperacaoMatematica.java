package as_relacoes_heranca_associacao_interface.interfaces;

public interface OperacaoMatematica {

    //quando se trata de interface, implicitamente os atributos dela são publicos e estáticos,
    // ou seja, mesmo se não colocar modificador de acesso ou o static, assim o será
//    public static String a = "Hello World";
//    Integer num = 10;

    public Double soma(Double a , Double b);
    public Double subtrai(Double a , Double b);
    public Double multiplica(Double a , Double b);
    public Double divide(Double a , Double b);
    public String mandaMsg();

}
