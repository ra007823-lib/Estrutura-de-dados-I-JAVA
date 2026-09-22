import java.util.Scanner;
public class SistemaCampeonato {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int qtdtime,gols = 0,somagols = 0,goleada = 0,mediat = 0,empates = 0, mediatime=0, contjogos = 0;
		String nome, resultado,goleador ="";
		
		System.out.print("Quantidade de times: ");
		qtdtime = scn.nextInt();
		
		for(int i= 1;i<=qtdtime; i++) {
			System.out.print("qual o nome do primeiro time: ");
			nome = scn.next();
			for(int partidas = 1; partidas <= 4 ;partidas++) {
				System.out.println("Qual o resultado da partida: vitoria(v) / derrota(d) / empate(e)");
				resultado = scn.next();
				System.out.print("quantos gols tiveram na "+partidas+"° partida: ");
				gols = scn.nextInt();
				somagols+=gols;
				contjogos ++;
				if(resultado.equals("e")) {
					empates++;
				}
				if(somagols>goleada){
					goleada = somagols;
					goleador = nome;
				}
				
			}
			mediatime += (somagols/4);
			System.out.println("o resultado do time: "+nome+", gols: "+somagols+"media de gols do time: "+mediatime +",empates: "+empates);
			mediat += somagols;
			somagols = 0;
			
		}
		System.out.println("total de empates de todos os times: "+empates);
		System.out.println("Media total de gols de todos os jogos "+(mediat / contjogos));
		System.out.println("O time que marcou mais gols: "+ goleador +" e a quantidae de gols desse time foi de: " + goleada);

	}

}
