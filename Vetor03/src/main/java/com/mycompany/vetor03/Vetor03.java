/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor03;

import java.util.Arrays;

/**
 *
 * @author marksaurelio
 */
public class Vetor03 {

    public static void main(String[] args) {
        double vetor [] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(vetor);
        for (double valor: vetor){
            System.out.print(valor + " ");
        }
    }
}
