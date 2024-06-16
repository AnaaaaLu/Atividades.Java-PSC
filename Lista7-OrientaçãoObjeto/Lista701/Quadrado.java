

public class Quadrado {
       public double lado;

       public double lado() {
              return lado;
       }

       public void setSide(double lado) {
              this.lado = lado;
       }

       public double calcArea() {
              return lado * lado;
       }

       public double calcPerimetro() {
              return 4 * lado;
       }

       public double calcDiagonal() {
              double V2 = 1.41421;
              return lado * V2;
       }
}
