package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX05 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX05 - Faça um programa que leia as duas notas de um aluno em uma " +
                "\nmatéria e mostre na tela a sua média na disciplina. " +
                "\nEX: " +
                "\nNota 1: 4.5 " +
                "\nNota 2: 8.5 " +
                "\nA média entre 4.5 e 8.5 é igual a 6.5.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicite que o usuário digite a primeira nota.");
        String nota1T = JOptionPane.showInputDialog("Digite a primeira nota:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter a nota para o formato americano, caso seja digitado no formato brasileiro.");
        nota1T = nota1T.replace(",", ".");
        float nota1 = Float.parseFloat(nota1T);

        JOptionPane.showMessageDialog(null, "3º Passo - Solicite que o usuário digite a segunda nota.");
        String nota2T = JOptionPane.showInputDialog("Digite a segunda nota:");

        JOptionPane.showMessageDialog(null, "4º Passo - Converter a nota para o formato americano, caso seja digitado no formato brasileiro.");
        nota2T = nota2T.replace(",", ".");
        float nota2 = Float.parseFloat(nota2T);

        JOptionPane.showMessageDialog(null, "5º Passo - Realiza o cálculo da média entre as notas digitadas.");
        float media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "6º Passo - Exibir o resultado da média das notas digitadas pelo usuário.");
        JOptionPane.showMessageDialog(null, "A média entre " + nota1 + " e " + nota2 + " é igual a " + String.format("%.2f", media) + ".");
    }
}