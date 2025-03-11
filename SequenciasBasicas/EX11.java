package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX11 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX11 - Crie um programa que leia os valores de A, B e C de " +
                "\numa equação do segundo grau e mostre o valor de Delta.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicite que o usuário digite o valor de A:");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A:"));

        JOptionPane.showMessageDialog(null, "2ºPasso - Solicite que o usuário digite o valor de B:");
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B:"));

        JOptionPane.showMessageDialog(null, "3ºPasso - Solicite que o usuário digite o valor de C:");
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de C:"));

        JOptionPane.showMessageDialog(null, "4ºPasso - Realize o calculo para descobrir o valor de delta.");
        double delta = Math.pow(b, 2) - 4 * a * c;

        JOptionPane.showMessageDialog(null, "5ºPasso - Exiba ao usuário o valor de delta.");
        JOptionPane.showMessageDialog(null, " O valor de delta é: " + delta + ".");
    }
}