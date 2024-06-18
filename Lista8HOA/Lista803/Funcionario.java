package Lista8HOA.Lista803;

public class Funcionario {
       private String nome;
    private String CPF;

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

    public abstract double calcularRendimentos();

    @Override
    public String toString() {
        return  "\n Nome: " + getNome() +
                "\n CPF: " + getCpf() +
                "\n Rendimento Mensal: " +  
                calcularRendimentos();
    }
}
