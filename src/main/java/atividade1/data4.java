import java.util.Scanner;

public class data4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora (0-23): ");
        int hora = scanner.nextInt();

        if (hora >= 6 && hora < 12) {
            System.out.println("Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Tarde");
        } else {
            System.out.println("Noite");
        }
    }
}
