package Percistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import iplaceModel.Produto;
import iplaceModel.Venda;

public class JdbcVenda {
	
	Connection conexao;
	
	public JdbcVenda(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void realizaVenda(Venda a) {
		String sql = "INSERT INTO venda (id_produto,quantidade_venda,data_venda)"
				+ "VALUES (?, ?, ?)";
		PreparedStatement ps;
	
	
	try {
		ps = this.conexao.prepareStatement(sql);
		ps.setInt(1, a.getId_produto());
		ps.setInt(2, a.getQuantidade_venda());
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
		String data_venda = dFormat.format(a.getData_venda());
		java.sql.Date date2 = java.sql.Date.valueOf(data_venda);
		ps.setDate(3, date2);
		ps.execute();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public ArrayList<Venda> buscaTotalVenda () {
		
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		String sql = "SELECT id_produto, sum(quantidade_venda) "
				+ "FROM venda WHERE data_venda BETWEEN = ? AND = ?"
				+ "GROUP BY id_produto"
				+ " ORDER BY count(*) DESC LIMIT 1";

		try {
			
			Statement declaracao = conexao.createStatement();
			   ResultSet resposta = declaracao.executeQuery(sql);	
			
			   while(resposta.next()) {
				   

				   int id_produto = resposta.getInt("id_produto");
				   int quantidade_venda = resposta.getInt("quantidade_venda");
				   Date data_venda = resposta.getDate("data_venda");

				   
				   Venda b = new Venda ();
				   vendas.add(b);

			   }
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vendas;
		
	}
	

	public void buscaTotalQuantidade(Venda a) {
		
		String sql = "SELECT sum(quantidade_venda) FROM venda WHERE data_venda BETWEEN ? AND ? ";
		
		PreparedStatement ps;
		
		try {
			ps = this.conexao.prepareStatement(sql);
			ps.setInt(1, a.getQuantidade_venda());
			SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
			String data_venda = dFormat.format(a.getData_venda());
			java.sql.Date date2 = java.sql.Date.valueOf(data_venda);
			ps.setDate(2, date2);
	//		String data_venda = dFormat.format(a.getData_venda());
			java.sql.Date date3 = java.sql.Date.valueOf(data_venda);
			ps.setDate(3, date3);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }

	}
	

