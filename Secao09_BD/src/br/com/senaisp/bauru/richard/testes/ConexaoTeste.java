package br.com.senaisp.bauru.richard.testes;

import br.com.senaisp.bauru.richard.classes.ConectorBD;

public class ConexaoTeste {

	public static void main(String[] args) {
		//criando uma conexao SQLite
		ConectorBD conectorSQLite = 
				ConectorBD.getConectorBDSQLite("clientes.db");
		System.out.println(conectorSQLite.toString());
		//criando uma conexao MySQL
		ConectorBD conectorMySQL = 
				ConectorBD.getConectorBDMySQL("127.0.0.1", 
						3306, "dbcliente", "root", "123456789");
		System.out.println(conectorMySQL.toString());
		//mostrando que são o mesmo objeto, mas com dados alterados
		System.out.println(conectorSQLite.toString());
		//um novo sqlite
		ConectorBD conectorSQLite2 = 
				ConectorBD.getConectorBDSQLite("clientes2.db");
		System.out.println(conectorSQLite2.toString());
	}

}
