package as_relacoes_heranca_associacao_interface.heranca;

public class Veiculo {
    String modelo;
    String marca;
    Integer ano;
    String placa;
    String cor;
    Double capacidadeTanque;

    public Veiculo(String modelo, String marca, Integer ano, String placa, String cor, Double capacidadeTanque) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

}
