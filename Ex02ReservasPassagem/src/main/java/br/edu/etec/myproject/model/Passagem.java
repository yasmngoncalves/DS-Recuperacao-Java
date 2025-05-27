/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */




public abstract class Passagem {
    private String nomePassageiro;
    private String destino;
    private double valor;

    public Passagem(String nomePassageiro, String destino, double valor) throws ValorPassagemInvalidoException {
        setNomePassageiro(nomePassageiro);
        setDestino(destino);
        setValor(valor);
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ValorPassagemInvalidoException {
        if (valor < 100.00) {
            throw new ValorPassagemInvalidoException("Valor da passagem deve ser no mínimo R$100,00.");
        }
        this.valor = valor;
        System.out.println("Valor da passagem definido com sucesso: R$" + valor);
    }

    public abstract void mostrarDetalhes();
}


