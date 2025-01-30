package atividade1;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário digite uma palavra
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        // Verificar se a palavra tem mais de 5 caracteres
        if (palavra.length() > 5) {
            System.out.println("A palavra tem mais de 5 caracteres.");
        } else {
            System.out.println("A palavra tem 5 caracteres ou menos.");
        }

        scanner.close();
    }
}
