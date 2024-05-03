/* */

import java.util.Random;

public class Lista5_02 {
       public static void main(String[] args) {
              final int LINHAS = 6;
              final int COLUNAS = 8;

              int[][] M = new int[LINHAS][COLUNAS];
              Random random = new Random();
      
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            M[i][j] = random.nextInt(201) - 100;
                     }
              }
              
              System.out.println("Matriz gerada:");
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            System.out.print(M[i][j] + "\t");
                     }
                     System.out.println();
              }
              
              int[] C = new int[LINHAS];
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            if (M[i][j] < 0) {
                                   C[i]++;
                            }
                     }
              }
              
              System.out.println("\nVetor C - Quantidade de elementos negativos em cada linha:");
              for (int i = 0; i < LINHAS; i++) {
                     System.out.println("Linha " + (i + 1) + ": " + C[i]);
              }
       }
}