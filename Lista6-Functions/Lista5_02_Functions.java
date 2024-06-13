/* Dada uma matriz M[1..6][1..8] criada randomicamente, criar um vetor C que
contenha em cada posição a quantidade de elementos elementosNegativos da linha 
correspondente de M. Tamanho de C igual ao número de linhas da matriz.*/

import java.util.Random;

public class Lista5_02_Functions {
       public static void main(String[] args) {
              Random random = new Random();
              
              final int linhas = 6;
              final int colunas = 8;
              
              int[][] M = new int[linhas][colunas];
        
              gerar(M, random);
              System.out.println("Matriz gerada:");
              matrix(M);
        
              int[] C = elementosNegativos(M);
              System.out.println("\nQuantidade de elementos negativos em cada linha:");
              imprimir(C);
       }

    public static void gerar(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(201) - 100;
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

    public static int[] elementosNegativos(int[][] matriz) {
        int[] contagem = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contagem[i]++;
                }
            }
        }
        return contagem;
    }

    public static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + vetor[i]);
        }

       }
}