package main.map.ordenacao;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;


public class LivrariaOnline {
    
    private Map<String, Livro> livrariaOnlineMap;

    public LivrariaOnline(){
        this.livrariaOnlineMap = new HashMap<>();
    }
    public void adicionarLivro(String link ,String nome ,String autor,Double preco ){
        livrariaOnlineMap.put(link, new Livro(nome, autor, preco));
    }
    public void removerLivro(String nome){
        if(!livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()){
                if(entry.getValue().getNome() == nome);{
                    livrariaOnlineMap.remove(entry.getKey());
                    break;
                }
            }
        }
    }
    public void exibirLivrosOrdenadosPorPreco(){
        if(!livrariaOnlineMap.isEmpty()){
            Object[] livrosOrdenado = livrariaOnlineMap.values().toArray();
            Arrays.sort(livrosOrdenado);
            for (Object o : livrosOrdenado) {
                for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()){
                    if(entry.getValue().getPreco() == ((Livro)o).getPreco()){
                        System.out.println(entry.getKey() + o);
                    }
                }
            }
        }
    }
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> pesquisaPorAutorMap = new HashMap<>();
        if(!livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()){
                if(entry.getValue().getAutor().equals(autor)){
                    pesquisaPorAutorMap.put(entry.getKey(), entry.getValue());
                }
            }
        }else{
            System.out.println("Livraria está vazia");
        }
        return pesquisaPorAutorMap;
    }
    public Pair<String, Livro> pesquisarLivroMaisCaro(){
        Pair<String, Livro> livroMaisCaro = null;
        if(!livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
                if(livroMaisCaro == null){
                    livroMaisCaro = new Pair<String, Livro>(entry.getKey(), entry.getValue());
                }else{
                    if(livroMaisCaro.getItem2().getPreco() < entry.getValue().getPreco()){
                        livroMaisCaro = new Pair<String,Livro>(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return livroMaisCaro;
    }
    public Pair<String, Livro> pesquisarLivroMaisBarato(){
        Pair<String, Livro> livroMaisBarato = null;
        if(!livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
                if(livroMaisBarato == null){
                    livroMaisBarato = new Pair<String, Livro>(entry.getKey(), entry.getValue());
                }else{
                    if(livroMaisBarato.getItem2().getPreco() > entry.getValue().getPreco()){
                        livroMaisBarato = new Pair<String,Livro>(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return livroMaisBarato;
    }
    

    public static void main(String[] args) {
        LivrariaOnline livrariaonline = new LivrariaOnline();
        livrariaonline.adicionarLivro("www.senhordosaneis.com","senhor dos aneis", "robson" , 70.50);
        livrariaonline.adicionarLivro("www.galatica.com","galatica", "maria" , 50.50);
        livrariaonline.adicionarLivro("www.gameofthrones.com","gameofthrones", "robson" , 40.50);
        var livroMaisBarato = livrariaonline.pesquisarLivroMaisBarato();
        System.out.println(livroMaisBarato.getItem1() + " " + livroMaisBarato.getItem2());
    }
}
