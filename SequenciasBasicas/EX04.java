package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX04 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Desenvolva um algoritmo que leia dois números inteiros e " +
                "\n mostre a somatória entre eles: " +
                "\nEx: " +
                "\nDigite um valor: 8 " +
                "\nDigite outro valor: 5 " +
                "\nA soma entre 8 e 5 é igual a 13");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicite ao usuário que digite um número");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));

        JOptionPane.showMessageDialog(null, "2ºPasso - Solicite ao usuário digite outro número");
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor: "));

        JOptionPane.showMessageDialog(null, "3ºPasso - Realize a somatória entre os valores digitados");
        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null, "4ºPasso - Exiba o resultado da soma dos valores digitados");
        JOptionPane.showMessageDialog(null, "A soma entre " + num1 + " e " + num2 + " é igual a " + soma +".");
    }
}