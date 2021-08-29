package com.dh.meli;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;


public class Garagem {
    private String cnpj;
    List<Veiculo> listaVeiculos;

    public Garagem(String cnpj, List<Veiculo> listaVeiculos) {
        this.cnpj = cnpj;
        this.listaVeiculos = listaVeiculos;
    }

    //Exibe na tela todos os veículos na garagem;
    public void mostrarListaDeVeiculos() {
        listaVeiculos.forEach(veiculo -> System.out.println(veiculo.toString()));
    }

    //Exibe na tela todos os veículos em Ordem crescente de valor;
    public void mostrarListaDeVeiculosPorValor() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getValor))
                .forEach(veiculo -> System.out.println(veiculo.toString()));
    }

    //Exibe na tela todos os veículos em Ordem Alfabética do Modelo e depois ordem de Valor;
    public void mostrarListaDeVeiculosPorModeloEPorValor() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getValor))
                .sorted(Comparator.comparing(Veiculo::getMarca))
                .forEach(veiculo -> System.out.println(veiculo.toString()));
    }

    //Exibe Lista de veículos com valor menor a 1000
    public void mostrarListaDeVeiculosComLimiteValor(Double valor) {
        listaVeiculos.stream()
                .filter(veiculo -> veiculo.getValor()<1000)
                .forEach(veiculo -> System.out.println(veiculo.toString()));
    }

    //Retorna a média de todos os carros da garagem
    public OptionalDouble mostrarMediaDeValoresDosVeiculos() {
        OptionalDouble media = listaVeiculos.stream()
                .mapToDouble(veiculo -> veiculo.getValor())
                .average();
        return media;
    }



    public String getCnpj() {
        return cnpj;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }


}
