package br.com.fundamentos;

public class Aula10_Switch {

	public static void main(String[] args) {
		// Declarações de switch
		
		
		
		int dia = 7;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
			
		case 7:
			System.out.println("Sabádo");
			break;

		default:
			System.out.println("Digite outro número: ");
			break;
		}

	}

}
