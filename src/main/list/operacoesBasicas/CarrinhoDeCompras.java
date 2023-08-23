package main.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> Compras;

    public CarrinhoDeCompras(){
        this.Compras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Compras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String Nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item I : Compras) {
            if(I.getName().equalsIgnoreCase(Nome)){
                itensParaRemover.add(I);
            }
        Compras.removeAll(itensParaRemover);
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        double valorMultiplicacao = 0;
        for (Item I : Compras) {
            valorMultiplicacao = I.getPreco()*I.getQuantidade();
            valorTotal = valorTotal + valorMultiplicacao;
        }
        return valorTotal;
    }
    public void mostrarItens(){
        System.out.println(Compras);
    }
    public static void main(String[] args) {
    CarrinhoDeCompras CarrinhoDeCompras = new CarrinhoDeCompras();
    CarrinhoDeCompras.adicionarItem("camisa", 50.00, 2);
    CarrinhoDeCompras.adicionarItem("calca", 75.00, 3);
    CarrinhoDeCompras.mostrarItens();
    System.out.println(CarrinhoDeCompras.calcularValorTotal());

}
}
