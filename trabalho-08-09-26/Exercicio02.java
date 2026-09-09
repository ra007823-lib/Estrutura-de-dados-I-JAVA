import java.util.*;
import javax.swing.*;
public class Exercicio02{

/*	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		float nota,media=0;
		String cont;
		do{
			System.out.print("Digite a nota do aluno:");
			nota = scn,nextFloat();
			System.out.print("Para continuar digite "Sim": ");
		}while();
		System.out.println("A soma é: "+soma);

	}

}
*/
	public static void main(String[] args) {
			float num, soma = 0f;
			do{
				num = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero ou zero para sair:"));
				soma+=num;
			}while(num !=0);
			JOptionPane.showMessageDialog(null,"Soma final:"+soma);
		}
	}