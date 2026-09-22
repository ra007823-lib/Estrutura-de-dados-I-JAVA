import java.util.*;
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n = scn.nextInt();
		int cont_par = 0,cont_impar = 0;
		while(n >0) {
			if(n%2==0) {
				System.out.println("o numero "+n+" é par");
				cont_par++;
			}
			else {
				System.out.println("o numero "+n+" é impar");
				cont_impar++;
			}
			System.out.print("Digite o proximo numero: ");
			n = scn.nextInt();
		}
		System.out.println("A quantidade de numeros pares foi de :"+cont_par+" e de impares foi de: "+cont_impar);
	}

}
