package curso_de_poo;

import java.util.Random;

public class Luta {
	private Lutador challenged;
	private Lutador challenger;
	private int rounds;
	private boolean approved;
	
	public Lutador getChallenged() {
		return challenged;
	}
	public void setChallenged(Lutador challenged) {
		this.challenged = challenged;
	}
	public Lutador getChallenger() {
		return challenger;
	}
	public void setChallenger(Lutador challenger) {
		this.challenger = challenger;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getApproved() {
		return approved;
	}
	public void setApproved(int approved) {
		this.approved = true;
	}
	public void scoreFight(Lutador l1, Lutador l2) {
		if (l1.getCategory().equals(l2.getCategory()) && l1 != l2) {
			this.approved = true;
			this.challenged = l1;
			this.challenger = l2;
		} else {
			this.approved = false;
			this.challenged = null;
			this.challenger = null;
		}
	}
	public void fight() {
		if (this.approved = true) {
			System.out.println("DESTE LADO ESTÁ O NOSSO DESAFIADO");
			this.challenged.apresentar();
			System.out.println("DO OUTRO LADO O DESAFIANTE");	
			this.challenger.apresentar();
			Random aleatorio = new Random();
			int winner = aleatorio.nextInt(3);
			switch (winner) {
			case 0:
				System.out.print("---- EMPATOU ----");
				this.challenged.empatarLuta();
				this.challenger.empatarLuta();
				break;
			case 1:
				System.out.print(this.challenged.getName()
						+ "---- FOI DESAFIADO E VENCEU!!! ----");
				this.challenged.ganharLuta();
				this.challenger.perderLuta();
				break;
			case 2: 
				
				System.out.print(this.challenger.getName()
						+ "---- DESAFIOU E GANHOU!!! ----");
				this.challenged.perderLuta();
				this.challenger.ganharLuta();
				break;
			}
		} else {
			System.out.print("A luta não pode acontecer");
		}
	}
}
