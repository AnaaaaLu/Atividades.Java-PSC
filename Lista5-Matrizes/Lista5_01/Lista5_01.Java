/* Faça um algoritmo que gere aleatoriamente uma matriz de inteiros 7 x 9,
imprima a matriz e calcule e imprima a soma dos seus elementos. */

import java.util.Random;

public class Lista5_01 {
       public static void main(String[] args) {
              final int LINHAS = 7;
              final int COLUNAS = 9;
              int[][] matriz = new int[LINHAS][COLUNAS];              
              
              Random random = new Random();
              
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            matriz[i][j] = random.nextInt(100);
                     }
              }

              System.out.println("Matriz gerada:");
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            System.out.print(matriz[i][j] + "\t");
                     }
                     System.out.println();
              }
              
              int soma = 0;
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            soma += matriz[i][j];
                     }
              }
              
              System.out.println("\nSoma dos elementos da matriz: " + soma);
       }
}