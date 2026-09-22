import java.util.*;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double entrada;
	    System.out.print("Informe o valor da compra: ");
	    entrada = Integer.parseInt(scn.nextLine());
	    if(entrada <= 100) {
	    	System.out.print("você não obteve desconto o valor pago sera de: R$"+entrada);
	    }
	    else if(entrada<=300) {
	    	entrada = entrada - (entrada *.05);
	    	System.out.print("você obteve desconto de 5% o valor pago sera de: R$"+entrada);
	    }
	    else if(entrada<=700) {
	    	entrada = entrada - (entrada *.1);
	    	System.out.print("você obteve desconto de 10% o valor pago sera de: R$"+entrada);
	    }
	    else {
	    	entrada = entrada - (entrada *.15);
	    	System.out.print("você obteve desconto de 15% o valor pago sera de: R$"+entrada);
	    }
	}

}
