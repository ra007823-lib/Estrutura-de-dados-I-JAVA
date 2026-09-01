import java.util.Scanner;

public class Exemplo4_10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Para cadastrar um cliente digite 1 / Para excluir um cliente digite 2 / Para alterar dados de um cliente digite 3 / Para sair digite 4");
		int i = scn.nextInt();
		switch(i) {
		case 1: System.out.println("Cadastrar cliente: ");
		String nome = scn.next();
		System.out.println("Cliente "+nome+" cadastrado");
		break;
		case 2: System.out.println("Cadastrar cliente: ");
		String excluir = scn.next();
		System.out.println("Cliente "+excluir+" excluido");
		break;
		case 3: System.out.println("Alterar cliente: ");
		String alterar = scn.next();
		System.out.println("Cliente "+alterar+" açterado");
		break;
		default:
		System.out.println("até logo");
		}

	}

}
