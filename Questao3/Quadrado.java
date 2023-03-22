package Questao3;

public class Quadrado extends Forma{
    private double lado;

    public Quadrado(double l){
        this.lado = l;
    }

    @Override
    public void calcularArea(){
        area = lado * lado;
    }
}
