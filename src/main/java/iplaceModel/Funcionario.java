package iplaceModel;


import java.util.Date;

import Percistencia.JdbcFuncionario;
import Percistencia.conexao;

public class Funcionario {

	
	public Integer codigo_pessoa;
	public String nome_pessoa;
	public Integer idade;
	public Date data_cadastro_funcionario;
	public Integer codigo_cargo;
	public String login;
	public Integer senha;
		

	public Funcionario() {
		
	}
	
//	public Funcionario (String nome_pessoa, Integer codigo_cargo) {
//		this.nome_pessoa = nome_pessoa;	
//		this.codigo_cargo = codigo_cargo;
//		
//}
	
	public Funcionario(Integer codigo_pessoa, String nome_pessoa, Integer idade, Date data_cadastro_funcionario,
			Integer codigo_cargo) {
		this.codigo_pessoa = codigo_pessoa;
		this.nome_pessoa = nome_pessoa;
		this.idade = idade;
		this.data_cadastro_funcionario = data_cadastro_funcionario;
		this.codigo_cargo = codigo_cargo;
			
	}
	
//	
//	public Funcionario(String nome_pessoa, Integer idade, Date data_cadastro_funcionario, Integer codigo_cargo) {
//	
//		this.nome_pessoa = nome_pessoa;
//		this.idade = idade;
//		this.data_cadastro_funcionario = data_cadastro_funcionario;
//		this.codigo_cargo = codigo_cargo;
//	}
//	
//	
//	public Funcionario(String nome_pessoa, Integer idade, Integer codigo_cargo) {
//		
//		this.nome_pessoa = nome_pessoa;
//		this.idade = idade;
//		this.codigo_cargo = codigo_cargo;
//	}
//	


	public Integer getCodigo_pessoa() {
		return codigo_pessoa;
	}
	public void setCodigo_pessoa(Integer codigo_pessoa) {
		this.codigo_pessoa = codigo_pessoa;
	}
	public String getNome_pessoa() {
		return nome_pessoa;
	}
	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Date getData_cadastro_funcionario() {
		return data_cadastro_funcionario;
	}
	public void setData_cadastro_funcionario(Date data_cadastro_funcionario) {
		this.data_cadastro_funcionario = data_cadastro_funcionario;
	}
	public Integer getCodigo_cargo() {
		return codigo_cargo;
	}
	public void setCodigo_cargo(Integer codigo_cargo) {
		this.codigo_cargo = codigo_cargo;
	}

}
