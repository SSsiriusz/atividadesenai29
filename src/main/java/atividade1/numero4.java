package atividade1;


import java.util.Scanner;

public class numero4 {
    public static void main(String[] args) {
      Scanner scanner  = new Scanner(System.in);
        System.out.println("Qual e sua idade");
        int num1 = scanner.nextInt();

        if ( num1 >= 16)

            System.out.println("Entao vc tem idade para Votar");
        else {
            System.out.println("Entao vc nao tem idade para votar");
        }
    }
}
