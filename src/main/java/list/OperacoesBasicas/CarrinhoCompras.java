package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> carrinho;

    public CarrinhoCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItens = new ArrayList<>();

        for (Item i : carrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                removerItens.add(i);
            }
        }

        carrinho.removeAll(removerItens);
    }

    public double calcularValorTotal(){
        double total =0;

        for (Item i: carrinho){
            total = total + (i.getPreco() * i.getQuantidade());
        }

        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Teclado",100.5, 3);
        carrinhoCompras.adicionarItem("Mouse",8, 2);
        carrinhoCompras.adicionarItem("Tela",500.50, 5);

        System.out.println(carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("Tela");

        System.out.println(carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItens();
    }
    
}
