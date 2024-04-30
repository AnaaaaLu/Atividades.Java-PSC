/* Escrever um algoritmo que recebe repetidamente o sexo (M - Masculino 
e F - Feminino) e a idade. Apresentar no final do algoritmo a média da 
idade dos homens e a média da idade das mulheres. Parar o algoritmo quando
 for digitado um sexo diferente de M ou F.
 */
import java.util.Scanner;
public class Lista3_11{
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              int numeroHomens = 0;
              int numeroMulheres = 0;
              int idadeTotalHomens = 0;
              int idadeTotalMulheres = 0; 
              String sexo; 
              int idade; 

              do {
                     System.out.print("Digite o sexo (M - Masculino, F - Feminino) ou 0 para finalizar: ");
                     sexo = scanner.next().toUpperCase();

                     if (sexo.equals("M")){
                            System.out.print("Digite a idade: ");
                            idade = scanner.nextInt();
                            numeroHomens++;
                            idadeTotalHomens += idade; 
                     } else if (sexo.equals("F")) {
                            System.out.print("Digite a idade: ");
                            idade = scanner.nextInt();
                            numeroMulheres++; 
                            idadeTotalMulheres += idade;
                     }
              } while (!sexo.equals(("0")));

              double idadeMediaHomens = (double) idadeTotalHomens / numeroHomens;
              double idadeMediaMulheres = (double) idadeTotalMulheres / numeroMulheres; 

              System.out.println("Média da idade dos homens: " + idadeMediaHomens);
              System.out.println("Média da idade das mulheres: " + idadeMediaMulheres);

              scanner.close();
       }
}