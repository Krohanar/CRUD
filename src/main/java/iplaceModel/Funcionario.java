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
	public String codigo_cargo_string;
	public String senha;
		
/*
 * Objeto/construtor responsavel pelo atributos da classe Funcionario.
 * A diferenciação entre Funcionarios ocorre quando definimos o codigo do cargo
 * podendo ser um funcionario simples ou gerente.
 */
	public Funcionario() {};
	public Funcionario(Integer codigo_pessoa, String nome_pessoa, Integer idade, Date data_cadastro_funcionario,
			String codigo_cargo) {
		this.codigo_pessoa = codigo_pessoa;
		this.nome_pessoa = nome_pessoa;
		this.idade = idade;
		this.data_cadastro_funcionario = data_cadastro_funcionario;
		this.codigo_cargo_string = codigo_cargo;
			
	}
	

	public String getCodigo_cargo_string() {
		return codigo_cargo_string;
	}
	public void setCodigo_cargo_string(String codigo_cargo_string) {
		this.codigo_cargo_string = codigo_cargo_string;
	}
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
