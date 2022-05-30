package iplaceModel;


import java.util.Date;


public class Produto {
	
	
	public Integer codigo_produto;
	public String nome_produto;
	public Date data_cadastro_produto;
	public Integer valor_produto; 
	public Integer quantidade_produto;
	
	public Produto(Integer codigo_produto,String nome_produto,Date data_cadastro_produto,Integer valor_produto,Integer quantidade_produto) {
		this.codigo_produto = codigo_produto;
		this.nome_produto = nome_produto;
		this.valor_produto = valor_produto;
		this.data_cadastro_produto = data_cadastro_produto;
		this.quantidade_produto = quantidade_produto;
			
	}

	

	public Integer getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(Integer codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public Date getData_cadastro_produto() {
		return data_cadastro_produto;
	}

	public void setData_cadastro_produto(Date data_cadastro_produto) {
		this.data_cadastro_produto = data_cadastro_produto;
	}

	public Integer getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(Integer valor_produto) {
		this.valor_produto = valor_produto;
	}

	public Integer getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(Integer quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	
	
	
	
}

