package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Pergunta;

public class DaoPergunta {
	private static final String URL = "jdbc:mysql://localhost/terror";
	
	public Pergunta consultar(int id) {
		String sql = "SELECT * FROM pergunta WHERE id = " + id;
		
		Pergunta pergunta = new Pergunta();
		
		try {
			Connection conexao = DriverManager.getConnection(URL, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			ResultSet resultado = operacao.executeQuery();
			
			resultado.first();
			
			pergunta.setEnunciado((String)resultado.getObject(2));
			pergunta.setOpcaoa((String)resultado.getObject(3));
			pergunta.setOpcaob((String)resultado.getObject(4));
			pergunta.setOpcaoc((String)resultado.getObject(5));
			pergunta.setOpcaod((String)resultado.getObject(6));
			String gabarito = (String)resultado.getObject(7);
			pergunta.setGabarito(gabarito.charAt(0));
			
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return pergunta;
	}
}
