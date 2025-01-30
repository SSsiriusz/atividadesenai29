package atividade1;

import java.util.Scanner;

public class notas1notas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as notas
        System.out.println("Digite a primeira nota do aluno:");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota do aluno:");
        int nota2 = scanner.nextInt();

        // Calcular a média
        int media = (nota1 + nota2) / 2;

        // Exibir a média do aluno
        System.out.println("A média do aluno é: " + media);

        // Verificar a situação do aluno
        if (media >= 7) {
            System.out.println("O aluno está aprovado.");
        } else if (media >= 5) {
            System.out.println("O aluno está de recuperação.");
        } else {
            System.out.println("O aluno está reprovado.");
        }

        // Verificar se as notas estão acima, na média ou abaixo
        if (nota1 > media) {
            System.out.println("A primeira nota está acima da média.");
        } else if (nota1 == media) {
            System.out.println("A primeira nota está na média.");
        } else {
            System.out.println("A primeira nota está abaixo da média.");
        }

        if (nota2 > media) {
            System.out.println("A segunda nota está acima da média.");
        } else if (nota2 == media) {
            System.out.println("A segunda nota está na média.");
        } else {
            System.out.println("A segunda nota está abaixo da média.");
        }

        scanner.close();
    }
}
