import java.util.*;
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		int idade = scn.nextInt();
		System.out.print("Informe se o veiculo que deseja é Importado ou Popular");
		String veiculo = scn.next();
		int seguro = 1200;
		
		if(idade <= 25){
			if(veiculo.equals("importado"+"Importado")) {
				double valorS = (seguro *1.7);
				System.out.printf("O valor sugerido para a suas escolhar de veiculo foi de: R$%.2f%n",valorS);
			}
			else if(veiculo.equals("Popular"+"popular")) {
				double valorS = (seguro *1.4);
				System.out.printf("O valor sugerido para a suas escolhar de veiculo foi de: R$%.2f%n",valorS);
			}
		}
		else if (idade >=26 && idade<=45) {
			if(veiculo.equals("importado"+"Importado")) {
				double valorS = (seguro *1.3);
				System.out.printf("O valor sugerido para a suas escolhar de veiculo foi de: R$%.2f%n",valorS);
			}
			else if(veiculo.equals("Popular"+"popular")) {
				double valorS = (seguro *1.1);
				System.out.printf("O valor sugerido para a suas escolhar de veiculo foi de: R$%.2f%n",valorS);
			}
		}
		else if (idade >=46) {
			if(veiculo.equals("importado"+"Importado")) {
				double valorS = (seguro * 1.15);
				System.out.printf("O valor sugerido para a suas escolhar de veiculo foi de: R$%.2f%n",valorS);
			}
			else if(veiculo.equals("Popular"+"popular")) {
				double valorS = (seguro);
				System.out.printf("O valor sugerido para a suas escolhar de veiculo foi de: R$%.2f%n",valorS);
			}
		}
		else {
			System.out.print("informações incorretas!");
		}

	}

}
