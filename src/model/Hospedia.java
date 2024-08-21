package model;

import java.io.Serializable;

public class Hospedia extends ProdutoServico implements Serializable, CalculaPreco {

    public Hospedia(String setor, int quantidade, double preco) {
        super(setor, quantidade, preco);
    }
    
    
    @Override
    public double PrecoPortePequeno() {
        return preco;
    }

    @Override
    public double PrecoPorteMédio() {
      return (preco+5);
    }

    @Override
    public double PrecoPorteGrande() {
        return (preco+15);
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
    
}
