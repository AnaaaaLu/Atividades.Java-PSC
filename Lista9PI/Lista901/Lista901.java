package Lista9PI.Lista901;

/* Implemente todas as classes do diagrama de classes abaixo (que modela um 
programa de simulação de eletrodomésticos para TVs e Rádios) respeitando a 
notação de cada classe e as associações estabelecidas. Dentro deste contexto é 
possível ter ações (comportamentos) que comumente todo eletrodoméstico executa 
(classe abstrata Eletrodomestico), mas que cada modelo específico (TVs e Rádios) 
pode executar de forma diferente (herança + redefinição de métodos). Como
geralmente toda a ação (comportamento) de uma TV é executada por um controle 
remoto, foi incluído neste modelo uma interface chamada ControleRemoto. A classe 
Eletrodomestico apresenta o que é comum a todos os eletrodomésticos (TVs e Rádios), 
assim como a interface ControleRemoto apresenta o que cada subclasse de 
Eletrodomestico deverá se comprometer de implementar (contrato). Desta forma, 
as classes Modelo1, Modelo2 e Radio devem estender (extends) a classe 
Eletrodomestico e implementar (implements) a interface ControleRemoto.

Implemente o programa proposto usando os conceitos já estudados de encapsulamento, 
construtores, herança, redefinição de métodos (@Override) e interface. Crie uma 
classe Teste que deverá instanciar no mínimo três objetos (uma para cada modelo 
de TV (Modelo1 e Modelo2 + o modelo de um rádio) e também testar os métodos ligar 
e desligar para cada objeto instanciado. Note que cada objeto deverá implementar 
um comportamento diferente. A seguir tem uma imagem com uma sugestão de resultado 
para o programa ao ser executado. */

public class Lista901 {
       public static void main(String[] args) throws Exception {
              Modelo1 tvModelo1 = new Modelo1(true, 110, 75);
              Modelo2 tvModelo2 = new Modelo2(false, 220, 25);
              Radio radio = new Radio(110, "Construção", 4, 30, true);
      
              radio.aumentarVolume(5);
              tvModelo1.desligar();
              tvModelo2.ligar();
              tvModelo2.mudarCanal(5);
          }   
}
