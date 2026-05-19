/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jtest;

public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private String data;
    private PacoteViagem pacoteDeViagem;

    public Venda(String nomeCliente, String formaPagamento, String data, PacoteViagem pacoteDeViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.data = data;
        this.pacoteDeViagem = pacoteDeViagem;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteDeViagem;
    }

    public void setPacoteDeViagem(PacoteViagem pacoteDeViagem) {
        this.pacoteDeViagem = pacoteDeViagem;
    }

    public double converterParaReais(double valorDolar, double cotacaoDolar) {
        return valorDolar * cotacaoDolar;
    }

    public double converterParaDolar(double valorReal, double cotacaoDolar) {
        return valorReal / cotacaoDolar;
    }

    public void mostrarValores(double margem, double taxasAdicionais, double cotacaoDolar) {
        double totalDolar = pacoteDeViagem.calcularTotalPacote(margem, taxasAdicionais);
        double totalReais = converterParaReais(totalDolar, cotacaoDolar);

        System.out.println("Valor total do pacote em dólar: " + totalDolar);
        System.out.println("Valor total do pacote em reais: " + totalReais);
    }
}