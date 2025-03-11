package Exercicios.SequenciasBasicas;


import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX12 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX12 - Crie um programa que leia o preço de um produto, calcule e " +
                "\nmostre o seu PREÇO PROMOCIONAL, com 5% de desconto.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicite que o usuário digite o valor do produto sem desconto.");
        String prodt = JOptionPane.showInputDialog("Digite o valor do produto:");

        JOptionPane.showMessageDialog(null, "2ºPasso - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        prodt = prodt.replace("," , ".");
        double prod = Double.parseDouble(prodt);

        JOptionPane.showMessageDialog(null, "3ºPasso - Solicite que o usuário digite o percentual de desconto.");
        int desc = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto: "));

        JOptionPane.showMessageDialog(null, "4ºPasso - Calcule o valor final do produto após o desconto.");
        double total = prod - (prod * desc / 100);

        JOptionPane.showMessageDialog(null, "5ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("PT", "BR");

        JOptionPane.showMessageDialog(null, "6ºPasso - Exiba o valor do produto com o desconto aplicado.");
        JOptionPane.showMessageDialog(null, "O valor do produto sem desconto é de " + NumberFormat.getCurrencyInstance(Brasil).format(prod) +
                "\n e com desconto de " + desc + "%" + " o valor final do produto após a aplicação do desconto é de " + NumberFormat.getCurrencyInstance(Brasil).format(total) + ".");
    }
}