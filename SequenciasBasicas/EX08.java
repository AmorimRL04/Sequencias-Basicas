package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX08 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX08 - Desenvolva um programa que leia uma distância em metros e " +
                "\nmostre os valores relativos em outras medidas: " +
                "\nEx: " +
                "\nDigite uma distância em metro: 185.72 " +
                "\nA distância corresponde a: " +
                "\n0.18572Km " +
                "\n1.8572Hm " +
                "\n18.572Dam " +
                "\n" +
                "\n1857.2dm" +
                " \n18572.0cm " +
                "\n185720.0mm");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicite que o usuário digite uma medida em metro.");
        String medidat = JOptionPane.showInputDialog("Digite a medida em metros: ");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        medidat = medidat.replace(",", ".");

        JOptionPane.showMessageDialog(null, "3º Passo - Converter a string para um número float");
        float num1 = Float.parseFloat(medidat);

        JOptionPane.showMessageDialog(null, "4º Passo - Converter o metro digitado para Km");
        float Km = num1 / 1000;

        JOptionPane.showMessageDialog(null, "5º Passo - Converter o metro digitado para Hm");
        float Hm = num1 / 100;

        JOptionPane.showMessageDialog(null, "6º Passo - Converter o metro digitado para Dam");
        float Dam = num1 / 10;

        JOptionPane.showMessageDialog(null, "7º Passo - Converter o metro digitado para dm");
        float dm = num1 * 10;

        JOptionPane.showMessageDialog(null, "8º Passo - Converter o metro digitado para cm");
        float cm = num1 * 100;

        JOptionPane.showMessageDialog(null, "9º Passo - Converter o metro digitado para mm");
        float mm = num1 * 1000;


        JOptionPane.showMessageDialog(null, "10º Passo - Exibir os metros digitados convertido em outras medidas.");
        String resultado = "A distância corresponde a:\n" +
                String.format("%.5f Km\n", Km) +
                String.format("%.4f Hm\n", Hm) +
                String.format("%.3f Dam\n", Dam) +
                "\n" +
                String.format("%.1f dm\n", dm) +
                String.format("%.1f cm\n", cm) +
                String.format("%.1f mm", mm);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
