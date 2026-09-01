import java.util.*;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe um numero de 1 a 7 para o dia da semana: ");
		int dia = scn.nextInt();
		switch(dia){
		case(1):
			System.out.print("Domingo");
		break;
		case(2):
			System.out.print("Segunda-Feira");
		break;
		case(3):
			System.out.print("Terça-Feira");
		break;
		case(4):
			System.out.print("Quarta-Feira");
		break;
		case(5):
			System.out.print("Quinta-Feira");
		break;
		case(6):
			System.out.print("Sexta-Feira");
		break;
		case(7):
			System.out.print("Sabado");
		break;
		default:
			System.out.print("Erro!");
		}
			
	}

}
