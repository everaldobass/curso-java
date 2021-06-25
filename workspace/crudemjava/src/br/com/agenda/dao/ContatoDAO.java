package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

// CRUD
public class ContatoDAO {
	

	// ========================Salvar um contato=================================
	
	public void save(Contato contato) {

		String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES (?, ?, ?) ";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {

			// criando uma conexao com o banco
			conn = ConnectionFactory.createConnectionToMySQL();

			// Criando uma conexao para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			// Adicionando os valores que são esperados na query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));

			// Executar a query
			pstm.execute();

			System.out.println("\nContato Salvo com sucesso!!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			// Fechar as conexões
			try {
				if (pstm != null) {

					pstm.close();

				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
	
	
	
	
	
	// ==========================Atualizar contato=======================================
	
	public void update(Contato contato) {
		String sql = "UPDATE contatos SET nome = ?, idade = ?, datacadastro = ? " + "WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			// Criar conexao com o banco
			conn =  ConnectionFactory.createConnectionToMySQL();
			
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			// Adicionar os valores para atualizar
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			// Qual o ID 
			pstm.setInt(4, contato.getId());
			
			// Executado a query
			pstm.execute();
			
	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			// Fechando as conexões
			try {
				
				// Fechando o pstm
				if(pstm!=null) {
					
					pstm.close();
				
				}
				// Fechando a Connection
				if (conn!=null) {
					
					conn.close();
					
				}
				
					
			} catch (Exception ex) {
				
				ex.printStackTrace();
				
			}
			
		}
	}
	
	// =================Deletar Registro no Banco de Dados===============================
	
	
	public void deleteByID(int id) {
		
		String sql = "DELETE FROM contatos WHERE id = ? ";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			
			// Fechando as conexões
			try {
				
				
				// Fechando o pstm
				if(pstm!=null) {
					
					pstm.close();
				
				}
				// Fechando a Connection
				if (conn!=null) {
					
					conn.close();
					
				}
				
				
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
	
	
	// ================Listar os contatos do banco de dados================================

	public List<Contato> getContatos() {

		String sql = "SELECT * FROM contatos";

		List<Contato> contatos = new ArrayList<Contato>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco
		ResultSet rset = null;

		try {

			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				Contato contato = new Contato();

				// Buscando os dados no Banco de Dados
				contato.setId(rset.getInt("id"));
				contato.setNome(rset.getString("nome"));
				contato.setIdade(rset.getInt("idade"));
				contato.setDataCadastro(rset.getDate("datacadastro"));

				contatos.add(contato);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Fechando as conexões

			try {

				if (rset != null) {
					rset.close();
				}

				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return contatos;

	}
}
