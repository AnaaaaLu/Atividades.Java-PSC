package Lista7OO.Lista703;

/* Construa uma classe chamada Aluno. Esta classe deverá conter os seguintes
atributos:
       ● Um atributo inteiro contendo o número de matrícula do aluno.
       ● Um atributo String contendo o nome do aluno.
       ● Dois atributos double contendo as notas do aluno no semestre 
       (considerando que o aluno tem somente duas notas).

Defina os seguintes métodos para a classe:
       ● Um método chamado média que deve retornar a média das duas notas 
       do aluno.
       ● Um método chamado aprovado que deve retornar um valor boolean 
       informando se o aluno foi aprovado ou não (true se o aluno foi 
       aprovado ou false caso contrário). O aluno será́ aprovado quando 
       atingir média maior ou igual a 7,0.
       ● Um método chamado quantoPrecisa que deve retornar um valor double 
       contendo o quanto o aluno precisaria no exame. Esse valor deve ser 
       calculado utilizando a seguinte expressão: 
              (50-MEDIA * 6)/4

Faça um programa em Java que crie um objeto da classe Aluno e preenche seus 
atributos com valores informados pelo usuário. Mostre a média do aluno, se 
foi aprovado e caso não tenha sido aprovado, mostre quanto precisaráno 
exame. */

import java.util.Scanner;

public class Lista703 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in); 

           System.out.println("Número da matrícula: ");
           int matricula = scanner.nextInt();

           System.out.println("nome do aluno: ");
           String nome = scanner.next();

           System.out.println("primeira nota do aluno: ");
           int nota1 = scanner.nextInt();

           System.out.println("segunda nota do aluno: ");
           int nota2 = scanner.nextInt();

           Aluno aluno = new Aluno(matricula, nome, nota1, nota2);

           aluno.alunoAprovado();

           scanner.close();
       }
}
