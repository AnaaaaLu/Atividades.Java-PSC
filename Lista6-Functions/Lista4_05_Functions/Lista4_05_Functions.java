package Lista4_05_Functions;
/* Escreva um programa que leia dois vetores (A e B) de 10 posições e faça a
multiplicação dos elementos de mesmo índice em ambos os vetores colocando o 
resultado em um terceiro vetor (C). Mostre o vetor resultante.*/

import java.util.Scanner;

public class Lista4_05_Functions {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           
           int[] A = new int[10];
           int[] B = new int[10];
           int[] C = new int[10];
           
           System.out.println("Digite os elementos do vetor A: ");
           vetor(A, scanner);

           System.out.println("Digite os elementos do vetor B: ");
           vetor(B, scanner);

           multiplicação(A, B, C);

           System.out.println("Produto: ");
           produto(C); 

           scanner.close();
       }
       public static void vetor(int[] vector, Scanner scanner) {
              for (int i = 0; i < vector.length; i++){
                     vector[i] = scanner.nextInt();
              }
       }
       public static void multiplicação(int[] A, int[] B, int[] C){
              for (int i = 0; i < A.length; i++) {
                     C[i] = A[i] * B[i];                  
              }
       }
       public static void produto(int[] vector) {
              for (int i = 0; i < vector.length; i++){
                     System.out.print(vector[i] + " ");
              }
       }
}
