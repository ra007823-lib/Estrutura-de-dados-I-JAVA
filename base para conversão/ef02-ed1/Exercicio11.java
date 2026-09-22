import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, nota4;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextFloat();

        System.out.print("Digite a quarta nota: ");
        nota4 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}