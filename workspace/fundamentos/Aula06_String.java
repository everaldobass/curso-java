package br.com.fundamentos;

public class Aula06_String {

	public static void main(String[] args) {
		/*
		 * Strings são usadas para armazenar texto.
         * Uma Stringvariável contém uma coleção de caracteres entre aspas duplas:
		 * 
		 */
		
		String nomeString = "String dentro de aspas";
		
		

		// Mais métodos de string
		/*
		 * Existem muitos métodos de string disponíveis, por exemplo toUpperCase()e toLowerCase():
		 * 
		 */
		
		String txt = "Olá Mundo! ";
		System.out.println("\n Maiusculo: " + txt.toUpperCase());
		System.out.println("\n Minusculo: " + txt.toLowerCase());
		
		
		// Encontrando um personagem em uma string
		/*
		 * O indexOf()método retorna o índice (a posição) da primeira ocorrência de um texto especificado em uma string (incluindo espaços em branco):
		 * 
		 */
		
		String indecePosicao = "O indexOf()método retorna o índice (a posição) ";
		System.out.println("\n Retorna um indece: " + indecePosicao.indexOf("retorna"));
		
		
		// String Concatenation
		
		String nome = "Everaldo";
		String sobrenome = "Nascimento";
		System.out.println("\n Cocatenar " +  nome + "" + sobrenome);

	}
	

}
