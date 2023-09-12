package main.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaDeEventos {
    private Map<LocalDate , Evento> agendaDeEventosMap;

    public AgendaDeEventos(){
        this.agendaDeEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaDeEventosMap.put(data, new Evento(nome , atracao));
    }

    public void exibirAgenda(){
        if(!agendaDeEventosMap.isEmpty()){
            Map<LocalDate , Evento> eventosTreeMap = new TreeMap<>(agendaDeEventosMap);
            System.out.println(eventosTreeMap);
        }
    }
    public Evento proximoEvento(){
        Map<LocalDate , Evento> eventosTreeMap = new TreeMap<>(agendaDeEventosMap);
        LocalDate dataAtual = LocalDate.now();
        Evento evento = null;
        for (Map.Entry<LocalDate , Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                evento = entry.getValue();
                break;
            }
        }
        return evento;
    }
    public static void main(String[] args) {
    AgendaDeEventos agendaEvento = new AgendaDeEventos();
    agendaEvento.adicionarEvento(LocalDate.of(2001, 9 , 11),"jogar balldur's gate", "sexo");
    agendaEvento.adicionarEvento(LocalDate.of(2026, 9, 25), "apostrofe", "fim do mundo");
    agendaEvento.exibirAgenda();
    System.out.println(agendaEvento.proximoEvento());
}
}

