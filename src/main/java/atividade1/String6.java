package atividade1;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário digite as duas palavras
        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        // Comparar as palavras ignorando maiúsculas e minúsculas
        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais.");
        } else {
            System.out.println("As palavras são diferentes.");
        }

        scanner.close();
    }
}
