package br.com.desafio.conversor.principal;

import br.com.desafio.conversor.Conversor;
import br.com.desafio.conversor.modelos.Moedas;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    /**
     * My Key
     * 492f01dd757848ff453d0472
     * conexão exemplo
     * https://v6.exchangerate-api.com/v6/492f01dd757848ff453d0472/latest/USD
     */

    private static Conversor conv = new Conversor();
    private static Scanner scanner = new Scanner(System.in);
    private static double valorConvertido = -1;
    private static double valorAntes = 0;
    private static String moedaAntiga = "";
    private static String moedaNova = "";
    private static boolean continua = true;


    public static void main(String[] args) throws IOException, InterruptedException {

        while (continua) {
            menuEscolhas();
            System.out.println();
            finalizacao(valorConvertido, moedaAntiga, moedaNova);
        }

    }

    private static void finalizacao(double valor, String mAntiga, String mNova) {
        System.out.println("=================================");
        System.out.println("Valor em " + mAntiga + " : " + valorAntes + "." );
        System.out.println("Valor em " + mNova + " : " + valor + "." );
        System.out.println("=================================");
    }

    private static void menuEscolhas() throws IOException, InterruptedException {

        System.out.println("********************************************************");
        System.out.println("Escolha uma das opções de conversão");
        System.out.println("0 - Dolar para real");
        System.out.println("1 - Dolar para euro");
        System.out.println("2 - Peso argentino para real");
        System.out.println("3 - Peso argentino para dolar");
        System.out.println("4 - Real para iene");
        System.out.println("5 - Real para dolar");
        System.out.println("6 - Euro para peso argentino");
        System.out.println("7 - Euro para iene");
        System.out.println("8 - Iene para euro");
        System.out.println("9 - Sair");

        System.out.println("********************************************************");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 0:
                valorConvertido = conv.converterValor(escolhaValor(), "USD", "BRL");
                moedaAntiga = "USD";
                moedaNova = "BRL";
                break;

            case 1:
                valorConvertido = conv.converterValor(escolhaValor(), "USD", "EUR");
                moedaAntiga = "USD";
                moedaNova = "EUR";
                break;

            case 2:
                valorConvertido = conv.converterValor(escolhaValor(), "ARS", "BRL");
                moedaAntiga = "ARS";
                moedaNova = "BRL";
                break;

            case 3:
                valorConvertido = conv.converterValor(escolhaValor(), "ARS", "USD");
                moedaAntiga = "ARS";
                moedaNova = "USD";
                break;

            case 4:
                valorConvertido = conv.converterValor(escolhaValor(), "BRL", "JPY");
                moedaAntiga = "BRL";
                moedaNova = "JPY";
                break;

            case 5:
                valorConvertido = conv.converterValor(escolhaValor(), "BRL", "USD");
                moedaAntiga = "BRL";
                moedaNova = "USD";
                break;

            case 6:
                valorConvertido = conv.converterValor(escolhaValor(), "EUR", "ARS");
                moedaAntiga = "EUR";
                moedaNova = "ARS";
                break;

            case 7:
                valorConvertido = conv.converterValor(escolhaValor(), "EUR", "JPY");
                moedaAntiga = "EUR";
                moedaNova = "JPY";
                break;

            case 8:
                valorConvertido = conv.converterValor(escolhaValor(), "JPY", "EUR");
                moedaAntiga = "JPY";
                moedaNova = "EUR";
                break;

            case 9:
                continua = false;
                System.out.println("Finalizando o programa...");
                System.out.println("Programa finalizado!");
                break;

            default:
                System.out.println("-----------------------------");
                System.out.println("Escolha inválida tente novamente.");
                System.out.println("-----------------------------");
                break;
        }
    }

    private static double escolhaValor() {
        System.out.println("****** Digite o valor de conversão ******");
        double valor = scanner.nextDouble();
        valorAntes = valor;
        return valor;
    }

}
