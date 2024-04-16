/* Ler uma quantidade indeterminada de duplas de valores 
(2 valores de cada vez). Escrever para cada dupla lida uma 
mensagem que indique se ela foi informada em ordem crescente 
ou decrescente. A repetição será encerrada ao ser fornecido 
valores iguais para os elementos da dupla. 
*/

import java.util.Scanner;

public class Lista3_04{
       public static void main(String[] args) {
              Scanner scanner =  new Scanner(System.in);

              System.out.println("Digite 2 números inteiros positivos: ");
              int numero1 = 0;
              int numero2 = 0;

              do{
                     numero1 = scanner.nextInt();
                     numero2 = scanner.nextInt();

                     if (numero1 < numero2){
                            System.out.println("Estão em ordem crescente!");
                     } else if(numero1 > numero2){
                            System.out.println("Estão em Ordem decrescente");
                     }
       
              }

              while (numero1 != numero2);

              scanner.close();
       }
}