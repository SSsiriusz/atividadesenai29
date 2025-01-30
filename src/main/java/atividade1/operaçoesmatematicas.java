import java.util.Scanner;

public class operaçoesmatematicas {

    // 1. Receber dois números e indicar se sua soma é maior que 100
    public static void somaMaiorQue100(int a, int b) {
        if (a + b > 100) {
            System.out.println("A soma é maior que 100.");
        } else {
            System.out.println("A soma não é maior que 100.");
        }
    }

    // 2. Verificar se a diferença entre dois números é negativa
    public static void diferencaNegativa(int a, int b) {
        if (a - b < 0) {
            System.out.println("A diferença é negativa.");
        } else {
            System.out.println("A diferença não é negativa.");
        }
    }

    // 3. Receber dois números e indicar se um é divisível pelo outro
    public static void divisibilidade(int a, int b) {
        if (a % b == 0) {
            System.out.println(a + " é divisível por " + b + ".");
        } else if (b % a == 0) {
            System.out.println(b + " é divisível por " + a + ".");
        } else {
            System.out.println("Nenhum é divisível pelo outro.");
        }
    }

    // 4. Receber três números e verificar se eles podem formar um triângulo
    public static void verificaTriangulo(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os números podem formar um triângulo.");
        } else {
            System.out.println("Os números não podem formar um triângulo.");
        }
    }

    // 5. Receber um número e indicar se ele é um quadrado perfeito
    public static void quadradoPerfeito(int n) {
        double raiz = Math.sqrt(n);
        if (raiz == (int) raiz) {
            System.out.println(n + " é um quadrado perfeito.");
        } else {
            System.out.println(n + " não é um quadrado perfeito.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testando cada função

        // Exemplo para soma maior que 100
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        somaMaiorQue100(num1, num2);

        // Exemplo para diferença negativa
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        diferencaNegativa(num1, num2);

        // Exemplo para divisibilidade
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        divisibilidade(num1, num2);

        // Exemplo para verificar triângulo
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();
        verificaTriangulo(a, b, c);

        // Exemplo para quadrado perfeito
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        quadradoPerfeito(n);

        scanner.close();
    }
}
