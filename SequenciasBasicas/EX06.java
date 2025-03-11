package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX06 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX06 - Faça um programa que leia um número inteiro e " +
                "\nmostre o seu antecessor e seu sucessor: " +
                "\nEx: " +
                "\nDigite um número: 9 " +
                "\nO antecessor de 9 é 8. " +
                "\nO sucessor de 9 é 10.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicite que o usuário digite um número.");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número(inteiro): "));

        JOptionPane.showMessageDialog(null, "2ºPasso - Calcular qual o antecessor do número digitado");
        int antecessor = num1 - 1;

        JOptionPane.showMessageDialog(null, "3ºPasso - Calcular qual o sucessor do número digitado");
        int sucessor = num1 + 1;

        JOptionPane.showMessageDialog(null, "4ºPasso - Exibir número antecessor do número digitado");
        JOptionPane.showMessageDialog(null, "O antecessor de " + num1 + " é " + antecessor + ".");

        JOptionPane.showMessageDialog(null, "5ºPasso - Exibir número sucessor do número digitado");
        JOptionPane.showMessageDialog(null, "O sucessor de " + num1 + " é " + sucessor + ".");
    }
}