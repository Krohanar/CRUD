package Percistencia;

import java.sql.Connection; 
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import iplaceModel.Funcionario;

public class JdbcFuncionario {
	
	Connection conexao;

	public JdbcFuncionario(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	
	public void inserirFuncionario (Funcionario g) {
		String sql = "INSERT INTO funcionario (nome_pessoa,idade,data_cadastro_funcionario, codigo_cargo)"
				+ "VALUES (?, ?, ?,?)";
		PreparedStatement ps;
	
	
	try {
		ps = this.conexao.prepareStatement(sql);
		ps.setString(1, g.getNome_pessoa());
		ps.setInt(2, g.getIdade());
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
		String data_cadastro_funcionario = dFormat.format(g.getData_cadastro_funcionario());
		java.sql.Date date1 = java.sql.Date.valueOf(data_cadastro_funcionario);
		ps.setDate(3, date1);
		ps.setInt(4, g.getCodigo_cargo());
		ps.execute();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
//	
//	public void inserirDataFuncionario (Funcionario d) {
//		
//		String sql = "INSERT INTO funcionario (data_cadastro_funcionario)"
//				+ "VALUES (?)";
//		PreparedStatement ps;
//
//		try {
//			ps = this.conexao.prepareStatement(sql);
//
//			ps.setDate(4,(Date) d.getData_cadastro_funcionario());
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	
   public ArrayList<Funcionario> listarFuncionario (){
	   ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	   String sql = "select * from funcionario";
	   
	   try {
		   Statement declaracao = conexao.createStatement();
		   ResultSet resposta = declaracao.executeQuery(sql);		   
		    
		   while(resposta.next()) {
			   
				int codigo_pessoa = resposta.getInt("codigo_pessoa");
				String nome_pessoa = resposta.getString("nome_pessoa");
				int idade = resposta.getInt("idade");
				Date data_cadastro_funcionario = resposta.getDate("data_cadastro_funcionario");
				int codigo_cargo = resposta.getInt("codigo_cargo");
				
				Funcionario g = new Funcionario(codigo_pessoa, nome_pessoa, idade, data_cadastro_funcionario,
								 codigo_cargo);
				 funcionarios.add(g);				 
		   }	   
		   
		   //Funcionario(Integer codigo_pessoa, String nome_pessoa, Integer idade, Date data_cadastro_funcionario,
		//	Integer codigo_cargo)
		   
		   
	   } catch (SQLException e) {
		   e.printStackTrace();
	   }
	   
	   
	   return funcionarios;
	   
   }
   
   public void alteraCargoFuncionario (Funcionario funcionario) {
	
	   String sql = ("UPDATE  funcionario SET codigo_cargo=?  WHERE nome_pessoa=?");
	   PreparedStatement ps;
	   
	   
	    try {
	   
	       ps = this.conexao.prepareStatement(sql);
	       ps.setString(1, funcionario.getNome_pessoa());
	       ps.setInt(2, funcionario.getCodigo_cargo());
		   ps.execute();
		
	    }
	    catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   	    	    
   }
   
   
	
   public void apagarFuncionario () {
	   String sql = "delete from funcionario";
	   
	   PreparedStatement gs;
	    
	   try {
		   gs = this.conexao.prepareStatement(sql);
		   gs.execute();
		   
	   }catch (SQLException e) {
		   e.printStackTrace();
	   }
	   
	   
   }
   
} 


