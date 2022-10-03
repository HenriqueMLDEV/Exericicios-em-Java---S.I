package AreaCalculavel;
import java.util.Scanner;

public class TestaForma {
    public static void main(String[] args) {
        // Testando o Retangulo
        System.out.println("============================");
        System.out.println("Calculando área do Retangulo");
        System.out.println("============================");

        Retangulo ret1 = new Retangulo();

        Scanner valor1 = new Scanner(System.in);
        System.out.println("Digite o valor da altura do retangulo= ");
        double alturaRet = valor1.nextDouble();
        System.out.println("Digite o valor da largura do retangulo= ");
        double larguraRet = valor1.nextDouble();

        ret1.setAltura(alturaRet);
        ret1.setLargura(larguraRet);

        System.out.println("Área do retangulo= " + ret1.area());
        System.out.println("Perímetro do retangulo= " + ret1.perimetro());

        System.out.println("============================");
        System.out.println("Calculando o Triângulo");
        System.out.println("============================");

        Triangulo tri1 = new Triangulo();

        Scanner valor2 = new Scanner(System.in);

        System.out.println("Digite o valor da altura do triângulo= ");
        double alturaTri = valor2.nextDouble();
        System.out.println("Digite o valor da base do triângulo= ");
        double baseTri = valor2.nextDouble();
        System.out.println("Digite o valor dos lados do triângulo= ");
        double ladoTri = valor2.nextDouble();

        tri1.setAltura(alturaTri);
        tri1.setBase(baseTri);
        tri1.setLado(ladoTri);

        System.out.println("Área do triângulo= " + tri1.area());
        System.out.println("Perímetro do triângulo= " + tri1.perimetro());

        System.out.println("============================");
        System.out.println("Calculando o Quadrado ");
        System.out.println("============================");

        Quadrado qua1 = new Quadrado();

        Scanner valor3 = new Scanner(System.in);

        System.out.println("Digite o valor do lado= ");
        double ladoQua = valor3.nextDouble();

        qua1.setLadoQua(ladoQua);

        System.out.println("Área do quadrado= " + qua1.area());
        System.out.println("Perímetro do quadrado= " + qua1.perimetro());

        System.out.println("============================");
        System.out.println("Calculando o Circulo ");
        System.out.println("============================");

        Circulo cir1 = new Circulo();

        Scanner valor4 = new Scanner(System.in);

        System.out.println("Digite o valor do raio= ");
        double raioC = valor4.nextDouble();

        cir1.setRaio(raioC);
        cir1.setPI(Math.PI);

        System.out.println("Área do Circulo= " + cir1.area());
        System.out.println("Perímetro do Circulo= " + cir1.perimetro());








    }

}
