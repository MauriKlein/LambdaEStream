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
        listaVeiculos.forEach(System.out::println);
    }

    //Exibe na tela todos os veículos em Ordem crescente de valor;
    public void mostrarListaDeVeiculosPorValor() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getValor))
                .forEach(System.out::println);
    }

    //Exibe na tela todos os veículos em Ordem Decrescente de valor;
    public void mostrarListaDeVeiculosPorValorDecrescente() {
        listaVeiculos.stream()
                .sorted((v1,v2) -> v2.getValor().compareTo(v1.getValor()))
                .forEach(System.out::println);
    }


    //Exibe na tela todos os veículos em Ordem Alfabética do Modelo e depois ordem de Valor;
    public void mostrarListaDeVeiculosPorMarcaEPorValor() {
        listaVeiculos.stream()
                //Podemos fazer a ordenação de duas formas diferentes.

                //.sorted(Comparator.comparing(Veiculo::getValor))
                .sorted((v1,v2)->v1.getValor().compareTo(v2.getValor()))

                .sorted((v1,v2)-> v1.getMarca().compareTo(v2.getMarca()))
                //.sorted(Comparator.comparing(Veiculo::getMarca))

                .forEach(System.out::println);
    }

    //Exibe Lista de veículos com valor menor a 1000
    public void mostrarListaDeVeiculosComLimiteValor(Double valor) {
        listaVeiculos.stream()
                .filter(veiculo -> veiculo.getValor()<1000)
                .forEach(System.out::println);
    }

    //Retorna a média de todos os carros da garagem
    public OptionalDouble mostrarMediaDeValoresDosVeiculos() {
        OptionalDouble media = listaVeiculos.stream()
                .mapToDouble(veiculo -> veiculo.getValor())
                .average();
        return media;
    }

    //Aplica um desconto em todos os veículos
    public void veiculosComDesconto(Double desconto) {
        listaVeiculos.forEach(
                veiculo -> {
                    veiculo.setValor(veiculo.getValor() * (desconto / 100));
                }
        );
        listaVeiculos.forEach(System.out::println);
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }


}
