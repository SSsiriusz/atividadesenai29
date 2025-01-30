package atividade1;

import java.util.Scanner;

public class numero2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DDIGITE UM NUMERO");
        int num =  scanner.nextInt();
        if (num % 2 == 0)
            System.out.println("Este numero e par");
        else {
            System.out.println("Este numero e impar");
        }

    }
}
