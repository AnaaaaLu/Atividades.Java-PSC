/* (ExeRepeticao02) Crie um programa em Java que receba
 do usuário dois números inteiros positivos A e B (e 
 garantindo que A < B), encontre e imprima os números 
 divisíveis por 5 no intervalo de números entre A e B (incluindo 
 A e B) e a soma dos números encontrados. 
 */

import java.util.Scanner;

public class Lista3_02{
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero1, numero2, sum = 0;

            System.out.println("Digite um número positivo e inteiro: ");
            numero1 = scanner.nextInt();
    
            System.out.println("Digite outro número positivo e inteiro: ");
            numero2 = scanner.nextInt();
    
            if (numero1 > numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
    
    
            System.out.println("Os numeros divisíveis por 5 entre " + numero1 + " e " + numero2 + " são: ");
            for (int i = numero1; i <= numero2; i++) {
                if (i % 5 == 0) {
                    System.out.println(i + " ");
                    sum += i;
                }
            }
    
            System.out.println("\nSum dos numeros encontrados: " + sum);
        }
    }