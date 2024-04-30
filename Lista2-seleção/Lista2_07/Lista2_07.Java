/* Escreva um programa em Java para ler o número de eleitores de um município, 
o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada 
um representa em relação ao total de eleitores. (DICA: regra de três para calcular o 
percentual de cada voto em relação ao número de eleitores que é 100%, ou seja, 
X = (brancos ou nulos ou validos) * 100 / eleitores)
*/

import java.util.Scanner;
public class Lista2_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input de 4 números
        System.out.print("digite o número total de eleitores: ");
        int total = scanner.nextInt();

        System.out.print("digite o número de votos brancos: ");
        int branco = scanner.nextInt();

        System.out.print("o número de votos nulos: ");
        int nulo = scanner.nextInt();

        System.out.print("o número de votos válidos: ");
        int valido = scanner.nextInt();

        //calcula os percentuais
        double percentualbranco = (double) branco / total * 100;
        double percentualnulo = (double) nulo / total * 100;
        double percentualvalido = (double) valido / total * 100;

        //printa os resultados
        System.out.println("percentual de votos brancos: " + percentualbranco + "%");
        System.out.println("percentual de votos nulos: " + percentualnulo + "%");
        System.out.println("percentual de votos válidos: " + percentualvalido + "%");
    
        scanner.close();
       }
}
