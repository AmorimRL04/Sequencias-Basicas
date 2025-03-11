package Exercicios.SequenciasBasicas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX15 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX15 - Crie um programa que leia o número de dias trabalhados em um " +
                "\nmês e mostre o salário de um funcionário, sabendo que ele trabalha" +
                "\n8 horas por dia e ganha R$25 por hora trabalhada.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Guarde as horas trabalhas por dia e valor pago por hora trabalhada.");
        int horasdia = 8;
        double horatrab = 25.00;

        JOptionPane.showMessageDialog(null, "2ºPasso - Solicite que o usuário digite quantos dias e total de de horas foram trabalhados.");
        int diastrab = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias foram trabalhados:"));

        JOptionPane.showMessageDialog(null, "3ºPasso - Calcule o salário do funcionário.");
        double totalhorastrab = horasdia * diastrab;
        double salario = totalhorastrab * horatrab;

        JOptionPane.showMessageDialog(null, "4ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("PT", "BR");

        JOptionPane.showMessageDialog(null, "5ºPasso - Exibir o salário, quantos dias foram trabalhados e o total de horas trabalhadas");
        JOptionPane.showMessageDialog(null, "O funcionário trabalhou " + diastrab + " dias, dando um total de " + totalhorastrab + " horas trabalhadas. " +
                "\nAssim gerando um salário de " + NumberFormat.getCurrencyInstance(Brasil).format(salario) + ".");
    }
}
