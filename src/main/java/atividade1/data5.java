import java.util.Scanner;

public class data5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data inicial do período (formato dd/mm/yyyy): ");
        String dataInicio = scanner.nextLine();
        System.out.println("Digite a data final do período (formato dd/mm/yyyy): ");
        String dataFim = scanner.nextLine();

        System.out.println("Digite a data para verificar (formato dd/mm/yyyy): ");
        String dataVerificar = scanner.nextLine();

        // Aqui você pode usar bibliotecas de manipulação de data para fazer a comparação
        // Simplificação: vamos apenas comparar as datas como Strings.

        if (dataVerificar.compareTo(dataInicio) >= 0 && dataVerificar.compareTo(dataFim) <= 0) {
            System.out.println("A data está no período!");
        } else {
            System.out.println("A data não está no período.");
        }
    }
}
