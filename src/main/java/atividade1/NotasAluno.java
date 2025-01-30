import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo as 3 notas
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        // Determinando a maior e a menor nota
        double maiorNota = Math.max(nota1, Math.max(nota2, nota3));
        double menorNota = Math.min(nota1, Math.min(nota2, nota3));

        // Exibindo as notas
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);

        // Verificando se o aluno obteve nota máxima (nota >= 10) em alguma disciplina
        if (nota1 >= 10 || nota2 >= 10 || nota3 >= 10) {
            System.out.println("O aluno obteve nota máxima em pelo menos uma disciplina.");
        } else {
            System.out.println("O aluno não obteve nota máxima em nenhuma disciplina.");
        }

        // Verificando se o aluno foi aprovado em duas disciplinas (nota >= 7 em duas disciplinas)
        int disciplinasAprovadas = 0;
        if (nota1 >= 7) disciplinasAprovadas++;
        if (nota2 >= 7) disciplinasAprovadas++;
        if (nota3 >= 7) disciplinasAprovadas++;

        if (disciplinasAprovadas >= 2) {
            System.out.println("O aluno foi aprovado em pelo menos duas disciplinas.");
        } else {
            System.out.println("O aluno não foi aprovado em duas disciplinas.");
        }

        scanner.close();
    }
}
