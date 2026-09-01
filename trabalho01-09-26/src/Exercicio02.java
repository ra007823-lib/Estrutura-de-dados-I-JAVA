import java.util.*;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe um numero de 1 a 12 para os meses do ano: ");
		int dia = scn.nextInt();
		switch(dia){
		case(1):
			System.out.print("Janeiro");
		break;
		case(2):
			System.out.print("Fevereiro");
		break;
		case(3):
			System.out.print("Março");
		break;
		case(4):
			System.out.print("Abril");
		break;
		case(5):
			System.out.print("Maio");
		break;
		case(6):
			System.out.print("Junho");
		case(7):
			System.out.print("Julho");
		break;
		case(8):
			System.out.print("Agosto");
		break;
		case(9):
			System.out.print("Setembro");
		break;
		case(10):
			System.out.print("Outubro");
		break;
		case(11):
			System.out.print("Novembro");
		break;
		case(12):
			System.out.print("Dezembro");
		break;
		
		default:
			System.out.print("Erro!");
		}
			
	}

}
