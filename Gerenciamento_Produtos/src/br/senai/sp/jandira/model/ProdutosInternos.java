package br.senai.sp.jandira.model;

public class ProdutosInternos extends Produtos{
    private String tipo;

    @Override
    public void cadastrarProduto() {
        super.cadastrarProduto();
        getTipo();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
