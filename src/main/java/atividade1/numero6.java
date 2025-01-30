package atividade1;

import java.util.Scanner;

public class numero6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 4 == 0 && num % 100 != 0)

            System.out.println("Este ano e bissexto");
        else {
            System.out.println("Este ano nao e bissexto");
            scanner.close();
        }
    }

}
