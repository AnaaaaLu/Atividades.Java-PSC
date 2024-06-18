package Lista8HOA.Lista803;

public class FuncionarioCLT extends Funcionario {
    private double salarioMensal;
    
    public FuncionarioCLT(String nome, String CPF, double salarioMensal) {
        super(nome, CPF);
        this.salarioMensal = salarioMensal;
        
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularRendimentos() {
        return getSalarioMensal();
    }
    
}