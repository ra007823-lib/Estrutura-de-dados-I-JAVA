import java.util.*;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("informe um numero: ");
		int n = scn.nextInt();
		int f = 1;
		while(n > 1){
			f = f *n;
			n--;
		}
		System.out.print("O fatorial é: "+f);
	}

}
