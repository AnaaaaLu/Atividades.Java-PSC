/* Preencher um vetor A de 10 elementos (índices de 0 a 9) em tempo 
de execução com os números inteiros 10, 20, 30, 40, 50, ..., 100. 
Escrever o vetor A após o seu total preenchimento. */

public class Lista4_02 {
       public static void main(String[] args) {
              int [] A = new int[10]; 
              for (int i = 0; i < 10; i++) {
                     A[i] = (i + 1) * 10;
              }
              System.out.print("Vetor A preenchido: ");
              for (int i = 0; i < 10; i++) {
                     System.out.print(A[i] + " ");
              }
       }
}