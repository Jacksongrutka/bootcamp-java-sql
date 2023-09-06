package main.map.pesquisa;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {

    private Map<String,Integer> contagemPalavrasMap;

    public ContagemPalavras(){
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra){
        if(contagemPalavrasMap.containsKey(palavra)){
            int contagemAtual = contagemPalavrasMap.get(palavra);
            contagemPalavrasMap.put(palavra, contagemAtual+1);
        }else{
            contagemPalavrasMap.put(palavra, 1);
        }
    }
    public void removerPalavra(String palavra){
        if(contagemPalavrasMap.containsKey(palavra)){
            contagemPalavrasMap.remove(palavra);
        }
    }
    public void exibirPalavra(){
        System.out.println(contagemPalavrasMap);
    }
    public void encontrarPalavraMaisRecente() {
        if(!contagemPalavrasMap.isEmpty()){
            String palavraComMaiorContagem = null;
            Integer maiorContagem = 0;
        
            for (String palavra : contagemPalavrasMap.keySet()) {
                Integer contagem = contagemPalavrasMap.get(palavra);
        
                if (contagem > maiorContagem) {
                    maiorContagem = contagem;
                    palavraComMaiorContagem = palavra;
                }
            }
            System.out.println("Palavra com a maior contagem: " + palavraComMaiorContagem + "; Contagem: " + maiorContagem);
        }
    }
    
}
