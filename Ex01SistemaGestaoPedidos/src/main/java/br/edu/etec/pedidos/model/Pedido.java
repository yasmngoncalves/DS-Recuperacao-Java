/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.pedidos.model;

/**
 *
 * @author yasmn
 */
public class Pedido {
    private Produto produto;
    private int quantidade;

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;

        if (quantidade > produto.getQuantidadeEstoque()) {
            System.out.println("Quantidade solicitada maior que o estoque! Pedido ajustado para o estoque disponivel.");
            this.quantidade = produto.getQuantidadeEstoque();
        } else {
            this.quantidade = quantidade;
        }
    }

    public void gerarResumo() {
        System.out.println("Resumo do Pedido:");
        produto.exibirDetalhes();
        System.out.println("Quantidade comprada: " + quantidade);
        System.out.println("============================");
    }
}