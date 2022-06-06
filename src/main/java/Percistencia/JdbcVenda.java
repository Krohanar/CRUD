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
	
	
	public ArrayList<Venda> buscaTotalVenda (Date dataIni, Date dataFim) {
		
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		String sql = "SELECT id_produto, sum(quantidade_venda), nome_produto "
				+ "FROM venda INNER JOIN produto ON produto.codigo_produto = venda.id_produto "
				+ "WHERE data_venda BETWEEN ? AND ? "
				+ "GROUP BY id_produto "
				+ " ORDER BY count(*)";

		try {
			
			PreparedStatement ps;
			ResultSet resposta;
				ps = this.conexao.prepareStatement(sql);
				 SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
				String data_ini = dFormat.format(dataIni);
				java.sql.Date date1 = java.sql.Date.valueOf(data_ini);
				ps.setDate(1, date1);
				String data_fim = dFormat.format(dataFim);
				java.sql.Date date2 = java.sql.Date.valueOf(data_fim);
				ps.setDate(2, date2);
				resposta = ps.executeQuery();
				
			   
			
				while(resposta.next()) {
				   

				   int id_produto = resposta.getInt("id_produto");
				   int quantidade_venda = resposta.getInt("sum(quantidade_venda)");
				   String nome_prod = resposta.getString("nome_produto");
				   
				   Venda b = new Venda(id_produto, quantidade_venda, nome_prod);
				   vendas.add(b);

			   }
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vendas;
		
	}
	

	public int buscaTotalQuantidade(Date dataIni, Date dataFim) {
		
		String sql = "SELECT sum(quantidade_venda) FROM venda WHERE data_venda BETWEEN ? AND ? ";
		
		PreparedStatement ps;
		ResultSet resposta;
		try {
			ps = this.conexao.prepareStatement(sql);
			SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
			String data_ini = dFormat.format(dataIni);
			java.sql.Date date1 = java.sql.Date.valueOf(data_ini);
			ps.setDate(1, date1);
			String data_fim = dFormat.format(dataFim);
			java.sql.Date date2 = java.sql.Date.valueOf(data_fim);
			ps.setDate(2, date2);
			resposta = ps.executeQuery();
			
			while(resposta.next()) { 
				return resposta.getInt("sum(quantidade_venda)");
			} 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
    }

	}
	

