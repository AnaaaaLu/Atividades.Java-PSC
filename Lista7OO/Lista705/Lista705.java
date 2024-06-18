package Lista7OO.Lista705;

/* Escreva um programa em Java que mostre na tela uma nota fiscal composta de 3
itens, como mostrado no modelo abaixo:

O usuário deve informar a descrição, o preco unitário e a quantidade de cada item 
da nota. Para cada item deve haver um objeto construído a partir da classe 
ItemNotaFiscal que armazenaráos dados relativos àquele item.

Cada objeto ItemNotaFiscal deve conter quatro atributos: um para guardar o valor 
da descrição do item, outro para guardar o valor do preco unitário, outro para 
guardar o valor da quantidade comprada, e outro para guardar a alíquota do ICMS 
do produto. Cada objeto deve conter ainda três métodos: um método que calcule o 
valor total do item e devolva esse valor como resposta (o valor total é calculado 
multiplicando-se o preco unitário pela quantidade do item); um método que calcule
o valor do ICMS relativo àquele item e que também devolva este valor; e um método 
para mostrar o item, que recebe o número do item como parâmetro e o mostre, 
conforme mostrado abaixo:

O valor do ICMS écalculado multiplicando-se o valor da alíquota pelo valor total 
do item. Faça uma classe NotaFiscal que conterá três atributos, uma para cada 
item. Cada um deles deve conter um objeto da classe ItemNotaFiscal. A classe 
otaFiscal deve ter um método calculaTotal que calcula o valor total da nota 
somando o valor total de cada item e retorna esse valor, e um método mostrar, 
que mostra a nota inteira de acordo com o modelo anterior.

Faça um programa em Java que leia os valores para cada item da nota e o valor da alíquota de ICMS
considerada, crie objetos ItemNotaFiscal, crie um objeto da classe NotaFiscal e mostre a nota na tela. */

import java.util.Scanner;

public class Lista705 {
       public static void main(String[] args) throws Exception {
              Scanner scanner = new Scanner(System.in);
      
              String descricao;
              double preco, quantidade, ICMS;
              ItemNotaFiscal[] itens = new ItemNotaFiscal[3];
      
              for(int i = 0; i < 3; i++) {
                  System.out.println("Escreva a descrição do item número " + (i + 1));
                  descricao = scanner.next();
      
                  System.out.println("Escreva o preco unitário do item número: " + (i + 1 ));
                  preco = scanner.nextDouble();
      
                  System.out.println("Escreva a quantidade do item número: " + (i + 1 ));
                  quantidade = scanner.nextDouble();
      
                  System.out.println("Escreva o ICMS (%) do item número: " + (i + 1 ));
                  ICMS = scanner.nextDouble();
      
                  itens[i] = new ItemNotaFiscal(descricao, preco, quantidade, ICMS);
              }
      
              NotaFiscal notaFiscal = new NotaFiscal(itens[0], itens[1], itens[2]);

              System.out.println(notaFiscal.toString());

              scanner.close();
       }
}