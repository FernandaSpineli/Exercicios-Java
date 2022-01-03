package curso_de_poo;

public class UltraEmojiCombat {
	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
			l[0] = new Lutador("Thug Life", "França", 31 , 1.75f, 68.9f, 11, 2, 1 );
			l[1] = new Lutador("Put Script", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3 );
			l[2] = new Lutador("Snap Shadow", "EUA", 35, 1.65f, 80.9f, 12, 2 ,1 );
			l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
			l[4] = new Lutador("UFOcobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3 );
			l[5] = new Lutador("Nerd Art", "EUA", 30, 1.81f, 105.7f, 12, 2, 4 );

			Luta uec01 = new Luta();
			uec01.scoreFight(l[2], l[3]);
			System.out.println("-------- IT'S TIME !!! ---------");
			System.out.println("------- FAÇAM SUAS APOSTAS !!! --------");
			uec01.fight();
			
	
	
	}
}
