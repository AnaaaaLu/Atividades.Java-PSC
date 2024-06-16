package Lista5_08_Functions;
/* Faça um algoritmo que calcule a média dos elementos 
da diagonal principal de uma matriz 10X10 de inteiros. */

import java.util.Random;

public class Lista5_08_Functions {
       public static void main(String[] args) {
           Random random = new Random();

           int[][] matriz = new int[10][10];

           gerar(matriz, random);
           
           System.out.println("Matriz Randomizada: "); 
           matrix(matriz);

           double media = diagonal(matriz);

           System.out.println("media dos elementos: " + media);
       }

       public static void gerar(int[][] matriz, Random random) {
              for (int i = 0; i < 10; i++) {
                     for (int j = 0; j < 10; j++) {
                            matriz[i][j] = random.nextInt(101);
                     }
              }
       }

       public static void matrix(int[][] matriz) {
              for (int[] linha : matriz) {
                  for (int elemento : linha) {
                      System.out.print(elemento + "\t");
                     }
                     System.out.println();
              }
       }

       public static double diagonal(int[][] matriz) {
              int soma = 0;
              for (int i = 0; i < 10; i++) {
                     soma += matriz[i][i];
              }
              return (double) soma / 10;
       }
}
