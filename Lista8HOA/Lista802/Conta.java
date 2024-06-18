package Lista8HOA.Lista802;

public class Conta {
       private String numero;
       private String titular;
       private double saldo = 0;

       public Conta(String numero, String titular, double saldo) {
              this.numero = numero;
              this.titular = titular;
              this.saldo = saldo;
       }
    
       public String getNumero() {
              return this.numero;
       }
    
       public void setNumero(String numero) {
              this.numero = numero;
       }
    
       public String getTitular() {
              return this.titular;
       }
    
       public void setTitular(String titular) {
              this.titular = titular;
       }
    
       public double getSaldo() {
              return this.saldo;
       }
    
       public void setSaldo(double saldo) {
              this.saldo = saldo;
       }
    
       public void deposito(double valor) {
              this.saldo += valor;
              System.out.println("\n Depósito de: R$" + valor );
       }
    
       public void saque(double valor) {
              this.saldo -= valor;
              System.out.println("\n Saque de: R$" + valor );
       }

       @Override
       public String toString() {
              return  "\n Conta: " + getNumero() +
                     "\n Titular: " + getTitular() +
                     "\n Saldo: " + getSaldo();
       }  
}
