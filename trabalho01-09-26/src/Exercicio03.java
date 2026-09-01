import java.util.*;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.print("Digite um número: ");
        numero = scn.nextInt();

        while (numero != 0) {
            soma = soma + numero;

            System.out.print("Digite outro número: ");
            numero = scn.nextInt();
        }

        System.out.println("Total da soma: " + soma);
		
	}

}
