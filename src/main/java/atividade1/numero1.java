package atividade1;

import java.util.Scanner;

public class numero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DDIGITE UM NUMERO");
                int num =  scanner.nextInt();
                if (num >= 0)
                    System.out.println("Este numero e positivo");
                else {
                    System.out.println("Este numero e negativo");
                }

    }
}
