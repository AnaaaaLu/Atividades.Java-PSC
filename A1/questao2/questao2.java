/* */
package A1.questao2;

import java.util.Scanner;

public class questao2 {
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              int numero;
              char continuar;

              do {
                     System.out.print("numero para o fatorial: ");
                     numero = scanner.nextInt();

                     double fatorial = calcularFatorial(numero);
                     System.out.println("O fatorial de " + numero + " é: " + fatorial);

                     System.out.print("Deseja calcular outro fatorial? (S/N): ");
                     continuar = scanner.next().charAt(0);

              } while (continuar == 'S' || continuar == 's');


       scanner.close();
       }
       public static double calcularFatorial(int numero) {
              double fatorial = 1; 
              for (int i = 1; i <= numero; i++) {
                  fatorial *= i;
              }
      
              return fatorial;
          }
}
