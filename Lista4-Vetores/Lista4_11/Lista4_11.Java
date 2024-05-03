/* Escreva um programa que leia um vetor de 20 posições e 
mostre-o ordenado em ordem crescente. */

import java.util.Scanner;

public class Lista4_11 {
       public static void main(String[] args) {
              final int TAMANHO = 20;
              int[] vetor = new int[TAMANHO];
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Digite os " + TAMANHO + " números:");
              for (int i = 0; i < TAMANHO; i++) {
                     vetor[i] = scanner.nextInt();
              }
              
              for (int i = 0; i < TAMANHO - 1; i++) {
                     for (int j = 0; j < TAMANHO - i - 1; j++) {
                     if (vetor[j] > vetor[j + 1]) {
                            int temp = vetor[j];
                            vetor[j] = vetor[j + 1];
                            vetor[j + 1] = temp;
                     }
              }
       }
       
       System.out.println("Vetor ordenado em ordem crescente:");
       for (int i = 0; i < TAMANHO; i++) {
              System.out.print(vetor[i] + " ");
       }
       scanner.close();
       }
}