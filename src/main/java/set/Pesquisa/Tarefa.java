package main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean estado;

    public Tarefa(String descricao, boolean estado){
        this.descricao = descricao;
        this.estado = estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean getEstado(){
        return estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", estado=" + estado + "]";
    }
}
