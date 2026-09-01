import java.util.*;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Qual a opção desejada: (1) Consultar saldo, (2) Sacar, (3) Depositar e (4) Sair");
		int opc = scn.nextInt();
		int saldo = 500;
		while(opc != 4) {
			switch(opc) {
			case(1):
				System.out.println("seu saldo é de: R$"+saldo);
				break;
			case(2):
				System.out.println("squal o valor do saque desejado: ");
				int saque = scn.nextInt();
				if (saque > saldo) {
				    System.out.println("Saldo insuficiente!");
				} else {
				    saldo = saldo - saque;
				}
				break;
			case(3):
				System.out.println("Qual o valor do deposito: ");
				int deposito = scn.nextInt();
				saldo = saldo + deposito;
				break;
			default:
				System.out.println("Opção invalida");
			}
			System.out.println("Qual a opção desejada: (1) Consultar saldo, (2) Sacar, (3) Depositar e (4) Sair");
			opc = scn.nextInt();	
				
		}

	}

}
