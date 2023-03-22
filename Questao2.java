import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        float valorSegundos = input();
        output(valorSegundos);
    }

    public static float input() {
        float valor;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o total de segundos: ");
        valor = teclado.nextInt();
        teclado.close();
        return valor;
    }

    public static void output(float valor){
        System.out.println("Valor em horas: " + toHour(valor));
        System.out.println("Valor em minutos: " + toMinute(valor));
        System.out.println("Valor em segundos: " + valor);
    }

    public static float toMinute(float valor) {
        float minute;
        minute = valor/60;
        return minute;
    }

    public static float toHour(float valor){
        float hour;
        hour = valor/3600;
        return hour;
    }
}
