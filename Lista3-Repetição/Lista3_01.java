/* (ExeRepeticao01) Crie um programa em Java que receba do usuário 
um número inteiro positivo e informe os totais de números pares e 
ímpares encontrados entre 1 e o número digitado + o somatório dos 
pares e ímpares separadamente. 
*/

import java.util.Scanner;

public class Lista3_01 {
       public static void main(String[] args) throws Exception {
             Scanner scanner = new Scanner(System.in);              
              
              System.out.print("Digite um número inteiro positivo: ");
              int numero = scanner.nextInt();
              
              if (numero <= 0) {
                     System.out.println("O número digitado não é válido.");
                     return;
              }
              
              int totalPares = 0;
              int totalImpares = 0;
              int somaPares = 0;
              int somaImpares = 0;

              for (int i = 0; i <= numero; i++) {
                     if (i % 2 == 0) { // Se o número é par
                            totalPares++;
                            somaPares += i;
                     } else { // Se o número é ímpar
                            totalImpares++;
                            somaImpares += i;
                     }
              }
              System.out.println("Quantidade de números pares: " + totalPares);
              System.out.println("Quantidade de números ímpares: " + totalImpares);
              System.out.println("Soma dos números pares: " + somaPares);
              System.out.println("Soma dos números ímpares: " + somaImpares);
              
              scanner.close();

       }
       
}