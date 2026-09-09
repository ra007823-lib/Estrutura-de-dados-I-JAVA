import java.util.*;
import javax.swing.*;
public class Exercicio01{

/*	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		float num, soma = 0f;
		do{
			System.out.print("Digite um nomero ou zero para sair:");
			num = scn.nextInt();
			soma += num;
		}while(num !=0);
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