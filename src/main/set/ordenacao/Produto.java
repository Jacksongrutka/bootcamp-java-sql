package main.set.ordenacao;

import java.util.Objects;
import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private int quantidade;
    private float preco;
    private long codigo;

    public Produto(String nome, int quantidade, float preco, long codigo){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codigo = codigo;
    }
    @Override
    public int compareTo(Produto p){
        return nome.compareToIgnoreCase(p.getNome());
    }
    @Override
    public String toString(){
        return "Codigo do produto:" + codigo + "; nome: " + nome + "; quantidade: " + quantidade + "; preco: " + preco + "R$.";
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getCodigo());
    }

    public String getNome(){
        return this.nome;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public float getPreco(){
        return this.preco;
    }
    public long getCodigo(){
        return this.codigo;
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
