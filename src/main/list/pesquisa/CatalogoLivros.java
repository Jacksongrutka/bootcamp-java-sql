package main.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> Livros;

    public CatalogoLivros(){
        this.Livros = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoPublicacao){
        Livros.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> listaFiltro = new ArrayList<>();
        if(!Livros.isEmpty()){
            for (Livro L : Livros) {
                if(L.getAutor().equalsIgnoreCase(autor)){
                    listaFiltro.add(L);
                }
            }
        }
        return listaFiltro;
    }
    public List<Livro> pesquisaPorAno(int anoInicial, int anoFinal){
        List<Livro> listaFiltro = new ArrayList<>();
        if(!Livros.isEmpty()){
            for (Livro L : Livros) {
                if(L.getAnoPublicacao() >= anoInicial && L.getAnoPublicacao() <= anoFinal){
                    listaFiltro.add(L);
                }
            }
        }
        return listaFiltro;
    }
    public Livro pesquisaPorNome(String nome){
        for (Livro L : Livros) {
            if(L.getNome().equalsIgnoreCase(nome)){
                return L; 
            }
            
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("titulo 1", "autor 1", 2000);
        catalogoLivros.adicionarLivro("titulo 1", "autor 1", 2001);
        catalogoLivros.adicionarLivro("titulo 3", "autor 2", 2002);
        catalogoLivros.adicionarLivro("titulo 4", "autor 3", 2003);
        catalogoLivros.adicionarLivro("titulo 5", "autor 4", 2004);
        System.out.println(catalogoLivros.pesquisaPorAno(2001, 2003));
    }
}