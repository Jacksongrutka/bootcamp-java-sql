package main.streamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaiorNumero {
    public static void main(String[] args) {
        
        List<Integer> numeroList = Numeros.NUMEROS;

    Optional<Integer> segundoMaiorNumero = numeroList.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst();
    
    if (segundoMaiorNumero.isPresent()) {
    Integer valor = segundoMaiorNumero.get();
        System.out.println(valor);
        } else {
        System.out.println("Lista vazia.");
    }
}
}
