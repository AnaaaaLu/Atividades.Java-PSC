package Lista7OO.Lista703;

public class Aluno {
       private int matricula;
       private String nome;

       public int getMatricula() {
              return this.matricula;
       }

       public void setMatricula(int matricula) {
              this.matricula = matricula;
       }

       public String getNome() {
              return this.nome;
       }

       public void setNome(String nome) {
              this.nome = nome;
       }
       
       public void getNota1() {
              this.nota1 = nota1;
       }

       public double setNota1(double nota1) {
              return this.nota1;
       }
       
       public void getNota2() {
              this.nota2 = nota2;
       }

       public double setNota2(double nota2) {
              return this.nota2;
       }

       private double nota1;
       private double nota2;

       public Aluno(int matricula, String nome, double nota1, double nota2) {
              this.matricula = matricula;
              this.nome = nome;
              this.nota1 = nota1;
              this.nota2 = nota2;
       }

       public double mediaAritmetica(double nota1, double nota2) {
              return (nota1 + nota2) / 2;
       }

       public void alunoAprovado() {
              if(mediaAritmetica(nota1, nota2) >= 7) {
                  System.out.println("Aprovado!");
              } else {
                  System.out.println("Reprovado!");
                  System.out.println("precisa de " + quantoPrecisa(mediaAritmetica(nota1, nota2)) + " para passar");
              }
          }
      
          public double quantoPrecisa(double mediaAritmetica) {
              return (50 - mediaAritmetica * 6) / 4;
          }

}
