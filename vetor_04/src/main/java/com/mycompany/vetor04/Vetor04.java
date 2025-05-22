/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor04;

import java.util.Arrays;

/**
 *
 * @author marksaurelio
 */
public class Vetor04 {

    public static void main(String[] args) {
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        for (int elemento:vetor) {
            System.out.print(elemento + " ");
        }
        int posicao = Arrays.binarySearch(vetor, 1); // quando buscar um elemento
        // que não esteja no vetor, retorna o elemento negativo
        System.out.print("\nEncontrei o elemento na posição " + posicao);
    }
}
