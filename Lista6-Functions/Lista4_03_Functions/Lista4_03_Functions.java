package Lista4_03_Functions;
/* Preencher um vetor B de 10 elementos em tempo de 
execução com o número 10 se o índice do elemento for 
ímpar, e com o número 20 se for par. Escrever o vetor 
B após o seu total preenchimento. */

public class Lista4_03_Functions {
       public static void main(String[] args){
              int[] B = new int[10];

              preenche(B);
       }
       public static void preenche(int[] array) {
              for (int i = 0; i < 10; i++) {
                     if (i % 2 == 0){
                            array[i] = 20;
                     } else {
                            array[i] = 10;
                     }
              }
              System.out.print("vetor B após o preenchimento: "); 
              for (int i = 0; i < array.length; i++) {
                     System.out.print(array[i] + " ");                 
              }
       }
}
