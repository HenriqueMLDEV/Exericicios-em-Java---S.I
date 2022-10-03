package AreaCalculavel;

public class Quadrado {

    private double ladoQua;

    public void setLadoQua(double lado){
        this.ladoQua = ladoQua;
    }

    public double area (){
        return ladoQua * ladoQua;
    }
    public double perimetro (){
        return ladoQua * 4;
    }

}
