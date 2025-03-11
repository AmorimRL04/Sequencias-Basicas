package Exercicios.SequenciasBasicas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX09 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Faça um algoritmo que leia quanto dinheiro uma pessoas tem na " +
                "\ncarteira (em R$) e mostre quantos dólares ela pode comprar. " +
                "\nConsidere U$1,00 = R$3,45.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicitar para que o usuário digite qual em R$ ele tem na carteira.");
        String saldot = JOptionPane.showInputDialog("Digite quanto você tem em sua carteira em R$:");

        JOptionPane.showMessageDialog(null, "2ºPasso - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        saldot = saldot.replace(",",".");
        float saldo = Float.parseFloat(saldot);

        JOptionPane.showMessageDialog(null, "3ºPasso - Escolher o formato da moeda do valor digitado pelo usuário.");
        Locale Brasil = new Locale("PT", "BR");

        JOptionPane.showMessageDialog(null, "4ºPasso - Escolher o formato da moeda do valor que será para o usuário.");
        Locale Eua = new Locale("EN", "US");

        JOptionPane.showMessageDialog(null, "5ºPasso - Converter a moeda de R$ para U$");
        double dollar = 3.45;
        double conversao = saldo / dollar;

        JOptionPane.showMessageDialog(null, "6ºPasso - Exibir o resultado conversão do saldo da carteira do usuário de R$ para US.");
        JOptionPane.showMessageDialog(null, "O saldo na carteira é de " + NumberFormat.getCurrencyInstance(Brasil).format(saldo) + ".\n" + "O saldo convertido para dollar é de " + NumberFormat.getCurrencyInstance(Eua).format(conversao) + ".");
    }
}
