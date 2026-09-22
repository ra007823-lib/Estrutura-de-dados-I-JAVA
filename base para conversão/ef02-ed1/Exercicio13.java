import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeA, nomeB;
        double precoA, precoB;
        int quantidadeA, quantidadeB;
        double totalA, totalB;

        System.out.println("--- Produto A ---");

        System.out.print("Digite o nome: ");
        nomeA = sc.nextLine();

        System.out.print("Digite o preço: ");
        precoA = sc.nextDouble();

        System.out.print("Digite a quantidade: ");
        quantidadeA = sc.nextInt();

        sc.nextLine();

        System.out.println("\n--- Produto B ---");

        System.out.print("Digite o nome: ");
        nomeB = sc.nextLine();

        System.out.print("Digite o preço: ");
        precoB = sc.nextDouble();

        System.out.print("Digite a quantidade: ");
        quantidadeB = sc.nextInt();

        totalA = precoA * quantidadeA;
        totalB = precoB * quantidadeB;

        boolean maior = totalA > totalB;
        boolean igual = totalA == totalB;
        boolean diferente = totalA != totalB;

        System.out.println("\n--- Resultados ---");

        System.out.println("Produto A: " + nomeA);
        System.out.println("Total A: " + totalA);

        System.out.println("Produto B: " + nomeB);
        System.out.println("Total B: " + totalB);

        System.out.println("Total A > Total B: " + maior);
        System.out.println("Total A == Total B: " + igual);
        System.out.println("Total A != Total B: " + diferente);

    }
}