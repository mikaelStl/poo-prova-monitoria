package Questao4;

public class Item extends Produto{
    private int quantidade;

    public Item(String n, double v, int quant){
        super(n, v, quant);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
