/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programamedia;

import java.util.Scanner;

/**
 *
 * @author marksaurelio
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Segunga nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("Sua média foi " + m);
        if (m>9){ 
            System.out.println("Parabéns!");
        }
    }
}
