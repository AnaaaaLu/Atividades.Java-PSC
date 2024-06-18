/* Construa um programa em Java que simule a operação de um CD Player 
tocando um CD. Para isso, implemente uma classe chamada CD que conterá três 
atributos:
       ● o número de músicas que o CD possui;
       ● o número da faixa que está tocando no momento (ao iniciar, este 
       valor deve ser colocado em 1, que é o número da primeira música);
       ● e se o CD Player está tocando uma música no momento ou se 
       está parado ou pausado (o aparelho sempre inicia parado).

Além destes atributos, o programa deve possuir os seguintes métodos:
       ● um método que funcione como o botão play, dizendo ao aparelho que 
       deve começar a tocar a faixa atual;
       ● um método que funcione como o botão pause, fazendo o aparelho parar 
       de tocar;
       ● um método que funcione como o botão stop, que faz com que o aparelho 
       pare de tocar e volte para a faixa 1;
       ● um método que permite avançar para a próxima faixa (se o CD já estiver 
       na última faixa, deve ir para a primeira);
       ● um método que permite retroceder para a faixa anterior (se o CD já 
       estiver na primeira faixa, deve ir para a última).
       ● um método que imprima o estado atual do CD (como um Display) sempre 
       que algum método for chamado.

Ao implementar o programa que use a classe CD, permita ao usuário que 
informe o número de músicas do CD. A simulação ocorreráda seguinte forma:
       ● crie um objeto a partir da classe CD que será a base da simulação.
       ● após entrar com o número de músicas (armazene esse valor no objeto 
       que você criou), permita ao usuário entrar com comandos para o CD 
       Player (monte um menu de opções para isso). 
       Os comandos serão informados através de números:
              o 1 para play
              o 2 para pause
              o 3 para stop
              o 4 para ir para a próxima faixa
              o 5 para ir para a faixa anterior
       ● Para cada comando digitado pelo usuário, chame o método apropriado 
       no objeto que você criou. O programa irá terminar quando o usuário 
       digitar o comando de número 0 (zero). */

import java.util.Scanner;

public class Lista702 {
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Quantas músicas tem o CD? ");
              int numero = scanner.nextInt();

              CD cd = new CD(numero);

              int decisão;

              do {
                     System.out.println("\n --Menu - Escolha uma Opção: --");
                     System.out.println("    Play               (1)");
                     System.out.println("    Pause              (2)");
                     System.out.println("    Stop               (3)");
                     System.out.println("    Próxima Faixa      (4)");
                     System.out.println("    Faixa Anterior     (5)");
                     System.out.println("    Sair               (0)");

                     decisão = scanner.nextInt();

                     switch (decisão) {
                            case 1: 
                                   cd.play();
                                   break;
                            case 2: 
                                   cd.pause();
                                   break;
                            case 3:
                                   cd.stop();
                                   break;
                            case 4: 
                                   cd.next();
                                   break;
                            case 5: 
                                   cd.previous();
                                   break;
                            case 0:
                                   System.out.println("    Encerrando CD Player, obrigada pela preferência!");
                                   break;
                            default:
                                   System.out.println("    Comando Inválido");
                     }
                     System.out.println(cd.toString());
              } while (decisão != 0);

              scanner.close();
       }
}