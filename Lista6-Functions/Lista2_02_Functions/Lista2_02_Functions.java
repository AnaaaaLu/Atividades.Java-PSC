package Lista2_02_Functions;
/* Construa um programa em Java para ler um valor, 
verificar se é maior do que 100 e mostrar essa 
informação. (DICA: Usar if/else para mostrar se 
valor é > ou < 100)
*/

import java.util.Scanner;
public class Lista2_02_Functions {
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in); 
              int numero = numeroNovo (scanner, "Digite um número: ");
              
              System.out.println(verifyOdd(numero));
              
              scanner.close();
       }
       
       public static int numeroNovo(Scanner scanner, String message) {
              System.out.print(message);
              return scanner.nextInt();
       }
       public static String verifyOdd(int numero) {
              if (numero % 2 == 0) {
                     return "é par!";
              } else {
                     return "é impar!";
              }
       }
}