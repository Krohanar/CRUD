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
	private JTextField textField;
	private JTextField nometxt;
	private JTextField idtxt;
	private JTextField datacadtxt;
	private JTextField senhatxt;


	public editarAdmin(String id, String cadastro, String nome) {
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("<");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(30, 38, 20, 20);
		contentPane.add(textField);
		
		JTextPane txtpnEditarCadastroDe = new JTextPane();
		txtpnEditarCadastroDe.setText("Editar Cadastro de Funcionário");
		txtpnEditarCadastroDe.setForeground(Color.WHITE);
		txtpnEditarCadastroDe.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnEditarCadastroDe.setBackground(Color.DARK_GRAY);
		txtpnEditarCadastroDe.setBounds(102, 38, 246, 20);
		contentPane.add(txtpnEditarCadastroDe);
		
		JTextPane txtpnAlterarNome = new JTextPane();
		txtpnAlterarNome.setText("Alterar Nome");
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
		
		JTextPane txtpnData = new JTextPane();
		txtpnData.setText("Data do Cadastro");
		txtpnData.setForeground(Color.WHITE);
		txtpnData.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnData.setBackground(Color.DARK_GRAY);
		txtpnData.setBounds(244, 125, 93, 20);
		contentPane.add(txtpnData);
		
		idtxt = new JTextField();
		idtxt.setEditable(false);
		idtxt.setColumns(10);
		idtxt.setBackground(Color.LIGHT_GRAY);
		idtxt.setBounds(334, 84, 72, 20);
		contentPane.add(idtxt);
		
		JTextPane txtpnAlterarCargo = new JTextPane();
		txtpnAlterarCargo.setText("Alterar Cargo");
		txtpnAlterarCargo.setForeground(Color.WHITE);
		txtpnAlterarCargo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarCargo.setBackground(Color.DARK_GRAY);
		txtpnAlterarCargo.setBounds(24, 125, 79, 20);
		contentPane.add(txtpnAlterarCargo);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setText("ID (automático)");
		txtpnId.setForeground(Color.WHITE);
		txtpnId.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnId.setBackground(Color.DARK_GRAY);
		txtpnId.setBounds(248, 84, 89, 20);
		contentPane.add(txtpnId);
		
		datacadtxt = new JTextField();
		datacadtxt.setEditable(false);
		datacadtxt.setColumns(10);
		datacadtxt.setBackground(Color.LIGHT_GRAY);
		datacadtxt.setBounds(334, 125, 72, 20);
		contentPane.add(datacadtxt);
		
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
				
				listaPessoas lp = new listaPessoas();
				lp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(63, 214, 89, 23);
		
		
		JComboBox cargocb = new JComboBox();
		cargocb.setModel(new DefaultComboBoxModel(new String[] {"Gerente", "Funcionário"}));
		cargocb.setBounds(102, 123, 132, 22);
		contentPane.add(cargocb);
		
		nometxt.setText(nome);
		idtxt.setText(id);
		datacadtxt.setText(cadastro);
		
		contentPane.add(btnNewButton_1);
		
		JButton btnConcludo = new JButton("Concluído");
		btnConcludo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conexao empresa = new conexao();
	
			
				
				Funcionario g = new Funcionario();
				g.setCodigo_pessoa(Integer.parseInt(idtxt.getText()));
				
				if (cargocb.getSelectedItem().equals("Gerente")) {
					g.setCodigo_cargo(1);
				}
				else {
					g.setCodigo_cargo(2);
					}
				
				
				
				JdbcFuncionario definircargo = new JdbcFuncionario(empresa.abrirconexao());
				
				definircargo.alteraCargoFuncionario(g);

				empresa.fechaconexao();
			}
		});
		btnConcludo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnConcludo.setBackground(Color.DARK_GRAY);
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
