
package model;

import java.io.Serializable;

public class Compra extends ProdutoServico implements Serializable{
    protected String produtoServico;

    public Compra(String produtoServico, String setor, int quantidade, double preco) {
        super(setor, quantidade, preco);
        this.produtoServico = produtoServico;
    }

    public String getProdutoServico() {
        return produtoServico;
    }

    public void setProdutoServico(String produtoServico) {
        this.produtoServico = produtoServico;
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
