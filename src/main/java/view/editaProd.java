package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editaProd extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnMenu;
	private JTextPane textPane;
	private JButton btnNewButton;
	private JButton btnConcludo;
	private JTextPane txtpnAlterarValor;
	private JTextPane txtpnAlterarProduto;
	private JTextPane txtpnData;
	private JTextPane txtpnId;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextPane txtpnEditarCadastroDe_1;
	private JTextPane txtpnAlterarQtd;
	private JTextField textField_6;
	private JTextPane txtpnDataAtualizao;
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Create the frame.
	 */
	public editaProd(int cargo) {
		setTitle("Editar Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		txtpnMenu = new JTextPane();
		txtpnMenu.setEditable(false);
		txtpnMenu.setText("iPlace System");
		txtpnMenu.setForeground(Color.WHITE);
		txtpnMenu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		txtpnMenu.setBackground(new Color(153, 204, 0));
		txtpnMenu.setBounds(0, 0, 434, 28);
		contentPane.add(txtpnMenu);
		
		textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 257, 434, 4);
		contentPane.add(textPane);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaProdutos voltarListaProdEdit = new listaProdutos(cargo);
				voltarListaProdEdit.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(63, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		btnConcludo = new JButton("Concluído");
		btnConcludo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnConcludo.setBackground(Color.WHITE);
		btnConcludo.setBounds(291, 214, 89, 23);
		contentPane.add(btnConcludo);
		
		txtpnAlterarValor = new JTextPane();
		txtpnAlterarValor.setText("Alterar Valor");
		txtpnAlterarValor.setForeground(Color.WHITE);
		txtpnAlterarValor.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarValor.setBackground(Color.DARK_GRAY);
		txtpnAlterarValor.setBounds(34, 125, 79, 20);
		contentPane.add(txtpnAlterarValor);
		
		txtpnAlterarProduto = new JTextPane();
		txtpnAlterarProduto.setText("Alterar Produto");
		txtpnAlterarProduto.setForeground(Color.WHITE);
		txtpnAlterarProduto.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarProduto.setBackground(Color.DARK_GRAY);
		txtpnAlterarProduto.setBounds(24, 84, 89, 20);
		contentPane.add(txtpnAlterarProduto);
		
		txtpnData = new JTextPane();
		txtpnData.setText("Data do Cadastro");
		txtpnData.setForeground(Color.WHITE);
		txtpnData.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnData.setBackground(Color.DARK_GRAY);
		txtpnData.setBounds(240, 125, 93, 20);
		contentPane.add(txtpnData);
		
		txtpnId = new JTextPane();
		txtpnId.setText("ID (automático)");
		txtpnId.setForeground(Color.WHITE);
		txtpnId.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnId.setBackground(Color.DARK_GRAY);
		txtpnId.setBounds(244, 84, 89, 20);
		contentPane.add(txtpnId);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(334, 125, 72, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(334, 84, 72, 20);
		contentPane.add(textField_4);
		
		txtpnEditarCadastroDe_1 = new JTextPane();
		txtpnEditarCadastroDe_1.setText("Editar Cadastro de Produto");
		txtpnEditarCadastroDe_1.setForeground(Color.WHITE);
		txtpnEditarCadastroDe_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnEditarCadastroDe_1.setBackground(Color.DARK_GRAY);
		txtpnEditarCadastroDe_1.setBounds(114, 39, 201, 20);
		contentPane.add(txtpnEditarCadastroDe_1);
		
		txtpnAlterarQtd = new JTextPane();
		txtpnAlterarQtd.setText("Alterar Qtd");
		txtpnAlterarQtd.setForeground(Color.WHITE);
		txtpnAlterarQtd.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarQtd.setBackground(Color.DARK_GRAY);
		txtpnAlterarQtd.setBounds(44, 165, 69, 20);
		contentPane.add(txtpnAlterarQtd);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(334, 165, 72, 20);
		contentPane.add(textField_6);
		
		txtpnDataAtualizao = new JTextPane();
		txtpnDataAtualizao.setText("Data Atualização");
		txtpnDataAtualizao.setForeground(Color.WHITE);
		txtpnDataAtualizao.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnDataAtualizao.setBackground(Color.DARK_GRAY);
		txtpnDataAtualizao.setBounds(240, 165, 93, 20);
		contentPane.add(txtpnDataAtualizao);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(113, 165, 54, 20);
		contentPane.add(spinner);
		
		textField = new JTextField();
		textField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 9));
		textField.setBounds(116, 84, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 125, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
