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
public class Roupa extends Produto {
    private String tamanho; // Ex: P, M, G, GG

    public Roupa(String nome, double preco, int quantidadeEstoque, String tamanho)
            throws PrecoInvalidoException, QuantidadeInvalidaException {
        super(nome, preco, quantidadeEstoque);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Roupa: " + getNome());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preco: RS" + getPreco());
        System.out.println("Estoque: " + getQuantidadeEstoque());
        System.out.println("----------------------------");
    }
}