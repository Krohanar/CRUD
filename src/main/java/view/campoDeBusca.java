package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class campoDeBusca extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public campoDeBusca() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 297);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 78, 394, 126);
		contentPane.add(scrollPane);
		
		JTextPane txtpnProdutos = new JTextPane();
		txtpnProdutos.setText("Selecione o período:");
		txtpnProdutos.setForeground(Color.WHITE);
		txtpnProdutos.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		txtpnProdutos.setBackground(Color.DARK_GRAY);
		txtpnProdutos.setBounds(91, 44, 111, 20);
		contentPane.add(txtpnProdutos);
		
		textField = new JTextField();
		textField.setText("<");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(22, 44, 20, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Gerar relatório");
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(311, 44, 105, 20);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnMenu = new JTextPane();
		txtpnMenu.setText("iPlace System");
		txtpnMenu.setForeground(Color.WHITE);
		txtpnMenu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		txtpnMenu.setBackground(new Color(153, 204, 0));
		txtpnMenu.setBounds(0, 0, 435, 28);
		contentPane.add(txtpnMenu);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(153, 204, 0));
		textPane_1.setBounds(0, 254, 435, 4);
		contentPane.add(textPane_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 44, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Imprimir");
		btnNewButton_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(327, 215, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
