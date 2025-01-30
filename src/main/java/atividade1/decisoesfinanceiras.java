import java.util.Scanner;

public class DecisoesFinanceiras {

    // 1. Verificar se o saldo em uma conta é suficiente para um saque
    public static void verificarSaque(double saldo, double valorSaque) {
        if (saldo >= valorSaque) {
            System.out.println("Saque autorizado.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    // 2. Calcular o desconto em uma compra, baseado no valor total
    public static void calcularDesconto(double valorCompra) {
        if (valorCompra > 500) {
            double desconto = valorCompra * 0.10;
            double valorFinal = valorCompra - desconto;
            System.out.println("Desconto de 10%. Valor final: R$" + valorFinal);
        } else {
            System.out.println("Sem desconto. Valor final: R$" + valorCompra);
        }
    }

    // 3. Determinar se uma pessoa pode financiar um imóvel
    public static void podeFinanciar(double salario) {
        if (salario >= 3000) {
            System.out.println("Você pode financiar o imóvel.");
        } else {
            System.out.println("Seu salário é insuficiente para financiar o imóvel.");
        }
    }

    // 4. Verificar se uma pessoa pode comprar um produto parcelado
    public static void podeParcelar(double salario, double valorProduto, int numeroParcelas) {
        double parcela = valorProduto / numeroParcelas;
        if (parcela <= salario * 0.10) {
            System.out.println("Você pode comprar o produto parcelado.");
        } else {
            System.out.println("O valor das parcelas é muito alto para o seu salário.");
        }
    }

    // 5. Determinar se um cliente ganha um brinde por atingir um valor mínimo de compra
    public static void verificarBrinde(double valorCompra) {
        if (valorCompra >= 200) {
            System.out.println("Você ganhou um brinde pela sua compra!");
        } else {
            System.out.println("Sua compra não atingiu o valor mínimo para ganhar um brinde.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo para verificar saldo para saque
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        System.out.print("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        verificarSaque(saldo, valorSaque);

        // Exemplo para calcular desconto na compra
        System.out.print("Digite o valor total da compra: ");
        double valorCompra = scanner.nextDouble();
        calcularDesconto(valorCompra);

        // Exemplo para verificar se pode financiar um imóvel
        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();
        podeFinanciar(salario);

        // Exemplo para verificar parcelamento
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();
        podeParcelar(salario, valorProduto, numeroParcelas);

        // Exemplo para verificar se ganha um brinde
        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();
        verificarBrinde(valorCompra);

        scanner.close();
    }
}
