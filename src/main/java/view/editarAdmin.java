package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;

public class editarAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	public editarAdmin() {
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
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(102, 84, 132, 20);
		contentPane.add(textField_1);
		
		JTextPane txtpnData = new JTextPane();
		txtpnData.setText("Data do Cadastro");
		txtpnData.setForeground(Color.WHITE);
		txtpnData.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnData.setBackground(Color.DARK_GRAY);
		txtpnData.setBounds(244, 125, 93, 20);
		contentPane.add(txtpnData);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(334, 84, 72, 20);
		contentPane.add(textField_2);
		
		JTextPane txtpnAlterarCargo = new JTextPane();
		txtpnAlterarCargo.setText("Alterar Cargo");
		txtpnAlterarCargo.setForeground(Color.WHITE);
		txtpnAlterarCargo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarCargo.setBackground(Color.DARK_GRAY);
		txtpnAlterarCargo.setBounds(24, 125, 79, 20);
		contentPane.add(txtpnAlterarCargo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 125, 132, 20);
		contentPane.add(textField_3);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setText("ID (automático)");
		txtpnId.setForeground(Color.WHITE);
		txtpnId.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnId.setBackground(Color.DARK_GRAY);
		txtpnId.setBounds(248, 84, 89, 20);
		contentPane.add(txtpnId);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(334, 125, 72, 20);
		contentPane.add(textField_4);
		
		JTextPane txtpnRedefinirSenha = new JTextPane();
		txtpnRedefinirSenha.setText("Redefinir Senha");
		txtpnRedefinirSenha.setForeground(Color.WHITE);
		txtpnRedefinirSenha.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnRedefinirSenha.setBackground(Color.DARK_GRAY);
		txtpnRedefinirSenha.setBounds(91, 170, 93, 20);
		contentPane.add(txtpnRedefinirSenha);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(172, 170, 143, 20);
		contentPane.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(63, 214, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnConcludo = new JButton("Concluído");
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
