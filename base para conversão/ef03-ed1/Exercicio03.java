import java.util.*;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		double peso,distancia,pagar;
		System.out.print("Informe o peso do caminhão: ");
		peso = snc.nextDouble();
		System.out.print("Informe a distancia o percurso: ");
		distancia = snc.nextDouble();
		
		if(peso <=5) {
			pagar = (peso * distancia)*.8;
			System.out.printf("o valor a serpago no frete sera de: R$%.2f%n",pagar);
		}
		else if(peso <=20) {
			pagar = (peso * distancia)*1.2;
			System.out.printf("o valor a serpago no frete sera de: R$%.2f%n",pagar);
		}
		else {
			pagar = (peso * distancia)*1.8;
			System.out.printf("o valor a serpago no frete sera de: R$%.2f%n",pagar);
		}

	}

}
