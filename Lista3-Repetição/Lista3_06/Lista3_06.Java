/* Escreva um programa em Java que receba um número e 
faça a tabuada desse número de 1 a 10. Parar o algoritmo 
quando o usuário digitar um número negativo. 
 */

import java.util.Scanner;

public class Lista3_06{
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              int numero; 

              do {
                     System.out.print("Digite um número inteiro:");
                     numero = scanner.nextInt();
         
                     if (numero > 0) {
                         System.out.println("Tabuada de " + numero + ":");
                         for (int i = 1; i <= 10; i++) {
                             System.out.println(numero + " x " + i + " = " + (numero * i));
                         }
                         System.out.println();
                     }
                 } while (numero > 0);
         
                 System.out.println("Numero inválido, tente novamente mais tarde");



              scanner.close();
       } 
}