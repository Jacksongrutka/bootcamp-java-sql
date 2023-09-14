package main.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class NumerosImparesDivisiveisPorTresOuCinco {
    public static void main(String[] args) {
        
        List<Integer> numeroList = Numeros.NUMEROS;

        List<Integer> numerosImpar = numeroList.stream()
        .filter(numero -> numero % 2 == 1)
        .filter(numero -> numero % 3 == 0 || numero % 5 == 0)
        .collect(Collectors.toList());
        
        System.out.println(numerosImpar);
    }
}
