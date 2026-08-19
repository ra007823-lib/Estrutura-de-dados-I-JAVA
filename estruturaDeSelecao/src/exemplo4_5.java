import java.util.*;
public class exemplo4_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int num = Integer.parseInt(scanner.nextLine());
		if(num%2==1) {
			System.out.println("O numero "+num+" não é par");
		}
		else {
			System.out.println("O numero "+num+" é par");
		}
	}

}