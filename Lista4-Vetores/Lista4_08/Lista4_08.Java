/* Ler um vetor M de 10 elementos e imprimi-lo (ler pelo teclado os 10
elementos do tipo inteiro). Troque a seguir o 1º elemento com o 6º, o 
2º com o 7º, e assim por diante até o 5º com 10º, e escreva o vetor M 
modificado. */

import java.util.Scanner; 

public class Lista4_08 {
       public static void main(String[] args) {
              int[] M = new int[10];
              Scanner scanner = new Scanner (System.in)
              
              System.out.println("Digite os 10 elementos do vetor M:");
              for (int i = 0; i < 10; i++) {
                     M[i] = scanner.nextInt();
              }

              System.out.println("Vetor M original:");
              for (int i = 0; i < 10; i++) {
                     System.out.print(M[i] + " ");
              }

              for (int i = 0; i < 5; i++) {
                     int temp = M[i];
                     M[i] = M[i + 5];
                     M[i + 5] = temp;
              }
              
              System.out.println("\n\nVetor M modificado:");
              for (int i = 0; i < 10; i++) {
                     System.out.print(M[i] + " ");
              }
       
              scanner.close();
       }
}