/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */

public class PassagemPrime extends Passagem {
    private String servicoPersonalizado;

    public PassagemPrime(String nomePassageiro, String destino, double valor, String servicoPersonalizado) throws ValorPassagemInvalidoException {
        super(nomePassageiro, destino, valor);
        this.servicoPersonalizado = servicoPersonalizado;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Passagem Prime - Passageiro: " + getNomePassageiro() + 
                           ", Destino: " + getDestino() + 
                           ", Valor: R$" + getValor() + 
                           ", Serviço personalizado: " + servicoPersonalizado);
    }
}
