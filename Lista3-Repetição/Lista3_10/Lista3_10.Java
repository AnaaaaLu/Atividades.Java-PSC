/* Escreva um algoritmo que receba um número inteiro positivo. 
Fazer a multiplicação + a impressão do número recebido iniciando 
em 1 até chegar ao número recebido (incluindo o número recebido). 
Parar o algoritmo quando o usuário digitar 0.
*/
import java.util.Scanner;
public class Lista3_10{
       public static void main(String[] args) {
              Scanner scanner =  new Scanner(System.in);
              int numero;

              do {
                     System.out.println("Digite um numero inteiro positivo: ");
                     numero = scanner.nextInt();

                     if (numero > 0) {
                            for(int i = 1; i<= numero; i++){
                                   System.out.println(numero + " x " + i + " = " + (numero * i));
                            }
                            System.out.println();
                     }
              } while (numero != 0);
              
              System.out.println("Fim!");
              scanner.close();
       }
}