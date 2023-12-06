package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.ProdutosInternos;

public class App {
    public static void main(String[] args) {
        ProdutosInternos produtosInternos = new ProdutosInternos("sad", "asdsd", "asasd", "asdasa", 1, 3243, 23, 3414);
        produtosInternos.exibirProduto();
    }
}
