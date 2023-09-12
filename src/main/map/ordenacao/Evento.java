package main.map.ordenacao;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao){
        this.nome = nome;
        this.atracao = atracao;
    }

    @Override
    public String toString(){
        return "evento: " + nome + "; atraçao do evento: " + atracao + ".";
    }

    public String getNome() {
        return nome;
    }
    public String getAtracao() {
        return atracao;
    }
}
