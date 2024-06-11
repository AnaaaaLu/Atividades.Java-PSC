package Lista1_01_Functions; 

/* Construa programa em Java que leia (via teclado) dois números 
do tipo inteiro, calcule o produto entre eles e mostre o resultado. 
*/

import java.util.Scanner; 
public class Lista1_01_Functions{
       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int numero1 = numero (scanner, "Digite um número inteiro: ");
       int numero2 = numero (scanner, "Digite outro número inteiro: ");

       int resultado = produto(numero1, numero2);

       resultado(numero1, numero2, resultado);

       scanner.close();

       }

       public static int numero (Scanner scanner, String Message) {
              System.out.print(Message);
              return scanner.nextInt();
       }

       public static int produto (int numero1, int numero2) {
              return numero1 * numero2;
       }

       public static void resultado (int numero1, int numero2, int produto) {
              System.out.println("o produto é: "+ produto);
       }
}