/* Faça um algoritmo que gere randomicamente uma matriz de 
10 X 10 de inteiros. Calcule e mostre a soma das linhas 
pares da matriz. */

import java.util.Random;

public class Lista5_04 {
       public static void main(String[] args) {
              final int LINHAS = 10;
              final int COLUNAS = 10;
              
              int[][] matriz = new int[LINHAS][COLUNAS];
              Random random = new Random();
              
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            matriz[i][j] = random.nextInt(101);
                     }
              }
              
              System.out.println("Matriz gerada:");
              for (int i = 0; i < LINHAS; i++) {
                     for (int j = 0; j < COLUNAS; j++) {
                            System.out.print(matriz[i][j] + "\t");
                     }
                     System.out.println();
              }
              
              System.out.println("\nSoma das linhas pares:");
              for (int i = 0; i < LINHAS; i += 2) {
                     int somaLinhaPar = 0;
                     for (int j = 0; j < COLUNAS; j++) {
                            somaLinhaPar += matriz[i][j];
                     }
                     System.out.println("Linha " + (i + 1) + ": " + somaLinhaPar);
              }
       }
}