package main.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class RemovaValoresImpar {
    public static void main(String[] args) {

        List<Integer> numerosList = Numeros.NUMEROS;

        List<Integer> removeValoresImpar = numerosList.stream()
        .filter(numero -> numero % 2 == 0)
        .collect(Collectors.toList());

        System.out.println(removeValoresImpar);
    }
}
