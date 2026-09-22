import java.util.*;
import javax.swing.*;
public class Exercicio04 {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String continuar,nome;
//		int idade,i=0,media=0;
//		do{
//			System.out.println("Nome da pessoa que deseja cadastrar: ");
//			nome = scn.next();
//			System.out.println("Idade da pessoa que deseja cadastrar: ");
//			idade =  scn.nextInt();
//			System.out.println("Deseja continuar(sim)/(nao): ");
//			continuar =  scn.next();
//			i+=1;
//			media+=idade;
//		}while(continuar.equals("sim"));
//		System.out.println("Encerrado!");
//		System.out.println("a Quantidade de pessoas cadastradas foram de: "+i+", e a media de idades foram de: "+(media/i));
		
		String continuar,nome;
		int idade, i=0, media =0;
		do {
			nome = JOptionPane.showInputDialog("Nome da pessoa que deseja cadastrar: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade da pessoa que deseja cadastrar: "));
			continuar = JOptionPane.showInputDialog("Deseja continuar (sim) ou (nao): ");
			i++;
			media +=idade;
		}while(continuar.equals("sim"));
		JOptionPane.showMessageDialog(null,"a Quantidade de pessoas cadastradas foi de: "+i+"\n e a media de idades foram de: "+(media/i)+"\n Encerado");
	}

}
