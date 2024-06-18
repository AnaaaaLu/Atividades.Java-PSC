package Lista7OO.Lista704;

/* Escreve um programa que contenha duas classes principais: Veiculo e
Proprietario. A relação entre estas classes é que um proprietário pode 
ter um ou mais veículos. Com a classe Veiculo criaremos objetos que 
representarão veículos cadastrados pela prefeitura. Cada veículo deve 
possuir os seguintes atributos: número da placa, cor, modelo e proprietário. 
O atributo proprietário deve ser preenchido com um objeto da classe 
Proprietario. A classe Proprietario conterá os seguintes atributos: nome, 
endereço, sexo, CPF e número CNH (Carteira Nacional de Habilitação).

Escreva um programa que crie dois objetos da classe Proprietario e cinco 
objetos a partir da classe Veiculo. Cada objeto da classe Veiculo deve ser 
associado a um dos objetos da classe Proprietario. 

Após fazer isso, o programa deve mostrar os dados de todos os veículos 
criados. */

public class Lista704 {
       public static void main(String[] args) throws Exception {
              Proprietario proprietario1 = new Proprietario("Ana", "Rua A", 'f', "000.000.000-00", "000000000");
              
              Veiculo veiculo1 = new Veiculo("AAA1A11", "azul", "Ora Cat", proprietario1);
              Veiculo veiculo2 = new Veiculo("BBB2B22", "preto", "Impala 65", proprietario1);
              Veiculo veiculo3 = new Veiculo("CCC3C33", "cinza", "Cayenne", proprietario1);
              
              Proprietario proprietario2 = new Proprietario("João", "Rua B", 'm', "222.222.222-22", "222222222");
              
              Veiculo veiculo4 = new Veiculo("DDD4D44", "vermelho", "miata MX-5", proprietario2);
              Veiculo veiculo5 = new Veiculo("EEE5E55", "branco", "miata 95", proprietario2);
      
              System.out.println(veiculo1 + "\n" + veiculo2 + "\n" + veiculo3 + "\n" + veiculo4 + "\n" + veiculo5);
          }
}
