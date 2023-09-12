package main.map.ordenacao;


public class Livro implements Comparable<Livro> {
    private String nome;
    private String autor;
    private double preco;

    public Livro(String nome, String autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public int compareTo(Livro l1){
        var preçoComparado = Double.compare(this.preco , l1.getPreco());
        return preçoComparado;
    }

    @Override
    public String toString(){
        return "nome: " + nome + "; autor: " + autor + "; preco: " + preco + ".";
    }

    public String getAutor() {
        return autor;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

}