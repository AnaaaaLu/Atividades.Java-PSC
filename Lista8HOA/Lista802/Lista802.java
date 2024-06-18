package Lista8HOA.Lista802;

/* De acordo com o diagrama de classes a seguir, considere a construção de um 
software para uma agência bancária onde existe um registro das contas dos 
clientes. 

Cada conta possui: número, nome do titular e saldo, além de operações para saque 
e depósito. Validar a operação saque de acordo com o valor a ser sacado e o 
saldo disponível. 

Existe ainda um tipo especial de conta chamado conta corrente (CC) que contém os 
mesmos atributos de conta mais um limite de conta (cheque especial). O valor 
máximo a ser sacado da CC é o saldo + o limite de conta, o que implica na
redefinição do método saque na conta corrente.

Implemente o programa usando os conceitos já estudados de encapsulamento, 
construtores, herança e redefinição de métodos (@Override). Para isso, crie 3 
classes: Conta, ContaCorrente e Teste. As classes Conta e ContaCorrente devem ter 
construtores para todos os seus atributos. A classe Teste deverá instanciar 1 
objeto da classe ContaCorrente que deverá iniciar com um saldo de R$ 1.000,00 e
um limite fixo de R$ 500,00, e fazer saques e depósitos informando o status da 
conta conforme a imagem a seguir que apresenta uma sugestão de resultado para o 
programa ao ser executado. Além disso, a classe ContaCorrente deverá ter um 
método mostrarDados() (ou a redefinição do método toString() conforme o diagrama 
de classes) que deverá ser chamado sempre que alguma ação for realizada na conta 
corrente. */

public class Lista802{
       public static void main(String[] args) throws Exception{
              ContaCorrente contaCorrente = new ContaCorrente("111", "Ana", 1000);

              contaCorrente.deposito(100);
              System.out.println(contaCorrente.toString());
        
              contaCorrente.saque(1000);
              System.out.println(contaCorrente.toString());

              contaCorrente.saque(112);
              System.out.println(contaCorrente.toString());
       }
}