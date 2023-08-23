package main.list.operacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa{
    private List<Tarefa> TarefaList;

    public ListaTarefa(){
        this.TarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
    TarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa tarefa : TarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(tarefa);
            }
        TarefaList.removeAll(tarefaParaRemover);   
        }
    }
    public int obterNumeroTarefas(){
        return TarefaList.size();
    }
    public void obterDescricao(){
        System.out.println(TarefaList);
    }
}
