package Lista9PI.Lista901;

public class Modelo1 extends TV implements ControleRemoto {
       private String MODELO = "Modelo1";
       
       public Modelo1(boolean ligada, int voltagem, int tamanho) {
           super(ligada, voltagem);
           setTamanho(tamanho);
       }
       
       @Override
       public void ligar() {
              this.setLigada(true);
           System.out.println("TV1 - Modelo 1 está ligando!");
       }
   
       @Override
       public void desligar() {
           this.setLigada(false);
           System.out.println("TV1 - Desligando o Modelo 1!");
       }
   
       @Override
       public void mudarCanal(int canal) {
           this.setCanal(canal);
           System.out.println("Mudando o canal do Moddelo 1! Canal atual: " + this.getCanal());
       }
   
       @Override
       public void volume+(int taxa) {
           if (this.getVolume() + taxa > 100) {
               this.setVolume(100);
           } else {
               this.setVolume(this.getVolume() + taxa);
           }
           System.out.println("Aumentando o Volume da TV1! Volume atual: " + this.getVolume());
       }
   
       @Override
       public void diminuirVolume(int taxa) {
           if (this.getVolume() - taxa < 0){
               this.setVolume(0);
              }
           else {
               this.setVolume(this.getVolume() - taxa);
              }
              System.out.println("Diminuindo o Volume da TV2! Volume atual: " + this.getVolume());
       }
   }