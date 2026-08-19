import java.util.Scanner;
public class exemplo4_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float bonus;
		System.out.print("Qual o salario do colaborador: ");
		float salario = Integer.parseInt(scanner.nextLine());
		System.out.print("Digite o quantos anos de empresa você possui: ");
		int temp = Integer.parseInt(scanner.nextLine());
		if(temp >=5) {
			bonus = (salario*.2f);
			System.out.println("O bonos pago sera de: R$"+bonus);
		}
		else {
			bonus = (salario*.1f);
			System.out.println("O bonos pago sera de: R$"+bonus);
		}
	}

}
