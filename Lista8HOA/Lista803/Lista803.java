package Lista8HOA.Lista803;

/* Imagine agora que nosso problema diz respeito a implementação do sistema de folha
de pagamento de uma empresa. Esta empresa tem dois tipos de funcionários:
• Funcionário horista (que ganha um salário por hora trabalhada)
• Funcionário CLT (que ganha um salário fixo por mês)
Ambos os funcionários possuem nome e CPF. A classe FuncionarioHorista deverá ter os seguintes
membros:
• Atributos: nome, cpf, salarioHora, horasTrabalhadas
• Métodos: calculaRendimentos
A classe FuncionarioCLT deverá ter os seguintes membros:

• Atributos: nome, cpf, salarioMensal
• Métodos: calculaRendimentos
Tanto a classe FuncionarioHorista quanto a classe FuncionarioCLT possuem os atributos nome e cpf e
o método calculaRendimentos. Vamos criar uma terceira classe chamada CFuncionario (conforme o
diagrama de classes a seguir). Essa classe terá dois atributos (nome e cpf) e um método
calculaRendimentos. No entanto, esta classe será a superclasse de FuncionarioHorista e
FuncionarioCLT e deverá ser uma classe abstrata cuja implementação do seu método
calculaRendimentos (também abstrato) deverá ocorrer nas duas subclasses. A implementação do
método calculaRendimentos na classe FuncionarioHorista deverá retornar o resultado da operação
(salarioHora * horasTrabalhadas). O mesmo deverá acontecer na classe FuncionarioCLT que deverá
retornar o valor do atributo salarioMensal. */

public class Lista803 {
       public static void main(String[] args) throws Exception {
              FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Arthur", "111", 3500);
              FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Bruna", "222", 75, 40);
              
              System.out.println(funcionarioCLT);
              System.out.println(funcionarioHorista);
          }
}
