package main.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> Numeros;

    public SomaNumeros(){
        this.Numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        Numeros.add(new Numero(numero));
    }

    public int somarNumeros(){
        int resultadoSoma = 0;
        for (Numero n : Numeros) {
            resultadoSoma = resultadoSoma + n.getNumero();
        }
        return resultadoSoma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (Numero n : Numeros) {
            if(n.getNumero() > maiorNumero){
                maiorNumero = n.getNumero();
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Numeros.get(0).getNumero();
        for (Numero n : Numeros) {
            if(n.getNumero() < menorNumero){
                menorNumero = n.getNumero();
            }
        }
        return menorNumero;
    }

    public static void main(String[] args) {
        SomaNumeros SomaNumeros = new SomaNumeros();
        SomaNumeros.adicionarNumero(13);
        SomaNumeros.adicionarNumero(10);
        SomaNumeros.adicionarNumero(7);
        SomaNumeros.adicionarNumero(25);
        System.out.println(SomaNumeros.somarNumeros());
    }
}
