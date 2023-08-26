package main.list.ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarPessoa {
    private List<Pessoa> PessoaList;

    public OrdenarPessoa(){
        this.PessoaList= new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        PessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> PessoasPorIdade = new ArrayList<>(PessoaList);
        Collections.sort(PessoasPorIdade);
        return PessoasPorIdade;
    }
    public List<Pessoa> ordenadoPorAltura(){
        List<Pessoa> PessoaPorAltura = new ArrayList<>(PessoaList);
        Collections.sort(PessoaPorAltura , new ComparatorPorAltura());
        return PessoaPorAltura;
    }
}
