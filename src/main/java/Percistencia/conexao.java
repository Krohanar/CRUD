package Percistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	
	
	private Connection conexao;
	
	
	public Connection abrirconexao() {
		String url = "jdbc:mysql://localhost:3306/api_empresa?useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String password = "123456";
		
		try {
			conexao = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conexao;
	}
	
	
	public void fechaconexao () {
		try {
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}

