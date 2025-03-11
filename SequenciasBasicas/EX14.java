package Exercicios.SequenciasBasicas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX14 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX14 - A locadora de carros precisa de sua ajuda para cobrar seus " +
                "\nserviços. Escreva um programa que pergunte a quantidade de Km " +
                "\npercorridos por um carro alugado e a quantidade de dias pelos quais " +
                "\nele foi alugado. Calcule o preço total a pagar, sabendo que o carro " +
                "\ncusta R$90 por dia e R$0,20 por Km rodado.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Guarde os valores da diária e do Km do carro alugado.");
        double diaria = 90.00;
        double kmrodado = 0.20;

        JOptionPane.showMessageDialog(null, "2ºPasso - Solicite que o usuário digite por quantos dias ele ficou com o carro alugado.");
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias você ficou com o carro:"));

        JOptionPane.showMessageDialog(null, "3ºPasso - Solicite que o usuário digite quantos km ele rodou com o carro alugado.");
        String kmt = JOptionPane.showInputDialog("Digite quantos km você rodou com o carro:");

        JOptionPane.showMessageDialog(null, "4ºPasso -  Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        kmt = kmt.replace(",", ".");
        double km = Double.parseDouble(kmt);

        JOptionPane.showMessageDialog(null, "5ºPasso - Calcule total a pagar pelo carro alugado.");
        double total = (diaria * dias) + (kmrodado * km);

        JOptionPane.showMessageDialog(null, "6ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("PT", "BR");

        JOptionPane.showMessageDialog(null, "7ºPasso - Exibir quantas diárias e km foram usados pelo cliente e o total que ele ira pagar.");
        JOptionPane.showMessageDialog(null, "O carro foi alugado por " + dias + " dias e rodou " + km + "km." +
                " \nDando um total de " + NumberFormat.getCurrencyInstance(Brasil).format(total) + ".");
    }
}
