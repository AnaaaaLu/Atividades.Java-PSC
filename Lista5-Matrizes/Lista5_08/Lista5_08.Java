/* Faça um algoritmo que calcule a média dos elementos 
da diagonal principal de uma matriz 10X10 de inteiros. */

import java.util.Random;

public class Lista5_08 {
       public static void main(String[] args) {
              Random random = new Random();

              int[][] matriz = new int[10][10];

              for (int i = 0; i < 10; i++) {
                     for (int j = 0; j < 10; j++) {
                            matriz [i][j] = random.nextInt(101);
                     }
              }

              System.out.println("matriz randomizada: ");
              for (int i = 0; i < 10; i++) {
                  for (int j = 0; j < 10; j++) {
                     System.out.print(matriz[i][j] + "\t");
                  }
                  System.out.println();
              }

              int soma = 0;
              for (int i = 0;i < 10; i++) {
                     soma += matriz[i][i]; 
              }
              
              double media = (double) soma / 10;
         
              System.out.println("Média dos elementos da diagonal principal: " + media);

       }
}