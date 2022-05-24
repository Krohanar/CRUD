package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;

public class adicionarPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	public adicionarPessoa() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(67, 85, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(67, 126, 152, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(333, 85, 72, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBounds(290, 215, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(62, 215, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(333, 126, 72, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setBackground(Color.DARK_GRAY);
		txtpnNome.setForeground(Color.WHITE);
		txtpnNome.setText("Nome");
		txtpnNome.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnNome.setBounds(30, 85, 36, 20);
		contentPane.add(txtpnNome);
		
		JTextPane txtpnCadastroDeNovos = new JTextPane();
		txtpnCadastroDeNovos.setText("Cadastro de novos funcionários");
		txtpnCadastroDeNovos.setForeground(Color.WHITE);
		txtpnCadastroDeNovos.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnCadastroDeNovos.setBackground(Color.DARK_GRAY);
		txtpnCadastroDeNovos.setBounds(101, 39, 246, 20);
		contentPane.add(txtpnCadastroDeNovos);
		
		JTextPane txtpnData = new JTextPane();
		txtpnData.setText("Data do Cadastro");
		txtpnData.setForeground(Color.WHITE);
		txtpnData.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnData.setBackground(Color.DARK_GRAY);
		txtpnData.setBounds(229, 126, 93, 20);
		contentPane.add(txtpnData);
		
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
		
		JTextPane txtpnCargo = new JTextPane();
		txtpnCargo.setText("Cargo");
		txtpnCargo.setForeground(Color.WHITE);
		txtpnCargo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnCargo.setBackground(Color.DARK_GRAY);
		txtpnCargo.setBounds(30, 126, 36, 20);
		contentPane.add(txtpnCargo);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setText("ID (automático)");
		txtpnId.setForeground(Color.WHITE);
		txtpnId.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnId.setBackground(Color.DARK_GRAY);
		txtpnId.setBounds(243, 85, 89, 20);
		contentPane.add(txtpnId);
		
		textField_4 = new JTextField();
		textField_4.setText("<");
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setBounds(29, 39, 20, 20);
		contentPane.add(textField_4);
		
		JTextPane txtpnDefinirSenha = new JTextPane();
		txtpnDefinirSenha.setText("Definir Senha");
		txtpnDefinirSenha.setForeground(Color.WHITE);
		txtpnDefinirSenha.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnDefinirSenha.setBackground(Color.DARK_GRAY);
		txtpnDefinirSenha.setBounds(90, 171, 81, 20);
		contentPane.add(txtpnDefinirSenha);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(170, 171, 144, 20);
		contentPane.add(textField_5);
	}
}
