package Percistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
}
