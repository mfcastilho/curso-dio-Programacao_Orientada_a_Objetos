package as_relacoes_heranca_associacao_interface.interfaces;

import java.text.DecimalFormat;

public class TesteInterfaces {
    public static void main(String[] args) {

        Double a = 27d;
        Double b = 23d;

        DecimalFormat df = new DecimalFormat("##.##");

        OperacaoMatematica calculadora = new Calculadora();

        System.out.println(calculadora.soma(a, b));
        System.out.println(calculadora.subtrai(a, b));
        System.out.println(calculadora.multiplica(a, b));
        System.out.println(df.format(calculadora.divide(a, b)));
        System.out.println(calculadora.mandaMsg());


    }
}
