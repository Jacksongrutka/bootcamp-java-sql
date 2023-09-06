package main.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }
    public void pesquisarPorPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap.get(palavra));
        }
    }
}
