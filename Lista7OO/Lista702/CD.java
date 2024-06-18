public class CD {
       private int musicas;
       private int atual;
       private int tocando;

       public CD(int numero) {
              this.musicas = numero;
              this.atual = 1;
              this.tocando = 0;
       }

       public int getNumero() {
              return musicas;
       }

       public void setNumero(int musicas) {
              this.musicas = musicas;
       }
       
        public int getAtual() {
              return atual;
       }

       public void setatual(int atual) {
              this.atual = atual;
       }

       public void tocando(int musicas) {
              this.musicas = musicas;
       }     

       public void play() {
              this.tocando = 1;
       }

       public void pause() {
              this.tocando = 2;
       }

       public void stop() {
              this.tocando = 0;
       }

       public void next() {
              this.atual += 1; 
       }

       public void previous() {
              this.atual -= 1;
       }

       @Override
       public String toString() {
              String estadoCD;

              if (tocando == 1) {
                     estadoCD = "tocando";
              } else if (tocando == 2){
                     estadoCD = "pausado";
              } else {
                     estadoCD = "parado";
              }

              return "    Display: " + 
                     "\n    CD está " + estadoCD +
                     "\n    Faixa tocando: " + 
                     getAtual();
       }
}
