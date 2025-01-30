package atividade1;

import java.util.Scanner;

public class numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DDIGITE UM NUMERO");
        int num1 =  scanner.nextInt();

        System.out.println("DDIGITE UM NUMERO");
        int num2 =  scanner.nextInt();

        if (num1 > num2 )
            System.out.println("Entao\n "+num1+ "e maior que" +num2 );
        else {
            System.out.println("Entao\n "+num2+ "e  maior que" +num1);
        }

    }
}


