package as_relacoes_heranca_associacao_interface.interfaces;

public class Calculadora implements OperacaoMatematica{
    @Override
    public Double soma(Double a, Double b) {
        return a+b;
    }

    @Override
    public Double subtrai(Double a, Double b) {
        return a-b;
    }

    @Override
    public Double multiplica(Double a, Double b) {
        return a*b;
    }

    @Override
    public Double divide(Double a, Double b) {
        return a/b;
    }

    @Override
    public String mandaMsg() {
        return "Hello World";
    }
}
