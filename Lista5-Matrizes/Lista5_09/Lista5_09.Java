/* Faça um algoritmo que leia uma matriz 3x3 e após a leitura multiplique os
elementos da diagonal principal com a média dos elementos da diagonal secundária. */

import java.util.Random;

public class Lista5_09 {
       public static void main(String[] args) {
              Random random = new Random();
              int[][] matriz = new int[3][3];

              for (int i = 0; i < 3; i++) {
                     for (int j = 0; j < 3; j++) {
                            matriz [i][j] = random.nextInt(31);
                     }
              }

              System.out.println("matriz randomizada: ");
              for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 3; j++) {
                     System.out.print(matriz[i][j] + "\t");
                  }
                  System.out.println();
              }

              int soma = 0;
              for (int i = 0; i < 3; i++) {
                     soma += matriz[i][i]; 
              }
              
              double media = (double) soma / 3;

              for(int i = 0; i < 3; i++) {
                     matriz[i][i] *= media;
              }
         
              System.out.println("Matriz resultante: ");
              for (int i = 0; i < 3; i++) {
                     for (int j = 0; j < 3; j++) {
                            System.out.print(matriz[i][j] + "\t");
                     }
                     System.out.println();
              }
       }
}