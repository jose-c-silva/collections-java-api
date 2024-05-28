package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public  void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(t);
                break;
            } else{
                System.out.println("Não há tarefas com essa descrição");
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t : tarefaSet){
            if (t.getEstado()){
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t : tarefaSet){
            if (!t.getEstado()){
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida (String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setEstado(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente (String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setEstado(false);
                break;
            }
        }
    }

    public void limparLista(){
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Começar academia");
        listaTarefas.adicionarTarefa("Escutar Armageddon");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Começar academia");

        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Comer");
        listaTarefas.adicionarTarefa("Beber água");

        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Comer");
        listaTarefas.marcarTarefaConcluida("Beber água");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparLista();

        listaTarefas.exibirTarefas();
    }

}
