/* Construa um programa em Java que leia (via teclado) 
três números do tipo inteiro, calcule e mostre o resultado 
da soma deles.
*/

import java.util.Scanner;
public class Lista1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input número 1
        System.out.print("digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        //input número 2
        System.out.print("digite outro número inteiro: ");
        int numero2 = scanner.nextInt();

        //input número 3
        System.out.print("digite mais um número inteiro: ");
        int numero3 = scanner.nextInt();

        //calcular o produto
        int soma = numero1 + numero2 + numero3;

        System.out.println("soma de " + numero1 + ", " + numero2 + " e " + numero3 +
                " é igual a:" + soma);
    }
    
}
