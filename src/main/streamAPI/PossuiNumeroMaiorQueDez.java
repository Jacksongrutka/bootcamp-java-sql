package main.streamAPI;

import java.util.List;

public class PossuiNumeroMaiorQueDez {
    public static void main(String[] args) {

        List<Integer> numeroList = Numeros.NUMEROS;

        boolean numeroMaiorQueDez = numeroList.stream()
        .anyMatch(numero -> numero > 10);

        System.out.println(numeroMaiorQueDez);
    }
}
