package com.dh.meli;

public class Veiculo {
    private String marca, modelo;
    private Double valor;

    public Veiculo(String marca, String modelo, Double valor) {
        this.marca = marca;
        this.modelo = modelo;
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
