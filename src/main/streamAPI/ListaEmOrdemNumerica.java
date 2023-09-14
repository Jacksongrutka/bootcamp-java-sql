package main.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class ListaEmOrdemNumerica {

    public static void main(String[] args) {

        List<Integer> numeroList = Numeros.NUMEROS;

    List<Integer> imprimirLista = numeroList.stream()
        .sorted()
        .collect(Collectors.toList());

        System.out.println(imprimirLista);
    }
}
