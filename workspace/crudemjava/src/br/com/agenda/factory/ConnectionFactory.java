package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	
	
	// Driver de conexao
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	// Nome do usuário
	private static final String USERNAME = "root";
	
	// Senha do usuário
	private static final String PASSWORD = "123";
	
	// Caminho do banco de Dados, porta do banco
	private static final String URL = "jdbc:mysql://localhost:3306/agenda?useTimezone=true&serverTimezone=UTC";
	
	
	// Conexão com o Banco de Dados
	
	public static Connection createConnectionToMySQL() throws Exception {
		// Carregar a classe
		Class.forName(DRIVER);
		
		// Cria a conexao com o Banco de Dados
		Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		return connection;
		
	}
	
	
	public static void main(String[] args) throws Exception {
		//Recuperar uma conexao com o banco de Dados
		Connection con = createConnectionToMySQL();
		
		if(con!= null){
			System.out.println("Conectato com Sucesso!!!");
			con.close();
		}
	}
	
	
	

}
