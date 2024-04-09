/* Construa um programa em Java para ler um valor, 
verificar se é maior do que 100 e mostrar essa 
informação. (DICA: Usar if/else para mostrar se 
valor é > ou < 100)
*/

import java.util.Scanner;
public class Lista2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input de um número
        System.out.print("digite um número: ");
        int numero = scanner.nextInt();

        //verifica se o valor é par ou impar
        if (numero % 2 == 0) {
            System.out.println("é par!");
        } else {
            System.out.println("é impar!");
        }
    }
}
