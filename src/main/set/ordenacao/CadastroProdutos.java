package main.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> cadastroProdutosSet;

    public CadastroProdutos(){
        this.cadastroProdutosSet = new HashSet<>();
    }
    public void adicionarProduto(String nome, int quantidade, float preco, long codigo){
        cadastroProdutosSet.add(new Produto(nome, quantidade, preco, codigo));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(cadastroProdutosSet);
        return produtoPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(cadastroProdutosSet);
        return produtosPorPreco;
    }
}
