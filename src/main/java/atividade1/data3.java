import java.util.Scanner;

public class data3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mês (1 a 12): ");
        int mes = scanner.nextInt();

        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();

        boolean valido = false;

        // Verificando os dias válidos para cada mês
        if (mes == 2) {
            if (dia >= 1 && dia <= 28) {
                valido = true;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia <= 30) {
                valido = true;
            }
        } else {
            if (dia >= 1 && dia <= 31) {
                valido = true;
            }
        }

        if (valido) {
            System.out.println("Dia válido!");
        } else {
            System.out.println("Dia inválido!");
        }
    }
}
