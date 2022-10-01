package estrutura_basica_da_OO;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Punto", "Fiat", 2022, "BRA0R35", "Cinza", 48d);

        System.out.println(carro);

        System.out.println(carro.calculaValorPraEncherTanque(5.3, carro.modelo));

    }
}
