package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos(){
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula){
        for (Aluno a : alunoSet){
            if (a.getMatricula()==matricula){
                alunoSet.remove(a);
                break;
            };
        }
    }

    public Set<Aluno> exibirAlunosNome(){
        Set<Aluno> alunosNome = new TreeSet<>(alunoSet);

        return alunosNome;
    }

    public Set<Aluno> exibirAlunosNota(){
        Set<Aluno> alunosNota = new TreeSet<>(new ComparatorPorNota());
        alunosNota.addAll(alunoSet);

        return alunosNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("JOAO", 123, 7.5);
        gerenciadorAlunos.adicionarAluno("MARIA", 173, 6.5);
        gerenciadorAlunos.adicionarAluno("PEDRO", 79, 4.5);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(173);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosNome());

        System.out.println(gerenciadorAlunos.exibirAlunosNota());
    }
}
