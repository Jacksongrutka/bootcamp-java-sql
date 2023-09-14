package main.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class SomarOsDigitos {
    public static void main(String[] args) {

        List<Integer> numeroList = Numeros.NUMEROS;

        List<Integer> numerosSeparados = new ArrayList<>();

        for (Integer numero : numeroList) {
            Integer temporaria = numero;
            while(temporaria > 0){
                int digito = temporaria % 10;
                numerosSeparados.add(digito);
                temporaria = temporaria / 10;
            }
        }

        Integer somaDigitos = numerosSeparados.stream()
            .mapToInt(Integer::intValue)
            .sum();
        
        System.out.println(somaDigitos);

    }
}
