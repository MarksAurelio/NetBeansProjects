/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author marksaurelio
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        int n, s = 0;
        int totalValores = 0;
        int totalPares = 0;
        int totalImpares = 0;
        int acimaCem = 0;
        
        do {
            String valor = JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)<em></html>");
            try{
                n = Integer.parseInt(valor);
                if (n != 0) {
                    totalValores++;
                    s += n;
                    if (n % 2 == 0) {
                        totalPares++;
                    } else {
                    totalImpares++;
                    } 
                    if (n > 100) {
                        acimaCem++;
                    }
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valor inválido! Por favor, informe um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
                n = 1; // Para continuar o loop até que um 0 seja digitado
            }
        } while (n != 0);
        
        double media = (totalValores > 0) ? (double) s / totalValores : 0;

        String resultado = "<html>Resultado final <hr>";
        resultado += "<br>Total de valores digitados: " + totalValores;
        resultado += "<br>Somatório dos valores: " + s;
        resultado += "<br>Total de números pares: " + totalPares;
        resultado += "<br>Total de números ímpares: " + totalImpares;
        resultado += "<br>Total de valores acima de 100: " + acimaCem;
        resultado += "<br>Média dos valores: " + String.format("%.2f", media);
        resultado += "</html>";

        JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE); 
    }
}
