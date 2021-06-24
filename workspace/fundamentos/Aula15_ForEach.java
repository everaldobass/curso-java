package br.com.fundamentos;

public class Aula15_ForEach {

	public static void main(String[] args) {
		// Loop For-Each
		
		String[] carros = {"Aúdi", "BMW", "Ford", "Volvo"};
		for (String i : carros) {
			System.out.println("Carros: " + i);
		}
	}

}
