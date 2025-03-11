package Exercicios.SequenciasBasicas;

import javax.swing.*;

public class EX16 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "EX16 - Escreva um programa para calcular a redução de tempo" +
                "\nde vida de um fumante. Pergunte a quantidade de cigarros fumados" +
                "\npor dias e quantos anos ele já fumou. Considere que um fumante." +
                "\nperde 10 min de vida a cada cigarro. Calcule quantos dias de vida" +
                "\num fumante perderá e o total em dias.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Guardar os minutos perdidos por cigarro fumado e converter dias em minutos.");
        float min = 10;
        float dias = 365;
        float mindia = 1440;

        JOptionPane.showMessageDialog(null, "2ºPasso - Solicite que o usuário digite a quantidade de cigarros ele fuma por dia.");
        int cigarros = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos cigarros você fuma por dia:"));

        JOptionPane.showMessageDialog(null, "3ºPasso - Solicite que o usuário digite a quantos anos ele já fuma.");
        String anost = JOptionPane.showInputDialog("Digite há quantos anos você fuma:");

        JOptionPane.showMessageDialog(null, "4ºPasso - Converter o número digitado para decimais e para o formato americano, caso seja digitado no formato brasileiro.");
        anost = anost.replace(",", ".");

        JOptionPane.showMessageDialog(null, "5º Passo - Converter a string do número de anos para um valor decimal");
        double anos = Double.parseDouble(anost);

        JOptionPane.showMessageDialog(null, "6º Passo - Calcular quantos dias de vida foram perdidos por fumar.");
        double totalcigarros = cigarros * (anos * dias);

        JOptionPane.showMessageDialog(null, "7º Passo - Calcular o total de minutos perdidos devido ao cigarro");
        double minutosperdidos = totalcigarros * min;

        JOptionPane.showMessageDialog(null, "8º Passo - Calcular quantos dias de vida foram perdidos");
        double diasperdidos = minutosperdidos / mindia;

        JOptionPane.showMessageDialog(null, "9ºPasso - Exibir quantos dias de vida foram perdidos por fumar.");
        JOptionPane.showMessageDialog(null, "Em " + anos + " anos foram fumados um total de " + totalcigarros + "." +
                "\nLevando a um total de " + String.format("%.2f", diasperdidos) + " dias perdidos de vida. ");

        JOptionPane.showMessageDialog(null, "'10º Passo - Exibir uma mensagem de conscientização sobre parar de fumar");
        JOptionPane.showMessageDialog(null, "Considere reduzir ou parar de fumar para melhorar sua saúde!");
    }
}
