package Questao4;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int escolha = 0;

        Carrinho carrinho = new Carrinho();

        System.out.println("MERCADINHO");

        do {
            System.out.println("1 - Comprar");
            System.out.println("2 - Ver carrinho");
            System.out.println("3 - Pagar");
            System.out.println("0 - Sair");
            
            System.out.print("O que deseja fazer? ");
            escolha = teclado.nextInt();

            if (escolha == 1) {
                menuItens(carrinho);
            } else if (escolha == 2) {
                carrinho.show();
            }
        } while (escolha != 0);
    }

    public static void menuItens(Carrinho carrinho) {
        int item;

        do {
            Item arroz = new Item("arroz", 1.20, 30);
            Item feijao = new Item("feijão", 0.76, 26);
            Item acucar = new Item("açucar", 0.99, 15);
            Item sal = new Item("sal", 0.45, 22);

            System.out.println("1:"+ arroz.getNome() + "--------------" + arroz.getValor());
            System.out.println("2:"+feijao.getNome() + "--------------" + feijao.getValor());
            System.out.println("3:"+acucar.getNome() + "--------------" + acucar.getValor());
            System.out.println("4:"+sal.getNome() + "--------------" + sal.getValor());
            System.out.println("0 - Voltar");

            System.out.println("Insira o item: ");
            item = teclado.nextInt();

            System.out.println("Insira a quantidade: ");
            int quant = teclado.nextInt();

            switch (item) {
                case 1: arroz.setQuantidade(quant);
                        carrinho.adicionar(arroz);
                    break;
                case 2: feijao.setQuantidade(quant);
                        carrinho.adicionar(feijao);
                    break;
                case 3: acucar.setQuantidade(quant);
                        carrinho.adicionar(acucar);
                    break;
                case 4: sal.setQuantidade(quant);
                        carrinho.adicionar(sal);
                    break;
                default: break;
            }
        } while (item != 0);
    }
}
