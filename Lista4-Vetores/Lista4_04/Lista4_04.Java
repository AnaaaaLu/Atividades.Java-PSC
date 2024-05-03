/* Escreva um programa que leia e mostre um vetor de 20 elementos inteiros
(inicializado em tempo de compilação). A seguir, conte e diga quantos 
valores pares existem no vetor.*/
public class Lista4_04 {
       public static void main(String[] args) {
              int[] vetor = {2, 5, 10, 7, 8, 12, 15, 20, 22, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75};
              int countPares = 0;
              
              System.out.println("Vetor:");
              for (int i = 0; i < vetor.length; i++) {
                     System.out.print(vetor[i] + " ");
                     
                     if (vetor[i] % 2 == 0) {
                            countPares++;
                     }
              }
              
              System.out.println("\n\nNúmero de valores pares no vetor: " + countPares);
       }
}