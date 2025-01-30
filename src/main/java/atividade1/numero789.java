import java.util.Scanner;

public class numero789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Verificar se o caractere é uma vogal
        System.out.println("Digite um caractere:");
        char caractere = scanner.next().charAt(0);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
            System.out.println("O caractere " + caractere + " é uma vogal.");
        } else {
            System.out.println("O caractere " + caractere + " não é uma vogal.");
        }

        // 2. Verificar se um número está no intervalo de 10 a 50
        System.out.println("Digite um número para verificar se está entre 10 e 50:");
        int numero1 = scanner.nextInt();

        if (numero1 >= 10 && numero1 <= 50) {
            System.out.println("O número " + numero1 + " está entre 10 e 50.");
        } else {
            System.out.println("O número " + numero1 + " não está entre 10 e 50.");
        }

        // 3. Verificar se um número está entre 100 e 200 ou fora desse intervalo
        System.out.println("Digite um número para verificar se está entre 100 e 200:");
        int numero2 = scanner.nextInt();

        if (numero2 >= 100 && numero2 <= 200) {
            System.out.println("O número " + numero2 + " está entre 100 e 200.");
        } else {
            System.out.println("O número " + numero2 + " está fora do intervalo de 100 a 200.");
        }

        scanner.close();
    }
}
