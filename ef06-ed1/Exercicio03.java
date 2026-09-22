import javax.swing.*;
import java.util.*;
public class Exercicio03 {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int i,num,media =0;
//		for(i =1; i<= 10; i++) {
//			System.out.println("informe o numero:");
//			num = scn.nextInt();
//			media+=num;
//		}
//		System.out.println("A media dos numero foram de: "+(media/i));
		
		int i,num,media=0;
		for(i =1;i<=10;i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero "+i+"° :"));
			media+=num;
		}
	JOptionPane.showMessageDialog(null,"A media foi de: "+(media/i));
	}

}
