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
import iplaceModel.Produto;

public class JdbcProdutos {
	
	
	Connection conexao;

	public JdbcProdutos(Connection conexao) {
		this.conexao = conexao;
	}
	


	 public ArrayList<Produto> listarProdutos (){
		   ArrayList<Produto> produtos = new ArrayList<Produto>();
		   String sql = "select * from produto";
		   
		   try {
			   Statement declaracao = conexao.createStatement();
			   ResultSet resposta = declaracao.executeQuery(sql);		   
			    
			   while(resposta.next()) {
				   
					int codigo_produto = resposta.getInt("codigo_produto");
					String nome_produto = resposta.getString("nome_produto");
					Date data_cadastro_produto = resposta.getDate("data_cadastro_produto");
					int valor_produto = resposta.getInt("valor_produto");
					int quantidade_produto = resposta.getInt("quantidade_produto");

					
					Produto g = new Produto(codigo_produto, nome_produto, data_cadastro_produto, valor_produto,
							quantidade_produto);
					produtos.add(g);				 
			   }	   
			   
			   //Funcionario(Integer codigo_pessoa, String nome_pessoa, Integer idade, Date data_cadastro_funcionario,
			//	Integer codigo_cargo)
			   
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
		   }
		   return produtos;
}
	 
	 public void addProd(Produto prod) {
		 
		 String sql = "INSERT INTO Produto (nome_produto, data_cadastro_produto,valor_produto,quantidade_produto) VALUES (?,?,?,?)";
		 PreparedStatement ps;
		 
		 try {
			 
			 ps = this.conexao.prepareStatement(sql);
			 ps.setString(1, prod.getNome_produto());
			 SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
			String data_cadastro_prod = dFormat.format(prod.getData_cadastro_produto());
			java.sql.Date date1 = java.sql.Date.valueOf(data_cadastro_prod);
			ps.setDate(2, date1);
			ps.setInt(3,prod.getValor_produto());
			ps.setInt(4, prod.getQuantidade_produto());
			ps.execute();
				
			 
		 }catch(SQLException e) {
			   e.printStackTrace();
		 }
		 
	 }
	 
	 
	 public void apagarProd (Produto deletaProd) {
		   String sql = "delete from produto WHERE nome_produto=?";
		   
		   PreparedStatement ps;
		    
		   try {
			   ps = this.conexao.prepareStatement(sql);
			   ps.setString(1, deletaProd.getNome_produto());
			   ps.execute();
			   
		   }catch (SQLException e) {
			   e.printStackTrace();
		   }
	 }
	 
}