/*(ExeRepeticao03) Crie um programa em Java que 
receba do usuário um número inteiro positivo e 
determine se ele é um “número perfeito”. Um número 
perfeito é aquele que é igual à soma dos seus 
divisores, do 1 até o “número -1” (ou seja, dos 
divisores pares, exceto dele mesmo, pois 0 e 1 não 
são números perfeitos). */

import java.util.Scanner; 

public class Lista3_03 {
       public static void main(String[] args){
              Scanner scanner = new Scanner(System.in);
              int sum = 0;

       System.out.println("Digite um número positivo e inteiro: ");
       int numero = scanner.nextInt();
        
       for(int i = 1; i < numero; i++) {
            if (numero > 0 && numero % i == 0) {
                sum += i;
            } 
              
       }

       if(sum == numero) {
            System.out.println("o número é perfeito!!");
       } else {
            System.out.println("o numero não é perfeito :(");
       }

       scanner.close();
    }
}