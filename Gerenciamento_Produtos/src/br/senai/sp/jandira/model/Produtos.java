package br.senai.sp.jandira.model;

import java.sql.SQLOutput;
import java.util.Scanner;

abstract class Produtos {
    private String nome, descricao, categoria, fornecedor;
    private int id_produto, codigo, qtd_estoque, preco;
    Scanner scanner = new Scanner(System.in);



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void cadastrarProduto(){
        System.out.println("Insira o nome do produto: ");
        nome = scanner.nextLine();
        System.out.println("Insira o código do produto: ");
        codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o preço do produto: ");
        preco = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira a categoria do produto: ");
        categoria = scanner.nextLine();
        System.out.println("Insira o fornecedor do produto: ");
        fornecedor = scanner.nextLine();
        System.out.println("Insira a descrição do produto: ");
        descricao = scanner.nextLine();
        System.out.println("Insira a quantidade desse produto no estoque: ");
        qtd_estoque = scanner.nextInt();
        scanner.nextLine();
    }
}
