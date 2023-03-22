import java.util.Scanner;

public class Questao1{
    public static void main(String[] args) {
        int cont = 0;
        float aux = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira o nome do Aluno: ");
        String nome = teclado.nextLine();

        while (cont < 3) {
            System.out.print("Insira a " + cont + "ª nota: ");
            float nota = teclado.nextFloat();
            aux = aux + nota;
            cont += 1;
        }
        float media = (aux)/cont;

        status(nome, media);
    }

    public static void status(String n, float nota){
        System.out.println("Nome: " + n);
        System.out.println("Nota: " + nota);

        if (nota > 6) {
            System.out.println("APROVADO");
        } else if (nota >= 4 && nota <= 6) {
            System.out.println("REPOSIÇÃO");
        } else if (nota < 4) {
            System.out.println("REPROVADO");
        }
    }
}