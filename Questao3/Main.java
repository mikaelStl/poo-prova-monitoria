package Questao3;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        Circulo circulo = new Circulo(5.6);
        Triangulo triangulo = new Triangulo(3, 4.2);
        Retangulo retangulo = new Retangulo(4, 7);

        quadrado.calcularArea();
        circulo.calcularArea();
        triangulo.calcularArea();
        retangulo.calcularArea();

        System.out.println("Área do quadrado: " + quadrado.getArea());
        System.out.println("Área do círculo: " + circulo.getArea());
        System.out.println("Área do triângulo: " + triangulo.getArea());
        System.out.println("Área do retângulo: " + retangulo.getArea());
    }
}
