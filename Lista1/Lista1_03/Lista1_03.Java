/* Construa um programa em Java para ler (via teclado) quatro 
números do tipo inteiro, calcule e mostre o resultado da média 
aritmética entre eles. Usar “float” para o tipo de dado da 
variável que irá armazenar o resultado da média aritmética e 
imprimir o resultado com duas casas decimais depois da vírgula 
(%.2f).
*/

import java.util.Scanner;
public class Lista1_03 {
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

        //input número 4
        System.out.print("digite mais um número inteiro: ");
        int numero4 = scanner.nextInt();

        //calcular a soma
        int soma = numero1 + numero2 + numero3 + numero4;

        //calcular média aritmética
        float media = soma/4;

        System.out.println("média aritmética de " + numero1 + ", " + numero2 + ", " + numero3 +
                " e " + numero4 + " é igual a:" + media);
     
        scanner.close();

    }
    
}
