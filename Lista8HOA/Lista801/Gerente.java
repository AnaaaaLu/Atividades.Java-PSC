package Lista8HOA.Lista801;

public class Gerente extends Funcionario{
       private String departamento;

       public Gerente(String nome, String CPF, String departamento) {
              super(nome, CPF);
              this.departamento = departamento;
       }

       public String getDepartamento() {
              return this.departamento;
       }

       public void setDepartamento(String departamento) {
              this.departamento = departamento;
       }

       @Override
       public double getSalario() {
              return super.getSalario() * 1.20;
       }
}
