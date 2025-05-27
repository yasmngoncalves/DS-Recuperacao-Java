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
public class Eletronico extends Produto {
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidadeEstoque, int garantiaMeses)
            throws PrecoInvalidoException, QuantidadeInvalidaException {
        super(nome, preco, quantidadeEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Eletronico: " + getNome());
        System.out.println("Preco: RS" + getPreco());
        System.out.println("Estoque: " + getQuantidadeEstoque());
        System.out.println("Garantia: " + garantiaMeses + " meses");
        System.out.println("----------------------------");
    }
}