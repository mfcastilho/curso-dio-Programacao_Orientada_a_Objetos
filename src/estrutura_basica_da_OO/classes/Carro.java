package estrutura_basica_da_OO.classes;

public class Carro {
    String modelo;
    String marca;
    Integer ano;
    String placa;

    public Carro(String modelo, String marca, Integer ano, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", placa='" + placa + '\'' +
                '}';
    }
}
