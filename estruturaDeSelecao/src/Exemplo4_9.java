import java.util.*;
public class Exemplo4_9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("digite o codigo: ");
		int i = scn.nextInt();
		switch(i) {
		case 1: System.out.println("O produto é caderno");
		break;
		case 2: System.out.println("O produto é lápis");
		break;
		case 3: System.out.println("O produto é borracha");
		break;
		default:
		System.out.println("Diversos");
		}

	}

}
