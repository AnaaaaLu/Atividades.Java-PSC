/* Preencher um vetor B de 10 elementos em tempo de 
execução com o número 10 se o índice do elemento for 
ímpar, e com o número 20 se for par. Escrever o vetor 
B após o seu total preenchimento. */

public class Lista4_03 {
       public static void main(String[] args) {
              int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                B[i] = 20; 
            } else {
                B[i] = 10;
            }
        }
        System.out.print("Vetor B após o preenchimento: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
    }
}