package AreaCalculavel;

public class Retangulo {
    private double alturaRet;
    private double larguraRet;

    public void setAltura(double altura) {
        this.alturaRet = alturaRet;
    }

    public void setLargura(double largura) {
        this.larguraRet = larguraRet;
    }

    public double area() {
        return alturaRet * larguraRet;
    }

    public double perimetro() {
        return (alturaRet * 2) + (larguraRet * 2);
    }
}
