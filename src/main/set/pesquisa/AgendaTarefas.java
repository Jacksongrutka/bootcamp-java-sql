package main.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaTarefas {
    private Set<Tarefa> tarefaSet;

    public AgendaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa (descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = new Tarefa(descricao);
        for (Tarefa t : tarefaSet) {
            if( tarefaRemover.equals(t)){
                tarefaSet.remove(t);
                break;
            }
        }
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> tarefasConcluidas(){
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if(t.isCompleted()){
                tarefasConcluidasSet.add(t);
            }
        }
        return tarefasConcluidasSet;
    }
    public Set<Tarefa> tarefasPendentes(){
        Set<Tarefa> tarefasPendentesSet = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if(!t.isCompleted()){
                tarefasPendentesSet.add(t);
            }
        }
        return tarefasPendentesSet;
    }
    public void mudarTarefaStatus(String descricao){
        Tarefa tarefaConcluida = new Tarefa(descricao);
        for (Tarefa t : tarefaSet) {
            if(tarefaConcluida.equals(t)){
                t.mudarStatus();
            }
        }
    }
    public void limparListaTarefas(){
        tarefaSet.clear();
    }
}
