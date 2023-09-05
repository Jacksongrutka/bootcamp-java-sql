package main.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private double nota;
    private long matricula;

    public Aluno(String nome, double nota, long matricula){
        this.nome = nome;
        this.nota = nota;
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Aluno a){
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public String toString(){
        return "nome: " + nome + "; nota: " + nota + " ; matricula: " + matricula + ". ";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Aluno aluno )) return false;
        return getMatricula() == aluno.getMatricula();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getMatricula());
    }
    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public double getNota() {
        return nota;
    }
}

class ComparatorPorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2){
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
