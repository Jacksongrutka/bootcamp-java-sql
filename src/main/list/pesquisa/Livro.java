package main.list.pesquisa;

public class Livro {
    private String nome;
    private String autor;
    private int anoPublicacao;

    public Livro(String nome, String autor, int anoPublicacao){
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public String getNome() {
        return nome;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String toString() {
        return "Nome: " + nome + ", Autor: " + autor + ", Ano de Publicaçao: " + anoPublicacao;
    }
}
