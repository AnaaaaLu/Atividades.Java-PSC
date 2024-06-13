/* Faça um algoritmo que gere aleatoriamente uma matriz de inteiros 7 x 9,
imprima a matriz e calcule e imprima a soma dos seus elementos. */

import java.util.Random;

public class Lista5_01_Functions {
       public static void main(String[] args) {
           Random random = new Random();

           final int linhas = 7;
           final int colunas = 9;

           int[][] matriz = new int[linhas][colunas];

           gerar(matriz, random);
           System.out.println("Matriz gerada: ");
           imprimir (matriz);

           int soma = resultado(matriz);
           System.out.println("Soma dos elementos da matriz: " + soma);
       }

       public static void gerar(int[][] matriz, Random random) {
              for (int i = 0; i< matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                     matriz[i][j] = random.nextInt(100);
                    } 
              }
       }

       public static void imprimir(int[][] matriz) {
              for (int[] linha : matriz) {
                     for (int elemento : linha) {
                            System.out.print(elemento + "\t");
                     }
                     System.out.println();
              }
       }

       public static int resultado(int[][] matriz) {
              int soma = 0;
              for (int[] linha : matriz) {
                     for (int elemento : linha) {
                            soma += elemento;
                     }
              }
              return soma;
       }
}

