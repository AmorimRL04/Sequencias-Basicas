package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX07 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX07 - Crie um algoritmo que leia um número real e mostre na tela " +
                "\no seu dobro e a sua terça parte." +
                "\nEx: + " +
                "\nDigite um número: 3.5 " +
                "\n dobro de 3.5 é 7.0" +
                "\nA terça parte de 3.5 é 1.16666");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicitar para que o usuário digite um número.");
        String num1t = JOptionPane.showInputDialog("Digite um número: ");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        num1t = num1t.replace(",", ".");
        float num1 = Float.parseFloat(num1t);

        JOptionPane.showMessageDialog(null, "3ºPasso - Calcular qual é o dobro do número digitado.");
        float dobro = num1 * 2;

        JOptionPane.showMessageDialog(null, "4ºPasso - Calcular qual é a terça parte do número digitado.");
        float terca = num1 / 3;

        JOptionPane.showMessageDialog(null, "5ºPasso - Exibir qual é o  resultado do calculo do dobro e da terça parte do número digitado.");
        JOptionPane.showMessageDialog(null, "O dobro de " + num1 + " é " + dobro + "." +
                "\nA terça parte de " + num1 +" é " + String.format("%.5f", terca) +".");
    }
}
