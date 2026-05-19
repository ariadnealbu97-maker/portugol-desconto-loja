/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jtest;

/**
 *
 * @author Ariadne
 */
public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public double calcularTotalHospedagem() {
        return hospedagem.getValorDiaria() * quantidadeDias;
    }

    public double calcularLucro(double margem, double valor) {
        return valor + (valor * margem / 100);
    }

    public double calcularTotalPacote(double margem, double taxasAdicionais) {
        double totalHospedagem = calcularTotalHospedagem();
        double subtotal = transporte.getValor() + totalHospedagem + taxasAdicionais;
        return calcularLucro(margem, subtotal);
    }
}

