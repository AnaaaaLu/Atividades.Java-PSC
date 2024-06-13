/* Faça um algoritmo que gere randomicamente uma matriz de 
10 X 10 de inteiros. Calcule e mostre a soma das linhas 
pares da matriz. */

import java.util.Random;

public class Lista5_04 {
       public static void main(String[] args) {
              final int linhas = 10;
              final int colunas = 10;
              
              int[][] matriz = new int[linhas][colunas];
              Random random = new Random();
              
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            matriz[i][j] = random.nextInt(101);
                     }
              }
              
              System.out.println("Matriz:");
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            System.out.print(matriz[i][j] + "\t");
                     }
                     System.out.println();
              }
              
              System.out.println("\nSoma das linhas pares: ");
              for (int i = 0; i < linhas; i += 2) {
                     int somaLinhaPar = 0;
                     for (int j = 0; j < colunas; j++) {
                            somaLinhaPar += matriz[i][j];
                     }
                     System.out.println("Linha " + (i + 1) + ": " + somaLinhaPar);
              }
       }
}