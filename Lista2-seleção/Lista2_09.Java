/*Laranjas em um mercado de produtos orgânicos custam R$ 0,30 se forem compradas 
menos que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Construa um 
programa em Java que leia o número de laranjas compradas, calcule e escreva o 
valor total da compra. Implementar uma validação da quantidade de frutas a serem 
compradas para evitar que seja lido um número de laranjas menor (negativo) ou 
igual a zero. (DICA: utilizar “if-else” como estrutura de seleção e dados tipo 
“double” com duas casas decimais (%.2f) para a representação dos preços a serem 
cobrados) */

import java.util.Scanner;

public class Lista2_09 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

//input laranjas e decisão se é granel ou atacado

        System.out.println("Insira quantas laranjas você comprará: ");
        int quantidadeLaranjas = read.nextInt();

        double precoLaranjas = 0;

        if (quantidadeLaranjas >= 12) {
            precoLaranjas = quantidadeLaranjas * 0.25;
        } else {
            precoLaranjas = quantidadeLaranjas * 0.30;
        }

        System.out.printf("Preço das laranjas: " + precoLaranjas);

        read.close();
           }
}