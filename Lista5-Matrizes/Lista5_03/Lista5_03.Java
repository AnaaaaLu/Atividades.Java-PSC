/* Faça um algoritmo que gere randomicamente uma matriz de 5 X 5 de inteiros 
positivos e mostre a soma de cada coluna separadamente. */

import java.util.Random;

public class Lista5_03 {
       public static void main(String[] args) {
              final int LINHAS = 5;
              final int COLUNAS = 5;
      
              int[][] matriz = new int[LINHAS][COLUNAS];
              Random random = new Random();

              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            matriz[i][j] = random.nextInt(100) + 1;
                     }
              }

              System.out.println("Matriz gerada:");
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            System.out.print(matriz[i][j] + "\t");
                     }
                     System.out.println();
              }
              
              System.out.println("\nSoma de cada coluna:");
              for (int j = 0; j < COLUNAS; j++) {
                     int somaColuna = 0;
                     for (int i = 0; i < LINHAS; i++) {
                            somaColuna += matriz[i][j];
                     }
                     
                     System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
              }
       }
}