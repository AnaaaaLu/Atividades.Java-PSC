package Lista9PI.Lista902;

public class Quadrado2 extends Quadrilatero{
       private double lado;

       public Quadrado2(Double lado) {
              super(lado,lado,lado,lado);
              this.lado = lado;
       }

       public double getLado() {
              return lado;
       }

       public void setLado(double lado) {
              this.lado = lado;
       }

       @Override
       public double calcArea() {
              return this.lado * this.lado;
       }

       @Override
       public double calcPerimetro() {
              return this.getLado() * 4;
       }

       @Override
       public String toString() {
              return  "Quadrado criado com lado medindo: " + String.format("%.2f",this.lado) + 
                     "\n- Área: " + String.format("%.2f",this.calcArea()) + 
                     "\n- Perímetro: " + String.format("%.2f",this.calcPerimetro());
       }
}
