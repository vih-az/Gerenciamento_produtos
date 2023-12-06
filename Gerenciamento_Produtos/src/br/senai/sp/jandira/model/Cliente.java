package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private long cpf, telefone;
    private int id_cliente;

    Scanner scanner = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void cadastrarCliente() {
        System.out.println("Informe o nome do cliente: ");
        nome = scanner.nextLine();
        System.out.println("Digite o cpf do cliente: ");
        cpf = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Informe o telefone do cliente: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
    }
}
