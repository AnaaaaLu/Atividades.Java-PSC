package Lista9PI.Lista902;

public class Retangulo extends Quadrilatero {
       private double base, altura;

       public Retangulo(double base,double altura) {
              super(base,base,altura,altura);
              this.base = base;
              this.altura = altura;
       }

       public double getBase() {
              return base;
       }

       public void setBase(double base) {
              this.base = base;
       }

       public double getAltura() {
              return altura;
       }

       public void setAltura(double altura) {
              this.altura = altura;
       }

       @Override
       public double calcArea() {
              return this.getBase() * this.getAltura();
       }

       @Override
       public double calcPerimetro() {
              return this.getBase() * 2 + this.getAltura() * 2;
       }

       @Override
       public String toString() {
              return  "Retângulo de base: " + String.format("%.2f",this.getBase()) 
                     + " e altura: " + String.format("%.2f",this.getAltura())+ 
                     "\n- Área: " + String.format("%.2f",this.calcArea())+ 
                     "\n- Perímetro: " + String.format("%.2f",this.calcPerimetro());
       }
}
