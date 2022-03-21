package aula.cinco;

public class Main {

	public static void main(String[] args) {

		ListaDuplamenteEncadeada<String> mlde = new ListaDuplamenteEncadeada<>();
	
		mlde.add("c1");
		mlde.add("c2");
		mlde.add("c3");
		mlde.add("c4");
		mlde.add("c5");
		mlde.add("c6");
		mlde.add("c7");
		System.out.println(mlde);
		
		mlde.remove(3);
		System.out.println(mlde);

		mlde.add("99");
		System.out.println(mlde);

	}
}
