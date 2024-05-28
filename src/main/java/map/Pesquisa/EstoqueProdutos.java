package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(int codigo, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotal(){
        double valorTotal = 0;

        for(Produto p : estoqueProdutosMap.values()){
            valorTotal = valorTotal + (p.getQuantidade()*p.getPreco());
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for(Produto p: estoqueProdutosMap.values()){
            if (p.getPreco()>maiorPreco){
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for(Produto p: estoqueProdutosMap.values()){
            if (p.getPreco() < menorPreco){
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }
        }

        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProdutos(1, "CALÇA", 70.55, 3);
        estoqueProdutos.adicionarProdutos(2, "MEIA", 59.60, 5);
        estoqueProdutos.adicionarProdutos(3, "PISO", 33.55, 8);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.calculaValorTotal());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
    }
}
