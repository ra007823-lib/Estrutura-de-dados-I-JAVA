import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        double preco;
        int quantidade;
        double total;

        System.out.print("Digite o nome do produto: ");
        nome = sc.nextLine();

        System.out.print("Digite o preço do produto: ");
        preco = sc.nextDouble();

        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();

        total = preco * quantidade;

        System.out.println("\n--- Dados do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: " + total);

    }
}