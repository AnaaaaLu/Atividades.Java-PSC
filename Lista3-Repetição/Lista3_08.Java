/*Escreva um algoritmo para imprimir os 50 primeiros 
números primos maiores que 100. Obs.: Número primo é 
aquele divisível somente por 1 e ele mesmo.
*/

public class Lista3_08{
       public static void main(String[] args) {
              int conta = 0;
              int numero = 101;
      
              while (conta < 50) {
                  if (primo(numero)) {
                      System.out.print(numero + " ");
                      conta++;
                  }
                  numero++;
              }
          }
      
          public static boolean primo(int numero) {
              if (numero <= 1) {
                  return false;
              }
              for (int i = 2; i <= Math.sqrt(numero); i++) {
                  if (numero % i == 0) {
                      return false;
                  }
              }
              return true;
          }
      }