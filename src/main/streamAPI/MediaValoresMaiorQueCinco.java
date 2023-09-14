package main.streamAPI;

import java.util.List;

public class MediaValoresMaiorQueCinco {
    public static void main(String[] args) {

        List<Integer> numerosList = Numeros.NUMEROS;

        double mediaValores = numerosList.stream()
        .filter(numero -> numero > 5)
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
        
        System.out.println(mediaValores);
    }
}
