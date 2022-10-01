package estrutura_basica_da_OO;

public class Carro {
    String modelo;
    String marca;
    Integer ano;
    String placa;
    String cor;
    Double capacidadeTanque;

    public Carro(String modelo, String marca, Integer ano, String placa,String cor,Double capacidadeTanque) {
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Double calculaValorPraEncherTanque(Double valorGasolina){
        return valorGasolina * capacidadeTanque;
    }

    //sobrecarga
    public String calculaValorPraEncherTanque(Double valorGasolina, String modelo){
        return calculaValorPraEncherTanque(valorGasolina).toString();
    }
}
