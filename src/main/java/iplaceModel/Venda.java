package iplaceModel;


import java.sql.Date;

public class Venda {
	
	public Integer codigo_venda;
	public Integer quantidade_venda;
	public Integer codigo_produto;
    public Date data_Venda;
    public Integer total_venda;
    
   
  
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
	public Integer getCodigo_produto() {
		return codigo_produto;
	}
	public void setCodigo_produto(Integer codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	public Date getData_Venda() {
		return data_Venda;
	}
	public void setData_Venda(Date data_Venda) {
		this.data_Venda = data_Venda;
	}
	public Integer getTotal_venda() {
		return total_venda;
	}
	public void setTotal_venda(Integer total_venda) {
		this.total_venda = total_venda;
	}
    
    
    
    
    
}
