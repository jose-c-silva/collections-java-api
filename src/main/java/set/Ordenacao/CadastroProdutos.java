package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade){
        produtosSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosNome(){
        Set<Produto> produtosNome = new TreeSet<>(produtosSet);

        return produtosNome;
    }

    public Set<Produto> exibirPrecos(){
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPreco.addAll(produtosSet);

        return produtosPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto 5", 1, 1.5, 10);
        cadastroProdutos.adicionarProduto("Produto 0", 2, 2.0, 1);
        cadastroProdutos.adicionarProduto("Produto 3", 1, 3.5, 12);
        cadastroProdutos.adicionarProduto("Produto 9", 3, 2.5, 7);
        cadastroProdutos.adicionarProduto("Produto 14", 6, 7.5, 2);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosNome());

        System.out.println(cadastroProdutos.exibirPrecos());
    }
    
}
