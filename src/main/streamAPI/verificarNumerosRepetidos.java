package main.streamAPI;

import java.util.List;

public class verificarNumerosRepetidos {
    
    public static void main(String[] args) {
        List<Integer> numeroList = Numeros.NUMEROS;

        boolean numerosRepetidos = numeroList.size() != numeroList.stream()
        .distinct()
        .count();

        System.out.println(numerosRepetidos);
    }
}
