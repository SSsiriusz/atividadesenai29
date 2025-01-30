package atividade1;

import java.util.Scanner;
public class numero5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int num2 = scanner.nextInt();
        System.out.println("Digite mais um número:");
        int num3 = scanner.nextInt();

        // Comparando os números
        if (num1 > num2 && num1 > num3) {
            System.out.println("O número " + num1 + " é maior do que " + num2 + " e " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O número " + num2 + " é maior do que " + num1 + " e " + num3);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O número " + num3 + " é maior do que " + num1 + " e " + num2);
        } else {
            System.out.println("Há números iguais.");
        }

        scanner.close();
    }
}
