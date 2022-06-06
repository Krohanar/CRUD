package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Percistencia.JdbcFuncionario;
import Percistencia.conexao;
import iplaceModel.Funcionario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class editarAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField nometxt;
	private JTextField senhatxt;
	private JTextField pegaId;


	public editarAdmin(String id, String cadastro, String nome, int cargo) {
		setTitle("Editar cadastro do funcionario");
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JTextPane txtpnEditarCadastroDe = new JTextPane();
		txtpnEditarCadastroDe.setText("Editar Cadastro de Funcionário");
		txtpnEditarCadastroDe.setForeground(Color.WHITE);
		txtpnEditarCadastroDe.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnEditarCadastroDe.setBackground(Color.DARK_GRAY);
		txtpnEditarCadastroDe.setBounds(102, 38, 246, 20);
		contentPane.add(txtpnEditarCadastroDe);
		
		JTextPane txtpnAlterarNome = new JTextPane();
		txtpnAlterarNome.setText("Nome");
		txtpnAlterarNome.setForeground(Color.WHITE);
		txtpnAlterarNome.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarNome.setBackground(Color.DARK_GRAY);
		txtpnAlterarNome.setBounds(24, 84, 79, 20);
		contentPane.add(txtpnAlterarNome);
		
		nometxt = new JTextField();
		nometxt.setEditable(false);
		nometxt.setToolTipText("");
		nometxt.setColumns(10);
		nometxt.setBounds(102, 84, 132, 20);
		contentPane.add(nometxt);
		
		JTextPane txtpnAlterarCargo = new JTextPane();
		txtpnAlterarCargo.setText("Alterar Cargo");
		txtpnAlterarCargo.setForeground(Color.WHITE);
		txtpnAlterarCargo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarCargo.setBackground(Color.DARK_GRAY);
		txtpnAlterarCargo.setBounds(24, 125, 79, 20);
		contentPane.add(txtpnAlterarCargo);
		
		JTextPane txtpnRedefinirSenha = new JTextPane();
		txtpnRedefinirSenha.setText("Redefinir Senha");
		txtpnRedefinirSenha.setForeground(Color.WHITE);
		txtpnRedefinirSenha.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnRedefinirSenha.setBackground(Color.DARK_GRAY);
		txtpnRedefinirSenha.setBounds(91, 170, 93, 20);
		contentPane.add(txtpnRedefinirSenha);
		
		senhatxt = new JTextField();
		senhatxt.setColumns(10);
		senhatxt.setBounds(172, 170, 143, 20);
		contentPane.add(senhatxt);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listaPessoas lp = new listaPessoas(cargo);
				lp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(63, 214, 89, 23);
		
		
		JComboBox cargocb = new JComboBox();
		cargocb.setModel(new DefaultComboBoxModel(new String[] {"Gerente", "Funcionário"}));
		cargocb.setBounds(102, 123, 132, 22);
		contentPane.add(cargocb);
		
		nometxt.setText(nome);
		

		pegaId = new JTextField();
		pegaId.setBackground(Color.LIGHT_GRAY);
		pegaId.setEditable(false);
		pegaId.setEnabled(false);
		pegaId.setBounds(244, 84, 0, 0);
		contentPane.add(pegaId);
		pegaId.setColumns(10);
		
		pegaId.setText(id);
		
		
		contentPane.add(btnNewButton_1);
		
		JButton btnConcludo = new JButton("Concluído");
		btnConcludo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int codigo_cargo,codigo_pessoa;
				String senha;
				conexao empresa = new conexao();
				
//				id = pegaId.getText();
				if (cargocb.getSelectedItem().equals("Gerente")) {
					codigo_cargo = 1;
				}
				else {
					codigo_cargo = 2;
					}
				senha = senhatxt.getText();
				codigo_pessoa = Integer.parseInt(pegaId.getText());
				
				Funcionario g = new Funcionario();	
			    g.setCodigo_pessoa(codigo_pessoa);
			    g.setCodigo_cargo(codigo_cargo);
			    g.setSenha(senha);

				JdbcFuncionario alteraCargoFuncionario = new JdbcFuncionario(empresa.abrirconexao());
				alteraCargoFuncionario.alteraCargoFuncionario(g);
				empresa.fechaconexao();
				
			}
		});
		btnConcludo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnConcludo.setBackground(Color.WHITE);
		btnConcludo.setBounds(291, 214, 89, 23);
		contentPane.add(btnConcludo);
		
		JTextPane txtpnMenu = new JTextPane();
		txtpnMenu.setText("iPlace System");
		txtpnMenu.setForeground(Color.WHITE);
		txtpnMenu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		txtpnMenu.setBackground(new Color(153, 204, 0));
		txtpnMenu.setBounds(0, 0, 434, 28);
		contentPane.add(txtpnMenu);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 257, 434, 4);
		contentPane.add(textPane);


	}
}
