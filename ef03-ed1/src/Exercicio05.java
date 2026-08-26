import java.util.*;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.print("qual e frequencia do aluno: ");
		int presenca = snc.nextInt();
		System.out.print("qual é a media do aluno: ");
		double nota = snc.nextDouble();
		if (presenca >= 75) {
			if(nota>=7) {
				System.out.print("Aprovado");
			}
			else if (nota>= 5 && nota<=6.9) {
				System.out.print("Recuperação");
			}
			else {
				System.out.print("reprovado por nota");
			}
		}
		else {
			System.out.print("Reprovado por falta");
		}
		

	}

}
