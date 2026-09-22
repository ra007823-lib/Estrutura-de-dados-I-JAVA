import java.util.*;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.print("Qual o tipo de combustivel: gasolina(G) ou etanol(E)");
		 String tipo = snc.next();
		 double desc,gas,eta;
		 gas  = 5.89;
		 eta = 4.29;
		 if (tipo.equals("G")) {
			 System.out.print("Quantos de litros de combustivel deseja: ");
			 double comb = snc.nextDouble();
			 if(comb <= 20) {
				 desc  = (comb * gas);
				 System.out.printf("Você não obtive desconto, o valor a ser pago sera de: R$%.2f%n",desc);
			 }
			 else if(comb <= 40) {
				 desc  = (comb * gas)- ((comb * gas)*.03);
				 System.out.printf("Você obteve um desconte de 3 porcento, o valor a ser pago sera de: R$%.2f%n",desc);
			 }
			 else{
				 desc  = (comb * gas)- ((comb * gas)*.06);
				 System.out.printf("Você obteve um desconte de 6 porcento, o valor a ser pago sera de: R$%.2f%n",desc);
			 }
		 }
		 else if(tipo.equals("E")){
			 System.out.print("Quantos de litros de combustivel deseja: ");
			 double comb = snc.nextDouble();
			 if(comb <= 20) {
				 desc  = (comb * eta);
				 System.out.printf("Você não obtive desconto, o valor a ser pago sera de: R$%.2f%n",desc);
			 }
			 else if(comb <= 40) {
				 desc  = (comb * eta)- ((comb * eta)*.03);
				 System.out.printf("Você obteve um desconte de 3 porcento, o valor a ser pago sera de: R$%.2f%n",desc);
			 }
			 else{
				 desc  = (comb * eta)- ((comb * eta)*.06);
				 System.out.printf("Você obteve um desconte de 6 porcento, o valor a ser pago sera de: R$%.2f%n",desc);
			 }
		 }
		 else {
			 System.out.print("Erro!");
		 }
	}

}
