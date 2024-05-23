package main.java.list.Ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public List<Pessoa> ordenarAltura(){
        List<Pessoa> pessoasAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasAltura, new ComparatorPorAltura());

        return pessoasAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.5);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 22, 1.75);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 28, 1.82);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 19, 1.65);

        System.out.println(ordenacaoPessoa.ordenarIdade());
        System.out.println(ordenacaoPessoa.ordenarAltura());

    }
}
