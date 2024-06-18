package Lista8HOA.Lista803;

public class FuncionarioHorista extends Funcionario{
       private double salarioHora;
       private int horasTrabalhadas;
    
       public FuncionarioHorista(String nome, String CPF, double salarioHora, int horasTrabalhadas) {
              super(nome, CPF);
              this.salarioHora = salarioHora;
              this.horasTrabalhadas = horasTrabalhadas;
       }
    
       public double getSalarioHora() {
              return this.salarioHora;
       }
    
       public void setSalarioHora(double salarioHora) {
              this.salarioHora = salarioHora;
       }

       public int getHorasTrabalhadas() {
              return this.horasTrabalhadas;
       }

       public void setHorasTrabalhadas(int horasTrabalhadas) {
              this.horasTrabalhadas = horasTrabalhadas;
       }

       @Override
       public double calcularRendimentos() {
              return horasTrabalhadas * salarioHora;
       }
    
}
