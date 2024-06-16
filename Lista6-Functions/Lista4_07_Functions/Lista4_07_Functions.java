package Lista4_07_Functions;
/* Ler um vetor X de 10 elementos (ler pelo teclado 
os 10 elementos do tipo inteiro). Crie um vetor Y 
da seguinte forma: (a) os elementos de ordem par de 
Y (elementos com índice 0, 2, 4, 6, 8) receberão os 
respectivos elementos de X multiplicados por 2; (b) 
Os elementos de ordem ímpar de Y (elementos com 
índices 1, 3, 5, 7, 9) receberão os respectivos 
elementos de X multiplicados por 3. Escrever o 
vetor Y. */

import java.util.Scanner; 

public class Lista4_07_Functions {
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

              int[] X = new int[10];
              int[] Y = new int[10];

              System.out.println("Digite os 10 elementos do vetor X: ");
              vetor(X, scanner);

              calcular(X, Y);

              System.out.println("vetor Y: ");
              imprimir(Y);

              scanner.close();
       }
       public static void vetor(int[] vetor, Scanner scanner){
              for(int i = 0; i < vetor.length; i++) {
                     vetor[i] = scanner.nextInt();
              }
       }
       public static void calcular(int[] X, int[] Y){
              for (int i = 0; i < X.length; i++) {
                     if (i % 2 == 0){
                            Y[i] = X[i] * 2;
                     } else {
                            Y[i] = X[i] * 3;
                     }
              }
       }

       public static void imprimir(int[] vetor) {
           for (int i = 0; i < vetor.length; i++) {
               System.out.println(vetor[i] + " ");
           }
       }
}
