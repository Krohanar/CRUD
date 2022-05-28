package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import Percistencia.JdbcFuncionario;
import Percistencia.conexao;
import iplaceModel.Funcionario;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class adicionarPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoIdade;


	public adicionarPessoa() {
		setTitle("Cadastro de Funcionarios");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		campoNome = new JTextField();
		campoNome.setToolTipText("");
		campoNome.setBounds(67, 85, 152, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JTextPane nome = new JTextPane();
		nome.setBackground(Color.DARK_GRAY);
		nome.setForeground(Color.WHITE);
		nome.setText("Nome");
		nome.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		nome.setBounds(30, 85, 36, 20);
		contentPane.add(nome);
		
		JTextPane tituloPagCadastro = new JTextPane();
		tituloPagCadastro.setText("Cadastro de novos funcionários");
		tituloPagCadastro.setForeground(Color.WHITE);
		tituloPagCadastro.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		tituloPagCadastro.setBackground(Color.DARK_GRAY);
		tituloPagCadastro.setBounds(101, 39, 246, 20);
		contentPane.add(tituloPagCadastro);
		
		JTextPane txtpnData = new JTextPane();
		txtpnData.setText("Data do Cadastro");
		txtpnData.setForeground(Color.WHITE);
		txtpnData.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnData.setBackground(Color.DARK_GRAY);
		txtpnData.setBounds(254, 126, 93, 20);
		contentPane.add(txtpnData);
		
		JTextPane tituloEmpresa = new JTextPane();
		tituloEmpresa.setText("iPlace System");
		tituloEmpresa.setForeground(Color.WHITE);
		tituloEmpresa.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		tituloEmpresa.setBackground(new Color(153, 204, 0));
		tituloEmpresa.setBounds(0, 0, 434, 28);
		contentPane.add(tituloEmpresa);
		
		JTextPane cargo = new JTextPane();
		cargo.setText("Cargo");
		cargo.setForeground(Color.WHITE);
		cargo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		cargo.setBackground(Color.DARK_GRAY);
		cargo.setBounds(30, 116, 36, 20);
		contentPane.add(cargo);
		
		JTextPane idade = new JTextPane();
		idade.setText("Idade");
		idade.setForeground(Color.WHITE);
		idade.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		idade.setBackground(Color.DARK_GRAY);
		idade.setBounds(30, 147, 36, 20);
		contentPane.add(idade);
		
		campoIdade = new JTextField();
		campoIdade.setColumns(10);
		campoIdade.setBounds(67, 147, 152, 20);
		contentPane.add(campoIdade);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(254, 147, 126, 20);
		contentPane.add(dateChooser);
		
		
		JComboBox campoCargo = new JComboBox();
		campoCargo.setModel(new DefaultComboBoxModel(new String[] {"Gerente", "Funcionário"}));
		campoCargo.setBounds(67, 116, 145, 22);
		contentPane.add(campoCargo);
		
		JButton cadastra = new JButton("Cadastrar");
		cadastra.setBackground(Color.WHITE);
		cadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome_pessoa, data_cadastro_funcionario;
				int idade, codigo_cargo;
				conexao empresa = new conexao();
				
				nome_pessoa = campoNome.getText();
				idade = Integer.parseInt(campoIdade.getText());	
				if (campoCargo.getSelectedItem().equals("Gerente")) {
					codigo_cargo = 1;
				}
				else {
					codigo_cargo =2;
				}
			
				
				Funcionario g = new Funcionario();
				g.setNome_pessoa(nome_pessoa);
				g.setIdade(idade);
				g.setCodigo_cargo(codigo_cargo);
				g.setData_cadastro_funcionario(dateChooser.getDate());

	
				JdbcFuncionario gerente = new JdbcFuncionario(empresa.abrirconexao());
				gerente.inserirFuncionario(g);
				empresa.fechaconexao();

			}
		});
		cadastra.setBounds(76, 216, 89, 23);
		contentPane.add(cadastra);
		
		JButton cancela = new JButton("Cancelar");
		cancela.setBackground(Color.WHITE);
		cancela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				listaPessoas listar = new listaPessoas();
				listar.setVisible(true);
				dispose();
			}
		});
		cancela.setBounds(233, 216, 89, 23);
		contentPane.add(cancela);

		
	}
}
