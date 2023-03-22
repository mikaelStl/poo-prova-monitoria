package Questao3;

public class Retangulo extends Forma{
    private double altura;
    private double base;

    public Retangulo(double b, double a){
        this.base = b;
        this.altura = a;
    }

    @Override
    public void calcularArea(){
        area = base * altura;
    }
}
