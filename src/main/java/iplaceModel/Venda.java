package iplaceModel;

import java.util.Date;

public class Venda {
	
	public Integer codigo_venda;
	public Integer quantidade_venda;
	public Integer id_produto;
    public Date data_venda;
    public String nome_prod;
    
    
    public Venda(int id_produto, int quantidade_venda, String nome_prod) {
    
    	this.id_produto = id_produto;
		this.quantidade_venda = quantidade_venda;
		this.nome_prod = nome_prod;
    }


	public Venda() {
		// TODO Auto-generated constructor stub
	}


	public Venda(int quantidade) {
		this.quantidade_venda = quantidade;
	}


	public void Venda (Integer codigo_venda, Integer quantidade_venda, Integer id_produto, Date data_venda) {
        
    	this.codigo_venda = codigo_venda;
		this.quantidade_venda = quantidade_venda;
		this.id_produto = id_produto;
		this.data_venda = data_venda;

    }
    
    
    
    
    
    public void Venda (int id_produto, int quantidade_venda) {
    
    	this.id_produto = id_produto;
		this.quantidade_venda = quantidade_venda;

    }
   
  
	public Integer getCodigo_venda() {
		return codigo_venda;
	}
	public void setCodigo_venda(Integer codigo_venda) {
		this.codigo_venda = codigo_venda;
	}
	public Integer getQuantidade_venda() {
		return quantidade_venda;
	}
	public void setQuantidade_venda(Integer quantidade_venda) {
		this.quantidade_venda = quantidade_venda;
	}
	public Integer getId_produto() {
		return id_produto;
	}
	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}
	public Date getData_venda() {
		return data_venda;
	}
	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}
	
	
	
	
    
}
