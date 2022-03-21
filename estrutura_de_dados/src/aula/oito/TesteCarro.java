package aula.oito;

import java.util.ArrayList;
import java.util.List;

public class TesteCarro {

	public static void main(String[] args) {
		
		List<Carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Chevrolet"));
		listaCarros.add(new Carro("Volkswagem"));
		
		System.out.println(listaCarros.contains(new Carro("Ford")));
	}
}
