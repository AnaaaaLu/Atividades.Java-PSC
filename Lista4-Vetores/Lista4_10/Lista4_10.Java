/*Escreva um programa que leia diversos números inteiros fornecidos 
pelo usuário e distribua esses valores entre dois vetores: o vetor 
dos ímpares e o vetor dos pares. Cada um terá tamanho de 10 elementos. 
O término do algoritmo se dará quando o usuário digitar zero ou um 
dos vetores tiver sido totalmente preenchido. Mostre o conteúdo 
dos dois vetores no final.*/

public class Lista4_10 {
       public static void main(String[] args) {
              final int TAMANHO = 10;
              int[] pares = new int[TAMANHO];
              int[] impares = new int[TAMANHO];
              int contadorPares = 0;
              int contadorImpares = 0;
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Digite os números (digite 0 para terminar):");
              
              while (true) {
                     int numero = scanner.nextInt();
                     if (numero == 0 || contadorPares == TAMANHO || contadorImpares == TAMANHO) {
                            break;
                     }
                     if (numero % 2 == 0) {
                            pares[contadorPares++] = numero;
                     } else {
                            impares[contadorImpares++] = numero;
                     }
              }
              
              System.out.println("Vetor dos números pares:");
              for (int i = 0; i < contadorPares; i++) {
                     System.out.print(pares[i] + " ");
              }
              
              System.out.println("\nVetor dos números ímpares:");
              for (int i = 0; i < contadorImpares; i++) {
                     System.out.print(impares[i] + " ");
              }
              
              scanner.close();
       }
}