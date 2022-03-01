package aula.tres;

public class Main {

	public static void main(String[] args) {

		Fila<String> a = new Fila<>();
		a.enqueue("primeiro");
		a.enqueue("segundo");
		a.enqueue("terceiro");
		a.enqueue("quarto");
		
		System.out.println(a);
		
		System.out.println(a.dequeue());
		
	}

}
