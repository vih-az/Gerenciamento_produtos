package br.senai.sp.jandira.model;

public class ProdutosInternos extends Produtos{
    private String tipo;

    public ProdutosInternos(String nome, String descricao, String categoria, String fornecedor, int id_produto, int codigo, int qtd_estoque, int preco) {
        super(nome, descricao, categoria, fornecedor, id_produto, codigo, qtd_estoque, preco);
        this.tipo = "Interno";
    }

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
