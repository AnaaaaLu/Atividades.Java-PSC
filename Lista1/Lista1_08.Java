/* Construa um programa em Java que leia (via teclado) as horas, minutos e segundos em 
determinado momento do dia, e que calcule e mostre qual o total de segundos decorridos 
neste dia. (DICA: totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos).
*/

import java.util.Scanner;
public class Lista1_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input horário
        System.out.print("digite as horas: ");
        int horas = scanner.nextInt();

        System.out.print("digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("digite os segundos: ");
        int segundos = scanner.nextInt();

        //calcular os segundos
        int total = (horas * 60 * 60) + (minutos * 60) + segundos;

        System.out.println("os segundos que já foram decorridos ao longo do dia são: " + total);

        scanner.close();
    }
}
