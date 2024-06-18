package Lista9PI.Lista901;

public class Eletrodomestico {
       private boolean ligada;
       private int voltagem;
   
       public Eletrodomestico(boolean ligada, int voltagem) {
           this.ligada = ligada;
           this.voltagem = voltagem;
       }
   
       public boolean isLigada() {
           return this.ligada;
       }
   
       public void setLigada(boolean ligada) {
           this.ligada = ligada;
       }
   
       public int getVoltagem() {
           return this.voltagem;
       }
   
       public void setVoltagem(int voltagem) {
           this.voltagem = voltagem;
       } 
}
