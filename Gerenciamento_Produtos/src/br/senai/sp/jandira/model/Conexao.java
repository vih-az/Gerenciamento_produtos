package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String servidor, banco, usuario, senha;
    public Connection conexao;

    public Conexao(){
        this.servidor = "localhost";
        this.banco = "loja_computadores";
        this.usuario = "root";
        this.senha = "bcd127";
    }

    public void ConnectDriver (){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha);
        } catch (SQLException erro) {
            System.out.println(erro);
        }
    }

    public Connection getConexao(){
        ConnectDriver();
        return conexao;
    }
}
