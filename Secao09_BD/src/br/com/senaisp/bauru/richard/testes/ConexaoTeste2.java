package br.com.senaisp.bauru.richard.testes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.senaisp.bauru.richard.classes.ConectorBD;

public class ConexaoTeste2 {

	public static void main(String[] args) {
		ConectorBD conn = ConectorBD.getConectorBDSQLite("clientes.db");
		try {
			conn.conectar();
			System.out.println("Conectado");
			//prepara o sql para ser executado
			PreparedStatement stmt = conn.getConexao()
		.prepareStatement("select id,nome from cliente order by nome");
			//Executa e joga o ponteiro de retorno de dados para rs
			ResultSet rs = stmt.executeQuery();
			//Percorrendo os dados e mostrando
			while(rs.next()) {
				System.out.println(rs.getString("nome") + "-" +
									rs.getInt("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
