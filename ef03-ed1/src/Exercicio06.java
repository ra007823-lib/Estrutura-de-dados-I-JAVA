import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		double hr,min;
		hr = snc.nextInt();
		min = snc.nextInt();
		if (hr>=6 && hr<=11.59) {
			double pagar = (min * .45);
			System.out.printf("o valor a ser pago por minutos falados sera de R$%.2f%n",pagar);
		}
		else if (hr>=12 && hr<=17.59) {
			double pagar = (min * .6);
			System.out.printf("o valor a ser pago por minutos falados sera de R$%.2f%n",pagar);
		}
		else if (hr>=18 && hr<=22.59) {
			double pagar = (min * .6);
			System.out.printf("o valor a ser pago por minutos falados sera de R$%.2f%n",pagar);
		}
		else {
			double pagar = (min * .25);
			System.out.printf("o valor a ser pago por minutos falados sera de R$%.2f%n",pagar);
		}
	}

}
