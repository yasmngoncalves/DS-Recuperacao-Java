/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.pedidos.model;

import br.edu.etec.pedidos.exceptions.PrecoInvalidoException;
import br.edu.etec.pedidos.exceptions.QuantidadeInvalidaException;

/**
 *
 * @author yasmn
 */
public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, int quantidadeEstoque, String autor)
            throws PrecoInvalidoException, QuantidadeInvalidaException {
        super(nome, preco, quantidadeEstoque);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + getNome());
        System.out.println("Autor: " + autor);
        System.out.println("Preco: RS" + getPreco());
        System.out.println("Estoque: " + getQuantidadeEstoque());
        System.out.println("----------------------------");
    }
}