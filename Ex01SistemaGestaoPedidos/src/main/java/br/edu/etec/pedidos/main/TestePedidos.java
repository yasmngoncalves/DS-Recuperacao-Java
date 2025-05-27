/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.pedidos.main;

import br.edu.etec.pedidos.exceptions.PrecoInvalidoException;
import br.edu.etec.pedidos.exceptions.QuantidadeInvalidaException;
import br.edu.etec.pedidos.model.Eletronico;
import br.edu.etec.pedidos.model.Livro;
import br.edu.etec.pedidos.model.Pedido;
import br.edu.etec.pedidos.model.Produto;
import br.edu.etec.pedidos.model.Roupa;

/**
 *
 * @author yasmn
 */
public class TestePedidos {
    public static void main(String[] args) {
        // Vetor com polimorfismo
        Produto[] produtos = new Produto[4];

        try {
            produtos[0] = new Livro("Dom Casmurro", 39.90, 10, "Machado de Assis");
            produtos[1] = new Eletronico("Fone Bluetooth", 199.90, 5, 12);
            produtos[2] = new Roupa("Camiseta Tech", 59.90, 20, "M");

            // Teste com preço inválido
            produtos[3] = new Livro("Bugado", 0, 5, "Erro Teste");

        } catch (PrecoInvalidoException | QuantidadeInvalidaException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }

        // Exibir detalhes com polimorfismo
        System.out.println("Detalhes dos produtos:");
        for (Produto p : produtos) {
            if (p != null) {
                p.exibirDetalhes();
            }
        }

        // Teste de pedidos
        try {
            Pedido pedido1 = new Pedido(produtos[0], 3);
            Pedido pedido2 = new Pedido(produtos[1], 10); // vai ultrapassar o estoque (só tem 5)

            System.out.println("Resumo dos pedidos:");
            pedido1.gerarResumo();
            pedido2.gerarResumo();

        } catch (Exception e) {
            System.out.println("Erro ao criar pedido: " + e.getMessage());
        }
    }
}