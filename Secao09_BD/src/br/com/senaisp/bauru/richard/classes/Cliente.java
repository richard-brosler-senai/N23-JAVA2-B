package br.com.senaisp.bauru.richard.classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente extends EntidadeBase {
	
	private int id;
	private String nome;
	private String endereco;
	private double salario;

	public Cliente(ConectorBD con) {
		super(con);
		setNomeTabela("cliente");
		setCamposTabela("nome,endereco,salario");
	}

	public static Cliente criar(ConectorBD con, 
						  String nome, String endereco, 
						  double salario) throws SQLException {
		Cliente ret = new Cliente(con);
		ret.nome = nome;
		ret.endereco = endereco;
		ret.salario = salario;
		//inserindo no banco de dados
		//preparando o sql
		String sql = "insert into " + ret.getNomeTabela() + 
					"(" + ret.getCamposTabela() + ")" + 
					" values (?,?,?)";
		//preparando para executar
		System.out.println(sql);
		PreparedStatement stmt = con.getConexao()
			.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		//atribuir os parametros para executar
		stmt.setString(1, nome);
		stmt.setString(2, endereco);
		stmt.setDouble(3, salario);
		//executando a inserção de dados
		int linhasAfetadas = stmt.executeUpdate();
		//obtendo o id gerado
		ResultSet rs = stmt.getGeneratedKeys();
		rs.next(); //posicionando no primeiro dado
		ret.id = rs.getInt(1); //obtendo o valor do primeiro campo
		// mostrando qtos registros foram inseridos
		System.out.println("linhas afetadas: " + linhasAfetadas);
		return ret;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Id......: " + id +
			 "\nNome....: " + nome +
			 "\nEndereço: " + endereco +
			 "\nSalário.: " + salario;
	}
	//update cliente set nome
	public void gravar() throws SQLException {
		String sql = "update " + getNomeTabela() + 
					 " set nome=?, endereco=?, salario=? "+
				     "where id=?";
		PreparedStatement stmt = 
				getConn().getConexao().prepareStatement(sql);
		//setando os parametros
		stmt.setString(1, nome);
		stmt.setString(2, endereco);
		stmt.setDouble(3, salario);
		stmt.setInt(4, id);
		//
		stmt.executeUpdate();
	}
	//apagar cliente
	public void apagar() throws SQLException {
		String sql = "delete from " + getNomeTabela() + 
				     " where id=?";
		PreparedStatement stmt = 
				getConn().getConexao().prepareStatement(sql);
		//setando os parametros
		stmt.setInt(1, id);
		//executando o delete
		stmt.executeUpdate();
	}
	//buscar os dados read
	public boolean buscarRegistro(int pId) throws SQLException {
		boolean ret = false;
		String sql = "select nome,endereco,salario from "+
					 getNomeTabela() + " "+
				     "where id=?";
		PreparedStatement stmt = 
				getConn().getConexao().prepareStatement(sql);
		//setar parametro
		stmt.setInt(1, pId);
		//disparando a query
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			id = pId;
			nome = rs.getString(1);
			endereco = rs.getString(2);
			salario = rs.getDouble(3);
			ret = true;
		}
		return ret;
	}
}
