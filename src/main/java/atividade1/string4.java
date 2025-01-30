package atividade1;

import java.util.Scanner;

class string4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário digite um nome
        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();

        // Verificar se o nome começa com a letra 'A'
        if (nome.length() > 0 && nome.toUpperCase().charAt(0) == 'A') {
            System.out.println("O nome começa com a letra 'A'.");
        } else {
            System.out.println("O nome não começa com a letra 'A'.");
        }

        scanner.close();
    }
}
