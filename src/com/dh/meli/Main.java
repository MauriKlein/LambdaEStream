package com.dh.meli;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Veiculo> listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new Veiculo("fiat", "torino", 1250.0));
        listaVeiculos.add(new Veiculo("ford", "fiesta", 1000.0));
        listaVeiculos.add(new Veiculo("ford", "focus", 1200.0));
        listaVeiculos.add(new Veiculo("fiat", "uno", 500.0));

        Garagem garagem = new Garagem("13010315/0001", listaVeiculos);

        System.out.println("LISTA COMPLETA");
        garagem.mostrarListaDeVeiculos();

        System.out.println("\nLISTA ORDENADA POR VALOR");
        garagem.mostrarListaDeVeiculosPorValor();

        System.out.println("\nLISTA ORDENADA POR VALOR DECRESCENTE");
        garagem.mostrarListaDeVeiculosPorValorDecrescente();

        System.out.println("\nLISTA ORDENADA POR MARCA E POR VALOR");
        garagem.mostrarListaDeVeiculosPorMarcaEPorValor();

        System.out.println("\nLISTA VEICULOS COM VALOR ABAIXO DO VALOR PASSADO POR PARÂMETRO");
        garagem.mostrarListaDeVeiculosComLimiteValor(1000.0);

        System.out.println("\nMÉDIA DE VALORES DOS VEÍCULOS DA GARAGEM "
        +garagem.mostrarMediaDeValoresDosVeiculos());








    }
}
