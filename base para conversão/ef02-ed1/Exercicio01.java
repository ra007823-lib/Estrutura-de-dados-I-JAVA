import javax.swing.*;
/*import java.util.Scanner;*/

public class Exercicio01 {

	public static void main(String[] args) {
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(null);
		/*
		 * Scanner scan = new Scanner(System.in); String nome, endereco; endereco =
		 * scan.nextLine();
		 */
		
		
		String nome = "Abacate";
		int num1,num2,num3,num4,result;
		num1 = 2;
		num2 = 1;
		
		num3 = 4;
		num4 = 3;
		result = (num3 + num4);
		
		
	
		janela.setSize(400,400);
		
		JLabel texto = new JLabel(nome);
		texto.setBounds(180, 100, 100, 30);
		
		JLabel soma1 = new JLabel(String.valueOf(num1 + num2));
	    soma1.setBounds(200, 150, 100, 30);

	    JLabel soma2 = new JLabel(String.valueOf(result));
	    soma2.setBounds(200, 200, 100, 30);
		
		janela.add(texto);
		janela.add(soma1);
		janela.add(soma2);
		janela.setVisible(true);
		
	}
}
