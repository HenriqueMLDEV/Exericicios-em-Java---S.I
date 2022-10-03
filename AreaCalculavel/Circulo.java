package AreaCalculavel;

public class Circulo {
      private double raioC;
      private double pi;

      public void setRaio(double raioC){
          this.raioC = raioC;
      }

      public void setPI(double pi){
          this.pi = Math.PI;
      }

      public double area(){
          return  pi * raioC* raioC;
      }

      public double perimetro (){
          return 2 * pi * raioC;
      }


}
