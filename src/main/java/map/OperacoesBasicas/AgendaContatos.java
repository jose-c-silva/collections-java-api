package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removeContato(String nome){
        agendaContatosMap.remove(nome);
    }

    public void exibirContato(){
        System.out.println(agendaContatosMap);
    }

    public int pesquisarNome(String nome){
        return agendaContatosMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Karina", 981254565);
        agendaContatos.adicionarContato("NingNing", 854785963);
        agendaContatos.adicionarContato("Winter", 77777777);
        agendaContatos.adicionarContato("Gisele", 99999999);
        agendaContatos.adicionarContato("Karina", 88888888);

        agendaContatos.exibirContato();

        agendaContatos.removeContato("Karina");

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarNome("Gisele"));
    }
}
