package main.java.list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> intList;

    public SomaNumeros(){
        this.intList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        intList.add(numero);
    }

    public int calcularSoma(){

        int soma = 0;
        if (!intList.isEmpty()){
            for(int i : intList){
                soma = soma + i;
            }
        }

        return soma;
    }

    public int encontrarMaior(){

        int maiorNumero = 0;
        if (!intList.isEmpty()){
            for(int i : intList){
                if (i>maiorNumero){
                    maiorNumero = i;
                }
            }
        }

        return maiorNumero;
    }

    public int encontrarMenor(){

        int menorNumero = encontrarMaior();

        if (!intList.isEmpty()){
            for(int i : intList){
                if (i<menorNumero){
                    menorNumero = i;
                }
            }
        }

        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return intList;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(151);
        somaNumeros.adicionarNumero(5);

        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontrarMaior());

        System.out.println(somaNumeros.encontrarMenor());

        System.out.println(somaNumeros.exibirNumeros());

    }
}
