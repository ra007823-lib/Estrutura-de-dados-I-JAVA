package estruturaDeRepeticao;
import java.util.*;
import javax.swing.*;
public class Exemplo5_2 {

/*	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		float num, soma = 0f;
		do{
			System.out.print("Digite um nomero ou zero para sair:");
			num = scn.nextInt();
			soma += num;
			
			System.out.println("A soma é: "+soma);
		}while(num !=0);

	}

}
*/
	public static void main(String[] args) {
			float num, soma = 0f;
			do{
				num = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero ou zero para sair:"));
				soma+=num;
				JOptionPane.showMessageDialog(null,"Soma final:"+soma);
			}while(num !=0);
		}
	}