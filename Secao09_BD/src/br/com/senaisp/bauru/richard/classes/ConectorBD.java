package br.com.senaisp.bauru.richard.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBD {
	private static ConectorBD instancia = null;
	//campos do conector
	private String driverName;
	private String hostName;
	private int portaIP;
	private String databaseName;
	private String userName;
	private String password;
	//responsável pela conexao com o banco de dados
	private Connection conexao;
	//constructor
	private ConectorBD(String driver, String host, int porta,
			           String database, String user, String pass) 
	{
		driverName = driver;
		hostName = host;
		portaIP = porta;
		databaseName = database;
		userName = user;
		password = pass;
		conexao = null;
	}
	//Método estático que irá criar o objeto de ConectorBD
	public static ConectorBD 
		getConectorBDSQLite(String nomeDatabase2) {
		if (instancia==null) {
			instancia = new ConectorBD("sqlite", null, 0, 
										nomeDatabase2, null, null);
		}
		instancia.setDriverName("sqlite");
		instancia.setHostName(null);
		instancia.setPortaIP(0);
		instancia.setDatabaseName(nomeDatabase2);
		instancia.setUserName(null);
		instancia.setPassword(null);
		return instancia;
	}
	
	public static ConectorBD 
		getConectorBDMySQL(String host, int porta, 
							String nomeDatabase2,
							String user, String pass) {
	if (instancia==null) {
		instancia = new ConectorBD("mysql", host, porta, 
									nomeDatabase2, user, pass);
	}
	instancia.setDriverName("mysql");
	instancia.setHostName(host);
	instancia.setPortaIP(porta);
	instancia.setDatabaseName(nomeDatabase2);
	instancia.setUserName(user);
	instancia.setPassword(pass);
	return instancia;
	}
	//Métodos do objeto
	public void conectar() throws SQLException {
		String strConn;
		if (driverName.equals("sqlite")) {
			strConn = "jdbc:"+driverName+":"+databaseName;
		} else {
			strConn = "jdbc:"+driverName+"://"+hostName+":"+
						portaIP+"/"+databaseName;
		}
		conexao = DriverManager.getConnection(strConn);
	}
	//Getters e Setters
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public int getPortaIP() {
		return portaIP;
	}
	public void setPortaIP(int portaIP) {
		this.portaIP = portaIP;
	}
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Connection getConexao() {
		return conexao;
	}
	//toString para vermos como ficou nosso objeto
	@Override
	public String toString() {
		return "\nDriver: " + driverName + 
			   "\nHostName: "+ hostName + 
			   "\nPorta: "+portaIP+ 
			   "\nDatabaseName: " + databaseName+
			   "\nUserName: " + userName + 
			   "\nPassword: "+ password;
	}
}
