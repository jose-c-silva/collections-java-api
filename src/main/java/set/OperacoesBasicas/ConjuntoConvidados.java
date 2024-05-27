package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoCodigo(int codigoConvite){
        Convidado convidadoRemover = null;

        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("JOSE", 15);
        conjuntoConvidados.adicionarConvidado("MARIA", 25);
        conjuntoConvidados.adicionarConvidado("gleiic", 39);
        conjuntoConvidados.adicionarConvidado("MORI", 25);

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoCodigo(39);

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

    }
}
