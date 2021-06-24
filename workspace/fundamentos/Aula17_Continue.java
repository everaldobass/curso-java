package br.com.fundamentos;

public class Aula17_Continue {

	public static void main(String[] args) {
		//  A continueinstrução interrompe uma iteração (no loop), 
		//  se uma condição especificada ocorrer, e continua com a próxima iteração no loop.
		
		
		for (int i = 0; i <= 10; i++) {
			if(i == 4) {
				continue;
			}
			
			System.out.println("Valor do Continue: "+ i);
		}

	}

}
