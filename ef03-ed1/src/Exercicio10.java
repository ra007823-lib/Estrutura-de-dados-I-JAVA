import java.util.*;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a qauntidade de kWh utilazods: ");
		int consumo = scn.nextInt();
		double pagar;
		
		if(consumo <=100) {
			pagar = (consumo * .55);
			System.out.printf("o valor a ser pago sera de R$%.2f%n",pagar);
			
		}
		else if(consumo >=101 && consumo <= 300) {
			pagar = (100 * .55)+((consumo - 100)*.75);
			System.out.printf("o valor a ser pago sera de R$%.2f%n",pagar);
			
		}
		else {	
			pagar = (100 *.55) + (200*.75) + ((consumo-300)*.95);
			System.out.printf("o valor a ser pago sera de R$%.2f%n",pagar);
			
		}
		
		
	}

}
