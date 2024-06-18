package Lista7OO.Lista704;

public class Veiculo {
       private String placa;
       private String cor;
       private String modelo;
       private Proprietario proprietario;

       public Veiculo(String placa, String cor, String modelo, Proprietario proprietario) {
              this.placa = placa;
              this.cor = cor;
              this.modelo = modelo;
              this.proprietario = proprietario;
       }

       public String getPlaca() {
              return this.placa;
       }

       public void setPlaca(String placa) {
              this.placa = placa;
       }

       public String getCor() {
              return this.cor;
       }

       public void setCor(String cor) {
              this.cor = cor;
       }

       public String getModelo() {
              return this.modelo;
       }

       public void setModelo(String modelo) {
              this.modelo = modelo;
       }

       public Proprietario getProprietario() {
       return this.proprietario;
       }

       public void setProprietario(Proprietario proprietario) {
              this.proprietario = proprietario;
       }

       @Override
       public String toString() {
              return " \n Placa: " + this.placa +
                     " \n Cor: " + this.cor +
                     " \n Modelo: " + this.modelo +
                     " \n Proprietário: " + this.proprietario;
       }
}
