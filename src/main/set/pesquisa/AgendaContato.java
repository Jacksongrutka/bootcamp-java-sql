package main.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatosSet;

    public AgendaContato(){
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
            
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String contatoParaAtualizar, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if(c.getNome().equalsIgnoreCase(contatoParaAtualizar)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
            
        }
        return contatoAtualizado;
    }
}
