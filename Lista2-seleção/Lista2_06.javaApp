/* Construa um programa em Java para ler três valores que representam
 três segmentos de reta. Verificar se com esses segmentos é possível 
 compor um triângulo e mostrar uma mensagem dizendo se é ou não 
 possível. (DICA: Usar if/else e operador lógico &&. Regra 
 para ser um triângulo: (A < B + C) e (B < A + C) e (C < A + B), 
 OU SEJA, todos os lados devem ser menores que a soma dos outros 
 dois lados) */

import java.util.Scanner;
public class Lista2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input de 3 números
        System.out.print("digite um número que representa um segmento de reta: ");
        int numero1 = scanner.nextInt();

        System.out.print("outro: ");
        int numero2 = scanner.nextInt();

        System.out.print("mais um: ");
        int numero3 = scanner.nextInt();

        //verifica se com os valores é possivel montar um triângulo
        if (numero1 < numero2 + numero3 && numero2 < numero1 + numero3
                && numero3 < numero1 + numero2) {
            System.out.println("é possível formar um triângulo!");
        } else {
            System.out.println("não é possível formar um triângulo...");
        }
    }
}
