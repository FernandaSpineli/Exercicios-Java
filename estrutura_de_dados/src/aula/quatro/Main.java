package aula.quatro;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> a = new ListaEncadeada<>();
		
		a.add("teste1");
		a.add("teste2");
		a.add("teste3");
		a.add("teste4");
		
		System.out.println(a.get(0));
		System.out.println(a);
		
		System.out.println(a.remove(3));
		System.out.println(a);
	}
}
