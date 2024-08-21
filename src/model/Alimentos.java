package model;

import java.io.Serializable;

public class Alimentos extends ProdutoServico implements Serializable, CalculaPreco{
    protected String racao;

    public Alimentos(String racao, String setor, int quantidade, double preco) {
        super(setor, quantidade, preco);
        this.racao = racao;
    }

    @Override
    public double PrecoPortePequeno() {
       return preco;
    }

    @Override
    public double PrecoPorteMédio() {
        return (preco+10);
    }

    @Override
    public double PrecoPorteGrande() {
        return (preco*25);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    @Override
    public String toString() {
        return "Alimentos{" + "racao=" + racao + '}';
    }

    
}
