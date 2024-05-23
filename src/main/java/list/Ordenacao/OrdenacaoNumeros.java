package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> intList;

    public OrdenacaoNumeros (){
        this.intList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        intList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordemAscendente = new ArrayList<>(intList);

        Collections.sort(ordemAscendente);

        return ordemAscendente;
    }

    public List<Integer> ordenarDescendentes(){

        List<Integer> ordemAscendente = new ArrayList<>(intList);

        ordemAscendente.sort(Collections.reverseOrder());

        return ordemAscendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(44);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendentes());
    }
}
