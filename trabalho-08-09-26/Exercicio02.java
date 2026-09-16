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
			float num, soma = 0,i = 0;
			String cont;
			do{
				num = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno:"));
				cont = JOptionPane.showInputDialog("Deseja continuar (sim) ou (nao): ");
				soma +=num;
				i+=1;
			}while(cont .equals("sim"));
			JOptionPane.showMessageDialog(null,"Soma final:"+(soma/i));
		}
	}