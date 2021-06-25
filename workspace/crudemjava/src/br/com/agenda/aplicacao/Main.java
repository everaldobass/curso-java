package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		// CRUD
		
		
		// Cadastrar contato no Banco de Dados
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato =  new Contato();
		contato.setNome("Henrique");
		contato.setIdade(28);
		contato.setDataCadastro(new Date());
		
		//contatoDAO.save(contato);
		
		
		
		// Atualizando o contado no Banco de Dados
		Contato c1 = new Contato();
		c1.setNome("Veronica José do Nascimento");
		c1.setIdade(30);
		c1.setDataCadastro(new Date());
		c1.setId(5);
		
		//contatoDAO.update(c1);
		
		
		
		// Deletar um contato do Banco de Dados
		contatoDAO.deleteByID(6);
		
		
		// Visualização dos registros do banco de dados
		for(Contato c: contatoDAO.getContatos()) {
			System.out.println("\nLista de Contato!");
			System.out.println("Contatos: " + c.getId() );
			System.out.println("Contatos: " + c.getNome());
			System.out.println("Contatos: " + c.getIdade());
			System.out.println("Contatos: " + c.getDataCadastro());
		}	
		

	}

}
