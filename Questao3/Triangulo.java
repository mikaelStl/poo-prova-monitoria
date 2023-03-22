package Questao3;

public class Triangulo extends Forma{
    private double altura;
    private double base;

    public Triangulo(double b, double a){
        this.base = b;
        this.altura = a;
    }

    @Override
    public void calcularArea(){
        area = (base * altura)/2;
    }
}
