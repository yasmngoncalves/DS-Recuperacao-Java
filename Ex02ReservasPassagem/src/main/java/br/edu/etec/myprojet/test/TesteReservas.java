/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myprojet.test;

import br.edu.etec.myproject.model.Passagem;
import br.edu.etec.myproject.model.PassagemEconomica;
import br.edu.etec.myproject.model.PassagemExecutiva;
import br.edu.etec.myproject.model.PassagemPrime;
import br.edu.etec.myproject.model.ValorPassagemInvalidoException;

/**
 *
 * @author Admin
 */


public class TesteReservas {
    public static void main(String[] args) {
        Passagem[] reservas = new Passagem[3];

        // Criação das passagens com tratamento isolado
        try {
            reservas[0] = new PassagemEconomica("João Silva", "Rio de Janeiro", 350.00, true);
        } catch (ValorPassagemInvalidoException e) {
            System.out.println("Erro ao criar passagem econômica: " + e.getMessage());
        }

        try {
            reservas[1] = new PassagemExecutiva("Maria Oliveira", "Paris", 5000.00, 3);
        } catch (ValorPassagemInvalidoException e) {
            System.out.println("Erro ao criar passagem executiva: " + e.getMessage());
        }

        try {
            reservas[2] = new PassagemPrime("Carlos Souza", "Nova York", 12000.00, "Champagne e massagem");
        } catch (ValorPassagemInvalidoException e) {
            System.out.println("Erro ao criar passagem Prime: " + e.getMessage());
        }

        System.out.println("\n-- Detalhes das reservas --");
        for (Passagem p : reservas) {
            if (p != null) {
                p.mostrarDetalhes();
            }
        }

        // Teste de exceção: valor inválido
        System.out.println("\n-- Teste de exceção: valor inválido --");
        try {
            Passagem passagemErrada = new PassagemEconomica("Erro Teste", "Londres", 40.00, true);
        } catch (ValorPassagemInvalidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
