package Lista8HOA.Lista804;

/* Implementar completamente as classes descritas no diagrama de classes a 
seguir que representam uma associação entre classes. Respeitar a associação 
entre as classes sendo que Cofrinho “tem” um conjunto de moedas, ou seja, 
Cofrinho deverá ter um atributo do tipo ArrayList<Moeda> que será uma lista 
para armazenar moedas (objetos da classe Moeda).

A classe Cofrinho deverá prover métodos para incluir e remover elementos (moedas) 
da sua lista de moedas (“moedas”) a qual deverá ser uma estrutura do tipo 
ArrayList<Moeda>. Usar os códigos da figura abaixo como base para a criação dos 
métodos para manipular a lista de moedas.

Implementar uma classe Teste para testar/simular a associação criada. Adicionar 
ainda, à classe Cofrinho, um método ToString (@Override) para imprimir o total 
de moedas do cofrinho. A classe Teste deverá criar um conjunto de moedas 
(instanciar a classe Moeda para umCentavo, cincoCentavos, dezCentavos, 
vinteECincoCentavos, cinquentaCentavos e umReal) e adicionar e remover 
aleatoriamente essas moedas no Cofrinho conforme a imagem a seguir que 
apresenta uma sugestão de resultado para o programa ao ser executado. */

public class Lista804 {
       public static void main(String[] args) throws Exception{
              Moeda cincoCentavos = new Moeda(0.05, "Cinco Centavos");
              Moeda dezCentavos = new Moeda(0.10, "Dez Centavos");
              Moeda vinteECincoCentavos = new Moeda(0.25, "Vinte e Cinco Centavos");
              Moeda cinquentaCentavos = new Moeda(0.50, "Cinquenta Centavos");
              Moeda umReal = new Moeda(1.00, "umReal");



              Cofrinho cofrinho = new Cofrinho();

              cofrinho.addMoeda(umReal);
              cofrinho.addMoeda(umReal);
              cofrinho.addMoeda(umReal);
              cofrinho.addMoeda(umReal);
              cofrinho.addMoeda(umReal);
              cofrinho.addMoeda(cinquentaCentavos);
              cofrinho.addMoeda(vinteECincoCentavos);
              cofrinho.addMoeda(vinteECincoCentavos);
              cofrinho.addMoeda(dezCentavos);
              cofrinho.addMoeda(dezCentavos);
              cofrinho.addMoeda(dezCentavos);
              cofrinho.addMoeda(cincoCentavos);

              System.out.println(cofrinho.toString());
       }
}