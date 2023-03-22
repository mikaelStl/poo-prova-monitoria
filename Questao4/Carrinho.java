package Questao4;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private List<Item> items;
    
    public Carrinho(){
        items = new ArrayList<Item>();
    }

    public void adicionar(Item i){
        items.add(i);
    }

    public void show() {
        for (Item item : items) {
            System.out.println("Item: " + item.getNome() + "Quantidade: " +  item.getQuantidade());
        }
    }
}
