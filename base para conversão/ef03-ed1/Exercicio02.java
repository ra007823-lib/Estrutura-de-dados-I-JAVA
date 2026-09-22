import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double altura, peso,imc;
	    System.out.print("Informe sua altura em metros: ");
	    altura = (scn.nextDouble());
	    System.out.print("Informe seu peso em kg: ");
	    peso = (scn.nextDouble());
	    
	    imc = peso/(altura *altura);
	    
	    if (imc <= 18.5) {
	    	System.out.printf("Abaixo do peso pois seu imc foi de : %.2f%n",imc);
	    }
	    else if (imc <= 24.9) {
	    	System.out.printf("Peso normal pois seu imc foi de : %.2f%n",imc);
	    }
	    else if (imc <= 29.9) {
	    	System.out.printf("Sobrepeso peso pois seu imc foi de : %.2f%n",imc);
	    }
	    else {
	    	System.out.printf("Obesidade peso pois seu imc foi de : %.2f%n",imc);
	    }
	    
	}

}
