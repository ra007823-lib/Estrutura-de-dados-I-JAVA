package estruturaDeRepeticao;
import javax.swing.*;
import java.util.*;
public class Exemplo5_3 {

	public static void main(String[] args) {
/*		Scanner scn = new Scanner (System.in);
		float soma = 0,num,media;
		int i;
		for(i=1;i <= 20;i++) {
			System.out.print("O digite um numero: ");
			num = scn.nextFloat();
			soma+=num;
			
		}	
		media = soma/i;
		System.out.println("A media obitida foi de :"+media);

	}*/
		float soma = 0,num,media;
		int i;
		for(i=1;i <= 20;i++) {
			num = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero:"));
			soma+=num;
		}
		media = soma/i;
		JOptionPane.showMessageDialog(null,"A media obitida foi de:"+media);
	}

}

