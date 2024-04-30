package Lista1_01;
/* Construa programa em Java que leia (via teclado) dois números 
do tipo inteiro, calcule o produto entre eles e mostre o resultado. 
*/

import java.util.Scanner;
public class Lista1_01 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //input número 1
    System.out.print("digite um número inteiro: ");
    int numero1 = scanner.nextInt();

    //input número 2
    System.out.print("digite outro número inteiro: ");
    int numero2 = scanner.nextInt();

    //calcular o produto
    int produto = numero1 * numero2;

    System.out.println("produto de " + numero1 + " e " + numero2 
    + " é: " + produto);

    scanner.close();
}
    }