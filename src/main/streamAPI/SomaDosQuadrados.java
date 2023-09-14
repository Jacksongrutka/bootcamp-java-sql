package main.streamAPI;

import java.util.List;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        
        List<Integer> numerosList = Numeros.NUMEROS;

        Integer somaQuadrados = numerosList.stream()
            .map(numero -> numero * numero)
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println(somaQuadrados);
    }
}
