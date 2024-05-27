package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet = new HashSet<>();

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicasSet.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        for (String c : palavrasUnicasSet){
            if(c==palavra){
                System.out.println("A PALAVRA ESTÁ PRESENTE");
                break;
            }
            else{
                System.out.println("poxa...");
            }
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("CASA");
        conjuntoPalavrasUnicas.adicionarPalavra("CARRO");
        conjuntoPalavrasUnicas.adicionarPalavra("MOTO");
        conjuntoPalavrasUnicas.adicionarPalavra("CASA");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("CASA");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("MOTO");
    }
}
