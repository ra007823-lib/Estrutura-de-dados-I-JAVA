import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();

            if (nota >= 6.0) {
                System.out.println("Aluno aprovado!");
                aprovados++;
            } else {
                System.out.println("Aluno reprovado!");
                reprovados++;
            }
        }

        System.out.println("\nQuantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);

    }
}