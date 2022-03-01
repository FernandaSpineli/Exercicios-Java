package aula.dois;

public class Main {

	public static void main(String[] args) {
		
		Pilha a = new Pilha();
		
		a.push(new No(1));
		a.push(new No(2));
		a.push(new No(3));
		a.push(new No(4));
		a.push(new No(5));
		a.push(new No(6));
		
		System.out.println(a);
		
	}
}
