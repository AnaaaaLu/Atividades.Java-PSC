/* Dadas duas matrizes A 5x5 e B 5x5 inicializadas pelo usuário 
via teclado, criar e imprimir a matriz S sendo a soma de A e B. */

import java.util.Random;

public class Lista5_05 {
       public static void main(String[] args) {
              final int linhas = 5;
              final int colunas = 5;
              
              int[][] A = new int[linhas][colunas];
              int[][] B = new int[linhas][colunas];
              int[][] S = new int[linhas][colunas];
              
              Scanner scanner = new Scanner(System.in);+
              
              System.out.println("Digite os elementos da matriz A: ");
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            A[i][j] = scanner.nextInt();
                     }
              }
              
              System.out.println("Digite os elementos da matriz B: ");
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            B[i][j] = scanner.nextInt();
                     }
              }
              
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            S[i][j] = A[i][j] + B[i][j];
                     }
              }
              
              System.out.println("\nMatriz S: ");
              for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                            System.out.print(S[i][j] + "\t");
                     }
                     System.out.println();
              }
              
              scanner.close();
       }
}