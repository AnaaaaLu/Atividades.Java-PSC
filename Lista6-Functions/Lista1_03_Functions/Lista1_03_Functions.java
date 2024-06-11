package Lista1_03_Functions;
/* Construa um programa em Java para ler (via teclado) quatro 
números do tipo inteiro, calcule e mostre o resultado da média 
aritmética entre eles. Usar “float” para o tipo de dado da 
variável que irá armazenar o resultado da média aritmética e 
imprimir o resultado com duas casas decimais depois da vírgula 
(%.2f).
*/

import java.util.Scanner;
public class Lista1_03_Functions {
       public static void main(String[] args) {
              Scanner scanner = new Scanner (System.in);
              
              int numero1 = numero (scanner, "Digite um número inteiro: ");
              int numero2 = numero (scanner, "Digite outro número inteiro: ");
              int numero3 = numero (scanner, "Digite mais um número inteiro: ");
              int numero4 = numero (scanner, "Digite um último número inteiro: ");
               
              int total = soma (numero1, numero2, numero3, numero4);
              float media = calcularMedia(total, 4);
               
              resultado(numero1, numero2, numero3, numero4, media);

              scanner.close();
       }

       public static int numero(Scanner scanner, String message) {
              System.out.print(message);
              return scanner.nextInt();
       }

       public static int soma(int numero1, int numero2, int numero3, int numero4) {
              return numero1 + numero2 + numero3 + numero4;
       }

       public static float calcularMedia(int total, int quantity) {
              return (float) total / quantity; 
       }

       public static void resultado(int numero1, int numero2, int numero3, int numero4, float media) {
              System.out.println("a média aritmética dos números " + numero1 + ", " + numero2 + ", " + numero3 + " e " + numero4 + " é igual a: " + media);
       }
}
