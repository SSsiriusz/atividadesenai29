import java.util.Scanner;

public class data1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o horário (formato HH:mm): ");
        String horario = scanner.nextLine();

        String[] partes = horario.split(":");
        int hora = Integer.parseInt(partes[0]);
        int minuto = Integer.parseInt(partes[1]);

        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60) {
            System.out.println("Horário válido!");
        } else {
            System.out.println("Horário inválido!");
        }
    }
}
