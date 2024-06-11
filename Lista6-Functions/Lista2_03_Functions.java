/* Construa um programa em Java para ler dois valores e mostrar 
o maior deles. (DICA: Usar if/else para mostrar o maior dos 
valores digitados)
*/

import java.util.Scanner;
public class Lista2_03_Functions {
       public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int numero1 = numero(scanner, "Digite um número: ");
       int numero2 = numero(scanner, "Digite outro número: ");

       System.out.println(smallerBigger(numero1, numero2));
       
       scanner.close();
       }

       public static int numero(Scanner scanner, String message){
              System.out.print(message);
              return scanner.nextInt();
       }
       public static String smallerBigger(int numero1, int numero2){
              if (numero1 > numero2) {
                     return ("o número maior é: " + numero1);
              } else {
                     return ("o número maior é: " + numero2);
              }
       }
}
