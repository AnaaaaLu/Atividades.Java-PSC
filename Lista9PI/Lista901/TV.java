package Lista9PI.Lista901;

public class TV extends Eletrodomestico{
       private int tamanho;
       private int canal;
       private int volume;
    
       public TV(boolean ligada, int voltagem) {
              super(ligada, voltagem);
       }

       public int getTamanho() {
              return this.tamanho;
       }

       public void setTamanho(int tamanho) {
              this.tamanho = tamanho;
       }

       public int getCanal() {
              return this.canal;
       }

       public void setCanal(int canal) {
              this.canal = canal;
       }

       public int getVolume() {
              return this.volume;
       }

       public void setVolume(int volume) {
              this.volume = volume;
       }

}