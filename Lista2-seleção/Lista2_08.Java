/* Construa um programa em Java para ler três valores para os 
lados de um triângulo: A, B e C. Verificar se os lados fornecidos 
formam realmente um triângulo. Se formar, deve ser indicado o 
tipo de triângulo: isósceles, escaleno ou equilátero. Para 
verificar se os lados fornecidos formam um triângulo: 
A < B + C e B < A + C e C < A + B. Triângulo isósceles: possui 
dois lados iguais (A=B ou A=C ou B=C). Triângulo escaleno: possui 
todos os lados diferentes (A<>B e B<>C e A<>C). Triângulo 
equilátero: possui todos os lados iguais (A=B e B=C). (DICA: 
utilizar “if-else” como estrutura de seleção e o operador 
lógico &&) */

import java.util.Scanner;

public class Lista2_08 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

//input dos 3 segmentos para o triângulo

        System.out.println("Insira o primeiro segmento: ");
        int a = read.nextInt();

        System.out.println("Insira o segundo segmento: ");
        int b = read.nextInt();

        System.out.println("Insira o terceiro segmento: ");
        int c = read.nextInt();

//verifica se é triângulo e qual triângulo é

        if (a < b + c && b < c + a && c < a + b) {
            System.out.println("Triângulo existe!");
            
            if (a == b || b == c || c == a) {
                System.out.println("Triângulo é isósceles");
            } else if (a != b && b != c && c != a) {
                System.out.println("Triângulo é escaleno");
            } else if (a == b && b == c) {
                System.out.println("Triângulo é equilátero");
            }
        } else {
            System.out.println("Triângulo não existe.");
        }
        
        read.close();
    }
}