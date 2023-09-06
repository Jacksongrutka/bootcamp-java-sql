package main.map.operacoesBasicas;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisaPorNome(String nome){
        Integer numeroTelefone = null;
        if(!agendaContatoMap.isEmpty()){
            numeroTelefone = agendaContatoMap.get(nome);
        }
        return numeroTelefone;
    }
}
