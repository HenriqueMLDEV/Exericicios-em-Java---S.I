package AreaCalculavel;

public class Triangulo {
    private double alturaTri;
    private double baseTri;
    private double ladoTri;

    public void setAltura(double altura) {
        this.alturaTri = alturaTri;
    }

    public void setBase(double base) {
        this.baseTri = baseTri;
    }

    public void setLado(double lado){
        this.ladoTri = ladoTri;
    }

    public double area(){
        return baseTri * alturaTri /2;
    }

    public double perimetro(){
        return ladoTri * 3;

    };


}
