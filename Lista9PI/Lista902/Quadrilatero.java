package Lista9PI.Lista902;

public abstract class Quadrilatero implements CalculosGeometricos {
       private Double lado1,lado2,lado3,lado4;

    public Quadrilatero(Double lado1,Double lado2,Double lado3,Double lado4){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    public Double getLado4() {
        return lado4;
    }

    public void setLado4(Double lado4) {
        this.lado4 = lado4;
    }
}
