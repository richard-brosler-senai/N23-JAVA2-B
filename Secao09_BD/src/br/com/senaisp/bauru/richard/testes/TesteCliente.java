package br.com.senaisp.bauru.richard.testes;

import java.sql.SQLException;

import br.com.senaisp.bauru.richard.classes.Cliente;
import br.com.senaisp.bauru.richard.classes.ConectorBD;

public class TesteCliente {

	public static void main(String[] args) {
		ConectorBD conn = ConectorBD.getConectorBDSQLite("clientes.db");
		try {
			conn.conectar();
			//Cliente cli = Cliente.criar(conn, "Maria", "Rua", 5000.50);
			Cliente cli = new Cliente(conn);
			if (cli.buscarRegistro(5)) {
				System.out.println(cli.toString());
				//cli.apagar();
			} else {
				System.out.println("Registro não encontrado!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
