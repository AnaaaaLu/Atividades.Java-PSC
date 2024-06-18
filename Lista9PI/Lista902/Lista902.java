/* Implemente todas as classes do diagrama de classes abaixo (que modela um 
programa de simulação de quadriláteros para geração de objetos quadrados e 
retângulos) respeitando a notação de cada classe e as associações estabelecidas. 
Para isso:
       • Crie uma classe abstrata que represente um quadrilátero e que receba 
       como parâmetros do construtor os quatro valores referentes a cada lado.
       • Estenda Quadrilatero em duas subclasses: Quadrado e Retangulo.
       • A classe Quadrado deve representar um quadrado e, portanto, receber 
       como parâmetro um único valor referente aos seus lados.
       • A classe Retangulo deve representar um retângulo e, portanto, deve 
       receber como parâmetros dois valores diferentes (base e altura).
       • Crie uma interface denominada CalculosGeometricos que deverá definir os 
       métodos calculaArea e calculaPerimetro. CalculaPerimetro deverá ser 
       implementado na superclasse abstrata Quadrilatero, enquanto o método 
       calculaArea deverá ser implementado pelas subclasses Quadrado e Retangulo.
       • Modifique a classe abstrata Quadrilatero de forma que ela implemente a 
       interface CalculosGeometricos.

Implemente o programa proposto usando os conceitos já estudados de encapsulamento, 
construtores, herança, redefinição de métodos (@Override) e interface. Crie uma 
classe Teste que deverá instanciar dois objetos, um de cada subclasse, Retangulo 
e Quadrado, e também testar os métodos implementados através da interface 
CalculosGeometricos para cada objeto instanciado. Note que cada objeto deverá 
implementar um comportamento diferente. A seguir tem uma imagem com uma sugestão 
de resultado para o programa ao ser executado. */

package Lista9PI.Lista902;

public class Lista902 {
       public static void main(String[] args) throws Exception {
        Quadrado2 quadrado2 = new Quadrado2((double) 1);
        System.out.println(quadrado2);
        
        Retangulo retangulo = new Retangulo(2, 3);
        System.out.println(retangulo);
    }
}