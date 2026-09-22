import java.util.*;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.print("qual a idade do funcionario: ");
        int idade = scn.nextInt();
        
        System.out.print("deseja continar a soma? (S) ou (N)");
		String continuar = scn.next();

        while (continuar.equals("S")){

            System.out.print("Proxima idade: ");
            idade = scn.nextInt();
            
            System.out.print("deseja continar a soma? (S) ou (N)");
    		continuar = scn.next();
        }
		
	}

}
