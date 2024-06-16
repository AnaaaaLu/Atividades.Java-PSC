/* Crie uma classe chamada Quadrado que será um modelo para construção de
objetos que armazenem dados de quadrados. Esta classe conterá um único atributo que armazenará
o tamanho do lado do quadrado em centímetros. Além deste atributo, a classe conterá três métodos:
● um que calcule e devolva a área do quadrado (dado por LADO 2);
● outro que calcule e devolva o perímetro do quadrado (4 * LADO);
● e outro que calcule e devolva o valor da diagonal do quadrado (LADO * √2).

Escreva um programa para simulação que receba o valor do lado de um quadrado, crie um objeto da
classe Quadrado com este valor de lado, e mostre a área, o perímetro e a diagonal deste quadrado,
usando os métodos do objeto criado. */

import java.util.Scanner;

public class Lista701 {
       public static void Lista701(String[] args) {
              Scanner scanner = new Scanner(System.in);

              System.out.println("digite o lado do quadrado: ");
              double lado = scanner.nextDouble();

              Quadrado quadrado = new Quadrado();

              quadrado.setSide(lado);

              System.out.println("área: " + quadrado.calcArea());
              System.out.println("perímetro: " + quadrado.calcPerimetro());
              System.out.println("diagonal: " + quadrado.calcDiagonal());

              scanner.close();
       }
}
