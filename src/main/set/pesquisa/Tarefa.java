package main.set.pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean isCompleted;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.isCompleted = false;
    }
    @Override
    public String toString(){
        return "tarefa: " + descricao;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return getDescricao().equals(tarefa.getDescricao());
    }


    @Override
    public int hashCode(){
        return Objects.hash(getDescricao());
    }

    public String getDescricao() {
        return descricao;
    }
    public Boolean isCompleted(){
        return isCompleted;
    }
    public void mudarStatus(){
        if(this.isCompleted){
            this.isCompleted = false;
        }else{
            this.isCompleted = true;
        }
    }
}
