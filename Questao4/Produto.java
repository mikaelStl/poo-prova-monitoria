package Questao4;

public class Produto {
    private String nome;
    private double valor;
    private int quantidadeEstoque;

    public Produto(String n, double v, int quant){
        this.nome = n;
        this.valor = v;
        this.quantidadeEstoque = quant;
    }

    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
}
