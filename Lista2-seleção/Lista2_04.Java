/* Construa um programa em Java para ler dois valores e mostrar 
o menor deles. (DICA: Usar if/else para mostrar o menor dos 
valores digitados) 
*/

import java.util.Scanner;
public class Lista2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input de 2 números
        System.out.print("digite um número: ");
        int numero1 = scanner.nextInt();
        //
        System.out.print("digite um número: ");
        int numero2 = scanner.nextInt();

        //verifica se o valor é maior ou menor e printa o menor
        if (numero1 > numero2) {
            System.out.println("o numero menor é: " + numero2);
        } else {
            System.out.println("o numero menor é: " + numero1);
        }
        scanner.close();
    }
}
