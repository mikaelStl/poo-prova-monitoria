package Questao3;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double r){
        this.raio = r;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * (Math.pow(raio, 2));
    }
}
