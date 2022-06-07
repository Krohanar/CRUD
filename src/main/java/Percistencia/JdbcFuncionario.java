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
		this.conexao = conexao; // Cria a conexão.
	}

	public void inserirFuncionario(Funcionario g) {
		String sql = "INSERT INTO funcionario (nome_pessoa,idade,data_cadastro_funcionario, codigo_cargo, senha)"
				+ "VALUES (?, ?, ?, ?, ?)"; // Monta a query que será utilizada
		PreparedStatement ps;

		try {
			ps = this.conexao.prepareStatement(sql); // Abre a conexão e prepara a query.
			ps.setString(1, g.getNome_pessoa()); // Para o primeiro ? da query, inclui o NOME pessoa através do get do objeto. 
			ps.setInt(2, g.getIdade());// Para o segundo parâmetro da query (?) inclui a IDADE atráves do get do objeto.
			// Chama a biblioteca SimpleDateFormat para converter a Date de java.util.date para java.sql.date para inserir no BD.
			SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
			String data_cadastro_funcionario = dFormat.format(g.getData_cadastro_funcionario());
			java.sql.Date date1 = java.sql.Date.valueOf(data_cadastro_funcionario);
			ps.setDate(3, date1);
			// Para o quarto parâmetro da query (?) inclui o código cargo atráves do get do objeto.
			ps.setInt(4, g.getCodigo_cargo());
			// Para o quinto parâmetro da query (?) inclui a IDADE atráves do get do objeto.
			ps.setString(5, g.getSenha());
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Criação do array lista funcionários para gerar a tabela no Jframe.
	public ArrayList<Funcionario> listarFuncionario() {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		String sql = "select * from funcionario";

		try {
			Statement declaracao = conexao.createStatement(); // Utiliza-se o Statement para abrir a conexão criar o statement.
			ResultSet resposta = declaracao.executeQuery(sql); // Executa a query sql, gravando os resultados na variável.

			String codigo_cargo_str;

			
			//Função para alocar todas as respostas na variável e cria um objeto para inserir dentro da array FUNCIONÁRIOS.
			while (resposta.next()) {

				int codigo_pessoa = resposta.getInt("codigo_pessoa");
				String nome_pessoa = resposta.getString("nome_pessoa");
				int idade = resposta.getInt("idade");
				Date data_cadastro_funcionario = resposta.getDate("data_cadastro_funcionario");
				int codigo_cargo_int = resposta.getInt("codigo_cargo");
				// Como na tabela o 1 é Gerente e 2 é Funcionário, utilizamos a lógica abaixo para trocar o modo de visualização no JFrame.
				if (codigo_cargo_int == 1) {
					codigo_cargo_str = "Gerente";
				} else {
					codigo_cargo_str = "Funcionario";
				}

				Funcionario g = new Funcionario(codigo_pessoa, nome_pessoa, idade, data_cadastro_funcionario,
						codigo_cargo_str);
				funcionarios.add(g);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return funcionarios;

	}

	// Altera o cargo do funcionário através do método abaixo.
	public void alteraCargoFuncionario(Funcionario funcionario) {

		//Query SQL para atualizar a tabela.
		String sql = ("UPDATE `funcionario` SET `codigo_cargo` = ?, `senha` = ? WHERE `funcionario`.`codigo_pessoa` = ?"); 
		PreparedStatement ps;

		try {

			ps = this.conexao.prepareStatement(sql);
			ps.setInt(1, funcionario.getCodigo_cargo());
			ps.setString(2, funcionario.getSenha());
			ps.setInt(3, funcionario.getCodigo_pessoa());

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	// Apaga o funcionário.
	public void apagarFuncionario(Funcionario funcionario) {
		String sql = "delete from funcionario WHERE nome_pessoa=?";

		PreparedStatement ps;

		try {
			ps = this.conexao.prepareStatement(sql);
			ps.setString(1, funcionario.getNome_pessoa());
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
