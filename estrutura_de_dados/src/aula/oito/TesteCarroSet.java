package aula.oito;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteCarroSet {

	public static void main(String[] args) {
		
		Set<Carro> carros = new HashSet<>();
		
		carros.add(new Carro("Ford"));
		carros.add(new Carro("Chevrolet"));
		carros.add(new Carro("Fiat"));		
		carros.add(new Carro("Pegeout"));
		carros.add(new Carro("Zip"));
		carros.add(new Carro("Alfa Romeu"));
		
		System.out.println(carros);
		
		Set<Carro> carrost = new TreeSet<>();
		
		carrost.add(new Carro("Ford"));
		carrost.add(new Carro("Chevrolet"));
		carrost.add(new Carro("Fiat"));		
		carrost.add(new Carro("Pegeout"));
		carrost.add(new Carro("Zip"));
		carrost.add(new Carro("Alfa Romeu"));
		
		System.out.println(carrost);
	}
}
