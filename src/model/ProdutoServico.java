package model;

import java.io.Serializable;

public abstract class ProdutoServico implements Serializable{
    protected String setor;
    protected int quantidade;
    protected double preco;

    public ProdutoServico(String setor, int quantidade, double preco) {
        this.setor = setor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ProdutoServico{" + "setor=" + setor + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
    
    
}
