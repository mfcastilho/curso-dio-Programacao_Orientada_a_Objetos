package estrutura_basica_da_OO;

public class Carro {
    String modelo;
    String marca;
    Integer ano;
    String placa;
    String cor;
    Integer capacidadeTanque;

    public Carro(String modelo, String marca, Integer ano, String placa,String cor,Integer capacidadeTanque) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
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
