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

       public void toca() {
              this.tocando = 1;
       }

       public void pausa() {
              this.tocando = 2;
       }

       public void para() {
              this.tocando = 0;
       }

       public void next() {
              this.atual += 1; 
       }

       public void previous() {
              this.atual -= 1;
       }

       /*@Override
       public String toString() {
              String estadoCD;

              if (tocando == 1) {
                     estadoCD = "Tocando";
              } else if (tocando == 2){
                     estadoCD = "Pausado";
              } else {
                     estadoCD = "Parado";
              }

              return "    Display: " + 
                     "\n    CD está " + estadoCD +
                     "\n    Faixa tocando: " + 
                     getAtual();
       }*/
}
