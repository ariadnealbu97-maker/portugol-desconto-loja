package jtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CADASTRO DO PACOTE DE VIAGEM ===");

        System.out.print("Digite o tipo de transporte: ");
        String tipoTransporte = entrada.nextLine();

        System.out.print("Digite o valor do transporte em dólar: ");
        double valorTransporte = entrada.nextDouble();
        entrada.nextLine();

        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

        System.out.print("Digite a descrição da hospedagem: ");
        String descricaoHospedagem = entrada.nextLine();

        System.out.print("Digite o valor da diária em dólar: ");
        double valorDiaria = entrada.nextDouble();
        entrada.nextLine();

        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiaria);

        System.out.print("Digite o destino da viagem: ");
        String destino = entrada.nextLine();

        System.out.print("Digite a quantidade de dias: ");
        int quantidadeDias = entrada.nextInt();

        System.out.print("Digite a margem de lucro (%): ");
        double margemLucro = entrada.nextDouble();

        System.out.print("Digite o valor das taxas adicionais em dólar: ");
        double taxasAdicionais = entrada.nextDouble();
        entrada.nextLine();

        PacoteViagem pacote = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);

        System.out.println("\n=== DADOS DO PACOTE ===");
        System.out.println("Destino: " + pacote.getDestino());
        System.out.println("Transporte: " + pacote.getTransporte().getTipo());
        System.out.println("Valor do transporte: " + pacote.getTransporte().getValor());
        System.out.println("Hospedagem: " + pacote.getHospedagem().getDescricao());
        System.out.println("Valor da diária: " + pacote.getHospedagem().getValorDiaria());
        System.out.println("Quantidade de dias: " + pacote.getQuantidadeDias());
        System.out.println("Total da hospedagem: " + pacote.calcularTotalHospedagem());
        System.out.println("Valor total do pacote em dólar: " + pacote.calcularTotalPacote(margemLucro, taxasAdicionais));

        System.out.println("\n=== CADASTRO DA VENDA ===");

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Digite a forma de pagamento: ");
        String formaPagamento = entrada.nextLine();

        System.out.print("Digite a data da venda: ");
        String data = entrada.nextLine();

        Venda venda = new Venda(nomeCliente, formaPagamento, data, pacote);

        System.out.print("Digite a cotação do dólar do dia: ");
        double cotacaoDolar = entrada.nextDouble();

        System.out.println("\n=== DADOS DA VENDA ===");
        System.out.println("Cliente: " + venda.getNomeCliente());
        System.out.println("Forma de pagamento: " + venda.getFormaPagamento());
        System.out.println("Data da venda: " + venda.getData());
        System.out.println("Destino: " + venda.getPacoteViagem().getDestino());

        venda.mostrarValores(margemLucro, taxasAdicionais, cotacaoDolar);

        entrada.close();
    }
}