package main.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
    
    private Set<Aluno> gerenciarAlunosSet;

    public GerenciarAlunos(){
        this.gerenciarAlunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, double nota, long matricula){
        gerenciarAlunosSet.add(new Aluno(nome, nota, matricula));
    }

    public void removerAluno(long matricula){
        gerenciarAlunosSet.removeIf(Aluno -> Aluno.getMatricula() == matricula);
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(gerenciarAlunosSet);
        return alunoPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        return alunoPorNota;
    }
    public Set<Aluno> exibirTodosAlunos(){
        return gerenciarAlunosSet;
    }
}
