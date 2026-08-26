import java.util.*;
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("informe sua idade: ");
		int idade = scn.nextInt();
		System.out.print("informe o dia que deseja comprar o ingresso: ");
		int dia = scn.nextInt();
		
		if(idade <=12) {
			if(dia >=2 && dia <=5) {
				int valor = 12;
				System.out.println("O valor a ser pago sera de: R$"+valor);
			}
			if(dia == 1 || dia == 6 || dia ==7) {
				int valor = 15;
				System.out.println("O valor a ser pago sera de: R$"+valor);
			}
		}
		else if(idade>=13 && idade <=59) {
			if(dia >=2 && dia <=5) {
				int valor = 22;
				System.out.println("O valor a ser pago sera de: R$"+valor);
			}
			if(dia == 1 || dia == 6 || dia ==7) {
				int valor = 28;
				System.out.println("O valor a ser pago sera de: R$"+valor);
			}
		}
		else if(idade < 60) {
			if(dia >=2 && dia <=5) {
				int valor = 11;
				System.out.println("O valor a ser pago sera de: R$"+valor);
			}
			if(dia == 1 || dia == 6 || dia ==7) {
				int valor = 11;
				System.out.println("O valor a ser pago sera de: R$"+valor);
			}
		}
		else {
			System.out.print("erro!");
		}
	}

}
