/* Dada uma matriz M[1..6][1..8] criada randomicamente, criar um vetor C que
contenha em cada posição a quantidade de elementos negativos da linha 
correspondente de M. Tamanho de C igual ao número de linhas da matriz.*/

import java.util.Random;

public class Lista5_02 {
       public static void main(String[] args) {
              Random random = new Random();
              
              final int linhas = 6;
              final int colunas = 8;

              int[][] M = new int[linhas][colunas];
              
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            M[i][j] = random.nextInt(201) - 100;
                     }
              }
              
              System.out.println("Matriz gerada:");
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            System.out.print(M[i][j] + "\t");
                     }
                     System.out.println();
              }
              
              int[] C = new int[linhas];
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            if (M[i][j] < 0) {
                                   C[i]++;
                            }
                     }
              }
              
              System.out.println("\nQuantidade de elementos negativos em cada linha:");
              for (int i = 0; i < linhas; i++) {
                     System.out.println("Linha " + (i + 1) + ": " + C[i]);
              }
       }
}