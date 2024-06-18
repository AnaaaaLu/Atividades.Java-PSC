package Lista8HOA.Lista804;

public class Moeda {
       private double valor;
       private String nome;

       public Moeda(double valor, String nome) {
              this.valor = valor;
              this.nome = nome;
       }

       public double getValor() {
              return this.valor;
       }

       public String getNome() {
              return this.nome;
       }

       @Override
       public String toString() {
              return getNome() + " no valor de " + getValor();
       }
}
