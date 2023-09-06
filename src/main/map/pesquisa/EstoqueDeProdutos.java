package main.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProdutos {
    private Map<Long, Produto> estoqueDeProdutosMap;

    public EstoqueDeProdutos(){
        this.estoqueDeProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade){
        estoqueDeProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueDeProdutosMap);
    }
    public double calcularValorNoEstoque(){
        double valorTotal = 0;
        if(!estoqueDeProdutosMap.isEmpty()){
            for (Produto p : estoqueDeProdutosMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;
        if(!estoqueDeProdutosMap.isEmpty()){
            for (Produto p : estoqueDeProdutosMap.values()) {
                if(p.getPreco() > precoMaisCaro){
                    precoMaisCaro = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro; 
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double precoMaisBarato = Double.MAX_VALUE;
        if(!estoqueDeProdutosMap.isEmpty()){
            for (Produto p : estoqueDeProdutosMap.values()) {
                if(p.getPreco() < precoMaisBarato){
                    precoMaisBarato = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato; 
    }

    public Produto obterProdutoComMaiorValorTotalNoEstoque(){
        Produto produtoComMaiorValor = null;
        double maiorValorTotal = Double.MIN_VALUE;
        if(!estoqueDeProdutosMap.isEmpty()){
            for (Produto p : estoqueDeProdutosMap.values()) {
                double valorMultiplicacao = p.getPreco()*p.getQuantidade();
                if( valorMultiplicacao > maiorValorTotal){
                    maiorValorTotal = valorMultiplicacao;
                    produtoComMaiorValor = p;
                }
            }
        }
        return produtoComMaiorValor;
    }
}
