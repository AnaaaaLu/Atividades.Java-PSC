/* Construa um programa em Java para ler (via teclado) uma 
temperatura em graus Fahrenheit, calcular e mostrar o valor 
correspondente em graus Celsius sabendo que 
TempCelsius = 5 x (TempFahrenheit – 32) / 9. (DICA: Usar dados 
do tipo float para ter precisão nos resultados (%.1f)). 
*/

import java.util.Scanner;
public class Lista1_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input temperatura em celsius
        System.out.print("digite uma temperatura em celsius: ");
        float numero1 = scanner.nextInt();

        //calcular o Fahrenheit
        double TempF = 5 * (numero1 - 32) / 9;

        System.out.println("temperatura em celsius: " + numero1);
        System.out.println("temperatura em Fahrenheit: " + TempF);

        scanner.close();
    }
}
