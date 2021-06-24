package br.com.fundamentos;

public class Aula09_Condicionais_If {

	public static void main(String[] args) {
		// Condições Java e instruções If
	
		
		
		int x = 20;
		int y = 18;
		
		if (x > y) {
			System.out.println("\n X é Maior que Y");
		}
		
		
		// A declaração else
		
		if (x < y) {
			System.out.println("\n X é Maior que Y ");
		}else {
			System.out.println("\n X é Menor que Y ");
		}
		
		
		// A declaração else if
		
		int time = 20;
		
		
		if (time <= 12) {
			
			System.out.println("Bom dia! ");
			
		}else if(time <= 18) {
			
			System.out.println("Boa Tarde! ");
		}
		else {
			
			System.out.println("Boa noite!! ");
		}
		
		
		// Operador ternário
		int tempo = 17;
		String res = (tempo < 18)? "Bom dia! " : "Boa noite! ";
		System.out.println(res);
		
		

	}

}
