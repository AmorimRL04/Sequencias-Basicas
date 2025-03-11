package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX10 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX10 - Faça um algoritmo que leia a largura e altura de uma parede," +
                "\ncalcule e mostre a área a ser pintada e a quantidade de tinta " +
                "\nnecessária para o serviço, sabendo que cada litro de tinta pinta " +
                "\n uma área de 2metros quadrados. ");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicite para o usuário que ele digite a largura da parede.");
        String largurat = JOptionPane.showInputDialog("Digite a largura da parede:");

        JOptionPane.showMessageDialog(null, "2ºPasso - Converter a largura digitado para o formato americano, caso seja digitado no formato brasileiro.");
        largurat = largurat.replace(",", ".");
        float largura = Float.parseFloat(largurat);

        JOptionPane.showMessageDialog(null, "3ºPasso - Solicite para o usuário que ele digite a altura da parede.");
        String alturat = JOptionPane.showInputDialog("Digite a altura da parede:");

        JOptionPane.showMessageDialog(null, "4ºPasso - Converter a altura digitado para o formato americano, caso seja digitado no formato brasileiro.");
        alturat = alturat.replace(",", ".");
        float altura =Float.parseFloat(alturat);

        JOptionPane.showMessageDialog(null, "5ºPasso - Realizar o calculo da área que será pintada.");
        double area = largura * altura;

        JOptionPane.showMessageDialog(null, "6ºPasso - Realizar o calculo de quanta tinta será necessária para pintar a área calculada.");
        double tinta = area / 2;

        JOptionPane.showMessageDialog(null, "7ºPasso - Exibir a área e a quantidade necessária de tinta para pintar a parede .");
        JOptionPane.showMessageDialog(null, "A área que sera pintada será de " + String.format("%.2f", area) + "m²," +
                "\nserá necessário um total de " + String.format("%.2f", tinta) + " litros de tinta para pintar a parede.");

    }
}
