package main.streamAPI;

import java.util.List;

public class VerificarPositivo {
    public static void main(String[] args) {
        List<Integer> numerosList = Numeros.NUMEROS;

        boolean verificaPositivo = numerosList.stream()
        .mapToInt(Integer::intValue)
        .allMatch(numero -> numero >= 0);

        System.out.println(verificaPositivo);
    }
}
