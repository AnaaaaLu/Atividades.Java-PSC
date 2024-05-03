/* Escreva um programa que leia um vetor de 30 posições de números inteiros
(inicializado em tempo de compilação) e mostre somente os positivos com suas
respectivas posições. */

public class Lista4_06 {
       public static void main(String[] args) {
              int[] vetor = {-3, 5, -8, 10, 0, 15, -20, 25, 30, -35, 0, 
                     40, -45, 50, 55, -60, 65, 70, -75, 80, 85, -90, 95, 
                     100, 105, -110, 115, 120, -125, 130};
                     
              System.out.println("Posições dos números positivos no vetor:");
              for (int i = 0; i < vetor.length; i++) {
                     if (vetor[i] > 0) {
                            System.out.println("Posição " + i + ": " + vetor[i]);
                     }
              }
       }
}