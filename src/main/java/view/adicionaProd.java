package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adicionaProd extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnEditarCadastroDe;
	private JTextField textField_1;
	private JTextPane txtpnProduto;
	private JTextPane txtpnValor;
	private JTextField textField_2;
	private JTextPane txtpnQtd;
	private JSpinner spinner;
	private JButton btnNewButton;
	private JButton btnConcludo;
	private JTextField textField_4;
	private JTextPane txtpnData;
	private JTextField textField_5;
	private JTextPane txtpnId;
	private JTextPane textPane;
	private JTextPane txtpnMenu;
	private JButton btnNewButton_1;


	public adicionaProd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnEditarCadastroDe = new JTextPane();
		txtpnEditarCadastroDe.setText("Cadastro de novos Produtos");
		txtpnEditarCadastroDe.setForeground(Color.WHITE);
		txtpnEditarCadastroDe.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnEditarCadastroDe.setBackground(Color.DARK_GRAY);
		txtpnEditarCadastroDe.setBounds(114, 39, 219, 20);
		contentPane.add(txtpnEditarCadastroDe);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(80, 84, 154, 20);
		contentPane.add(textField_1);
		
		txtpnProduto = new JTextPane();
		txtpnProduto.setText("Produto");
		txtpnProduto.setForeground(Color.WHITE);
		txtpnProduto.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnProduto.setBackground(Color.DARK_GRAY);
		txtpnProduto.setBounds(24, 84, 89, 20);
		contentPane.add(txtpnProduto);
		
		txtpnValor = new JTextPane();
		txtpnValor.setText("Valor");
		txtpnValor.setForeground(Color.WHITE);
		txtpnValor.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnValor.setBackground(Color.DARK_GRAY);
		txtpnValor.setBounds(34, 125, 36, 20);
		contentPane.add(txtpnValor);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 125, 154, 20);
		contentPane.add(textField_2);
		
		txtpnQtd = new JTextPane();
		txtpnQtd.setText("Qtd");
		txtpnQtd.setForeground(Color.WHITE);
		txtpnQtd.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnQtd.setBackground(Color.DARK_GRAY);
		txtpnQtd.setBounds(44, 165, 26, 20);
		contentPane.add(txtpnQtd);
		
		spinner = new JSpinner();
		spinner.setBounds(80, 165, 54, 20);
		contentPane.add(spinner);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(63, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		btnConcludo = new JButton("Concluído");
		btnConcludo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnConcludo.setBackground(Color.WHITE);
		btnConcludo.setBounds(291, 214, 89, 23);
		contentPane.add(btnConcludo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(334, 125, 72, 20);
		contentPane.add(textField_4);
		
		txtpnData = new JTextPane();
		txtpnData.setText("Data do Cadastro");
		txtpnData.setForeground(Color.WHITE);
		txtpnData.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnData.setBackground(Color.DARK_GRAY);
		txtpnData.setBounds(240, 125, 93, 20);
		contentPane.add(txtpnData);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(334, 84, 72, 20);
		contentPane.add(textField_5);
		
		txtpnId = new JTextPane();
		txtpnId.setText("ID (automático)");
		txtpnId.setForeground(Color.WHITE);
		txtpnId.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnId.setBackground(Color.DARK_GRAY);
		txtpnId.setBounds(244, 84, 89, 20);
		contentPane.add(txtpnId);
		
		textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 257, 434, 4);
		contentPane.add(textPane);
		
		txtpnMenu = new JTextPane();
		txtpnMenu.setText("iPlace System");
		txtpnMenu.setForeground(Color.WHITE);
		txtpnMenu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		txtpnMenu.setBackground(new Color(153, 204, 0));
		txtpnMenu.setBounds(0, 0, 434, 28);
		contentPane.add(txtpnMenu);
		
		btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaProdutos listaPriod = new listaProdutos();
				listaPriod.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 9));
		btnNewButton_1.setBounds(15, 39, 43, 23);
		contentPane.add(btnNewButton_1);
	}
}
