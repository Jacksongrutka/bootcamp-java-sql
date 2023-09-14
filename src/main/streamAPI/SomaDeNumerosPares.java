package main.streamAPI;

import java.util.List;


public class SomaDeNumerosPares {
    public static void main(String[] args) {
        
        List<Integer> numerosList = Numeros.NUMEROS;

        Integer somaNumeros = numerosList.stream()
        .filter(numero -> numero % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println(somaNumeros);
    }
}
