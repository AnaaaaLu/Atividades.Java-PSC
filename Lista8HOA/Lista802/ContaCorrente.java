package Lista8HOA.Lista802;

public class ContaCorrente extends Conta {
       private double limite = 500;

       public ContaCorrente(String numero, String titular, double saldo) {
              super(numero, titular, saldo);
       }

       public double getLimite() {
              return this.limite;
       }

       @Override
       public void saque(double valor) {
              if (valor > 0 && valor <= (getSaldo() + limite)) {
                     double novoSaldo = getSaldo() - valor;
                     if (novoSaldo < 0) {
                            limite += novoSaldo;
                            super.deposito(-novoSaldo);
                     } else {
                            super.saque(valor);
                     }
              } 
       }
    
       @Override
       public String toString() {
              return  "\n Conta: " + getNumero() +
                     "\n Titular: " + getTitular() +
                     "\n Saldo: " + getSaldo() +
                     "\n Limite: " + getLimite();
       }
}
