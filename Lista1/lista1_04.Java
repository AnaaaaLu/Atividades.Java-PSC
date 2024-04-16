/* Construa um programa em Java que leia um número do tipo “inteiro” 
(via teclado) e o guarde em uma variável X. Calcule e mostre: 
(1) o conteúdo de X, (2) o quadrado de X, (3) o resto da divisão 
inteira de X por 3, (4) a metade de X, e (5) o resultado do 
produto de X pela metade de X. */

import java.util.Scanner;
public class lista1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input número 1
        System.out.print("digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        //calcular a soma
        float quadrado = numero1 * numero1;

        //resto da divisão por 3
        float resto = numero1%3;

        //metade do número
        float metade = (float) numero1 / 2;

        //numero multiplicado pela sua metade
        float produto = numero1 * metade;

        System.out.println("o número é: " + numero1);
        System.out.println(numero1 + " ao quadrado é: " + quadrado);
        System.out.println("o resto de " + numero1 + " dividido por 3 é "+ resto);
        System.out.println("a metade de " + numero1 + " é: " + metade);
        System.out.println(numero1 + " multiplicado pela sua metade é: " + produto);

        scanner.close();

    }
}
