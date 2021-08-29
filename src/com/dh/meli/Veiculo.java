package com.dh.meli;

public class Veiculo {
    private String marca, modelo;
    private Double valor;

    public Veiculo(String marca, String modelo, Double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valor=" + valor +
                '}';
    }


}
