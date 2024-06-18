package Lista8HOA.Lista801;

public class Funcionario {
       private String nome;
       private String CPF;
       private double salario = 3500;

       public Funcionario(String nome, String CPF) {
              this.nome = nome;
              this.CPF = CPF;
       }

       public String getNome() {
              return this.nome;
       }

       public void setNome(String nome) {
              this.nome = nome;
       }

       public String getCpf() {
              return this.CPF;
       }

       public void setCpf(String CPF) {
              this.CPF = CPF;
       }

       public double getSalario() {
              return this.salario;
       }

       public void setSalario(double salario) {
              this.salario = salario;
       }

       @Override
       public String toString() {
              return  "- Nome: " + getNome() +
                     "\n- CPF: " + getCpf() +
                     "\n- Salario: " + getSalario();
    }
}
