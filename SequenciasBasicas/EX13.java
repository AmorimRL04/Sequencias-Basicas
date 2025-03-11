package Exercicios.SequenciasBasicas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX13 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX13 - Faça um algoritmo que leia o salário de um funcionário, " +
                "\ncalcule e mostre o seu novo salário, com 15% de aumento. ");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicite que o usuário digite o valor do Salário do Funcionário");
        String salariot = JOptionPane.showInputDialog("Digite o Salário:");

        JOptionPane.showMessageDialog(null, " 2ºPasso - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        salariot = salariot.replace(",",".");
        double salario = Double.parseDouble(salariot);

        JOptionPane.showMessageDialog(null, "3ºPasso - Solicite que o usuário digite o percentual de aumento do Funcionário.");
        int aum = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de aumento: "));

        JOptionPane.showMessageDialog(null, "4ºPasso - Calcule o novo salário do Funcionário.");
        double total = salario + (salario * aum / 100);

        JOptionPane.showMessageDialog(null, "5ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("PT", "BR");

        JOptionPane.showMessageDialog(null, "6ºPasso - Exibir o salário original do Funcionário, e o seu novo salário com o percentual que ele teve de aumento.");
        JOptionPane.showMessageDialog(null, "O salário do funcionário original é de " + NumberFormat.getCurrencyInstance(Brasil).format(salario) + "." +
                "\nCom um aumento de " + aum + "%, o salário passará a ser de " + NumberFormat.getCurrencyInstance(Brasil).format(total) + ".");
    }
}