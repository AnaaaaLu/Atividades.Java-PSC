/* Escreva um programa que leia pelo teclado 2 vetores (A e B) de 10 elementos
inteiros. Crie um terceiro vetor (C) que seja a união dos dois primeiros (10 + 
10). Mostre o vetor resultante. */

import java.util.Scanner;

public class Lista4_09 {
       public static void main(String[] args) {
              int[] A = new int[10];
              int[] B = new int[10];
              int[] C = new int[20];
              
              Scanner scanner = new Scanner(System.in);

              System.out.println("Digite os 10 elementos do vetor A:");
              for (int i = 0; i < 10; i++) {
                     A[i] = scanner.nextInt();
              }
              
              System.out.println("Digite os 10 elementos do vetor B:");
              for (int i = 0; i < 10; i++) {
                     B[i] = scanner.nextInt();
              }

              for (int i = 0; i < 10; i++) {
                     C[i] = A[i];
              }

              for (int i = 0; i < 10; i++) {
                     C[i + 10] = B[i];
              }

              System.out.println("Vetor resultante (C - união de A e B):");
              for (int i = 0; i < 20; i++) {
                     System.out.print(C[i] + " ");
              }
              
              scanner.close();
       }
}