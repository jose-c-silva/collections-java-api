package main.java.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int contato){
        contatoSet.add(new Contato(nome, contato));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatosNome = new HashSet<>();

        for(Contato c: contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosNome.add(c);
            }
        }

        return contatosNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        
        for(Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        System.out.println(contatoAtualizado);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("MARIA", 99999999);
        agendaContatos.adicionarContato("MARIA", 88888888);
        agendaContatos.adicionarContato("MARIA ESTER", 777777777);
        agendaContatos.adicionarContato("MARIA VELHA", 555555555);
        agendaContatos.adicionarContato("JOSE", 99999999);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarNome("MARIA"));

        agendaContatos.atualizarNumeroContato("MARIA", 1234567);

        agendaContatos.exibirContato();
    }
}
