package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX02 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX02 - Faça um programa que leia o nome " +
                "\n de uma pessoa e mostre uma " +
                "\n mensagem de boas-vindas para ela: " +
                "\n Ex:" +
                " \nQual é o seu nome? João da Silva " +
                "\nOlá João da Silva, é um prazer te conhecer");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicite para que o usuário digite o seu nome.");
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");

        JOptionPane.showMessageDialog(null, "2ºPasso - Exiba a mensagem de boas-vindas junto com o nome do usuário.");
        JOptionPane.showMessageDialog(null, "Olá " + nome +", é um prazer te conhecer!  ");

    }
}




