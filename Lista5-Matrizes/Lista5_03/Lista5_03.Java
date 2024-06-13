/* Faça um algoritmo que gere randomicamente uma matriz de 5 X 5 de inteiros 
positivos e mostre a soma de cada coluna separadamente. */

import java.util.Random;

public class Lista5_03 {
       public static void main(String[] args) {
              final int linhas = 5;
              final int coluna = 5;
      
              int[][] matriz = new int[linhas][coluna];
              Random random = new Random();

              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < coluna; j++) {
                            matriz[i][j] = random.nextInt(100) + 1;
                     }
              }

              System.out.println("Matriz: ");
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < coluna; j++) {
                            System.out.print(matriz[i][j] + "\t");
                     }
                     System.out.println();
              }
              
              System.out.println("\nSoma de cada coluna: ");
              for (int j = 0; j < coluna; j++) {
                     int somaColuna = 0;
                     for (int i = 0; i < linhas; i++) {
                            somaColuna += matriz[i][j];
                     }
                     
                     System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
              }
       }
}