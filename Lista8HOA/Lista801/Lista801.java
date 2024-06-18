/* Deseja-se construir um sistema de software para o setor de RH de uma empresa.
Basicamente, existem dois tipos de colaboradores: Funcionário e Gerente. Os 
atributos de cada tipo de colaborador são:
       • Funcionario (Nome, CPF, Salario)
       • Gerente (Nome, CPF, Salario, Departamento)

Seguindo o conceito de HERANÇA e o diagrama de classes a seguir, todo gerente é 
um funcionário, ou seja, Gerente é um subgrupo de Funcionário. No entanto, 
Gerente possui características que Funcionário não tem. Ambos os colaboradores 
têm salário (um salário base para todos), mas Gerente tem um acréscimo de 20% no 
salário base referente ao cargo de gerente (sobrescrever, na classe Gerente, o 
método getSalario() herdado da classe Funcionario). O acréscimo no salário do 
Gerente deve ser implementado com redefinição de métodos (@Override). O “salário 
base” deverá ser atribuído apenas ao “funcionário”. Já o salário do “gerente” 
deverá ser calculado tendo como base o salário do funcionário.

Implemente o programa usando os conceitos já estudados de encapsulamento, 
construtores, herança e redefinição de métodos (@Override). Para isso, crie 3 
classes: Funcionario, Gerente e Teste. As classes Funcionario e Gerente devem 
ter construtores para todos os seus atributos (usar “super” para reutilizar o 
construtor de Funcionario na definição do construtor de Gerente). A classe Teste 
deverá instanciar 2 objetos “Funcionario” e um objeto “Gerente”, e imprimir 
informações de todos os atributos de cada objeto. */

package Lista8HOA.Lista801;

public class Lista801 {
       public static void main(String[] args) throws Exception {
              Funcionario funcionario1 = new Funcionario("Ana", "000.000.000-00");
              Funcionario funcionario2 = new Funcionario("João", "222.222.222-22");
      
              Gerente gerente1 = new Gerente("Leonardo", "333.333.333-33", "Suporte");
      
              System.out.println("Dados dos funcionários: \n");
              System.out.println(funcionario1 + "\n" + "\n" + funcionario2);
      
              System.out.println("Dados do Gerente: \n" + gerente1);
          }
}
