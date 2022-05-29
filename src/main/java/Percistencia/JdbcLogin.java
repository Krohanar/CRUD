package Percistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import iplaceModel.Funcionario;
import view.menuPrincipal;
import view.login;

public class JdbcLogin {

	Connection conexao;

	public JdbcLogin(Connection conexao) {
		this.conexao = conexao;
	}
	 public void login (Funcionario funcionario) {
			
		   String sql = ("SELECT * FROM funcionario WHERE nome_pessoa=? and senha=?");
		   PreparedStatement ps;
		   ResultSet rs;
		   Funcionario lg = new Funcionario();
		   
		    try {
		   
		       ps = this.conexao.prepareStatement(sql);
		       ps.setString(1, funcionario.getNome_pessoa());
		       ps.setString(2, funcionario.getSenha());
		       rs = ps.executeQuery();
		       while (rs.next()) {
		    	   lg.setNome_pessoa(rs.getString(2));
		    	   lg.setCodigo_cargo(rs.getInt(5));
		    	  
		       

				   menuPrincipal menu = new menuPrincipal(lg.getCodigo_cargo());
				   menu.setVisible(true);
		       }
		    }
		    catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   	    	    
	   }
}
