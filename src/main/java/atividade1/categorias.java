import java.util.Scanner;

public class categorias {

    // 1. Determinar a categoria de uma pessoa com base em sua idade
    public static void categoriaIdade(int idade) {
        if (idade >= 0 && idade <= 12) {
            System.out.println("Categoria: Criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria: Adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Categoria: Adulto.");
        } else {
            System.out.println("Categoria: Idoso.");
        }
    }

    // 2. Verificar a faixa de classificação de um número
    public static void classificacaoFaixa(int numero) {
        if (numero >= 1 && numero <= 10) {
            System.out.println("Classificação: A");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("Classificação: B");
        } else if (numero >= 21 && numero <= 30) {
            System.out.println("Classificação: C");
        } else {
            System.out.println("Número fora das faixas A, B e C.");
        }
    }

    // 3. Determinar a altura de uma pessoa
    public static void categoriaAltura(double altura) {
        if (altura < 1.60) {
            System.out.println("Categoria: Baixa.");
        } else if (altura >= 1.60 && altura <= 1.80) {
            System.out.println("Categoria: Média.");
        } else {
            System.out.println("Categoria: Alta.");
        }
    }

    // 4. Verificar o nível de risco baseado na pressão arterial
    public static void nivelRisco(int sistolica, int diastolica) {
        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Pressão arterial: Normal.");
        } else if ((sistolica >= 120 && sistolica < 130) && diastolica < 80) {
            System.out.println("Pressão arterial: Moderado.");
        } else if (sistolica >= 130 || diastolica >= 80) {
            System.out.println("Pressão arterial: Alto.");
        }
    }

    // 5. Verificar a temperatura em graus Celsius
    public static void temperatura(int temperatura) {
        if (temperatura < 15) {
            System.out.println("Está frio.");
        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Está agradável.");
        } else {
            System.out.println("Está quente.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo para categoria de idade
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        categoriaIdade(idade);

        // Exemplo para classificação de faixa
        System.out.print("Digite um número para classificação (1 a 30): ");
        int numero = scanner.nextInt();
        classificacaoFaixa(numero);

        // Exemplo para categoria de altura
        System.out.print("Digite a altura em metros: ");
        double altura = Double.parseDouble(scanner.next());
