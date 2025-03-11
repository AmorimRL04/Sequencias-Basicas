package Exercicios.SequenciasBasicas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX03 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "EX03 - Crie um programa que leia o nome e o salário de um funcionário, " +
                "\nmostrando no final uma mensagem: " +
                "\nEx:" +
                "\nNome do Funcionário: Maria do Carmo " +
                "\nSalário: 1850,45 " +
                "\nO funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicite que o usuário digite o nome:");
        String nome = JOptionPane.showInputDialog("Nome do Funcionário:");

        JOptionPane.showMessageDialog(null, "2º Passo - Solicite que o usuário digite o salário:");
        String salarioTexto = JOptionPane.showInputDialog("Salário:");

        JOptionPane.showMessageDialog(null, "3º Passo - Substituir a vírgula pelo ponto para conversão correta do valor");
        salarioTexto = salarioTexto.replace(",", ".");

        float salario = Float.parseFloat(salarioTexto);

        JOptionPane.showMessageDialog(null, "4º Passo - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("pt", "BR");

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir a mensagem com o nome do funcionário e o seu salário.");
        JOptionPane.showMessageDialog(null, "O funcionário " + nome + " tem um salário de " +
                NumberFormat.getCurrencyInstance(Brasil).format(salario) + " em Junho.");
    }
}
