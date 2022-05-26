package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class listaProdutos extends JFrame {

	private static final long serialVersionUID = 674403030270187068L;
	private JPanel contentPane;
	private JTextField txtBuscar;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JTextPane txtpnMenu;
	
	public listaProdutos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 451, 295);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 78, 394, 126);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Data Cadastro", "Valor", "Qtd"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton adicionarBtn = new JButton("Adicionar");
		adicionarBtn.setBackground(Color.WHITE);
		adicionarBtn.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		adicionarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaProd adc = new adicionaProd();
				adc.setVisible(true);
				
				dispose();
			}
		});
		adicionarBtn.setBounds(20, 215, 89, 23);
		contentPane.add(adicionarBtn);
		
		JButton editBtn = new JButton("Editar");
		editBtn.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		editBtn.setBackground(Color.WHITE);
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				editaProd editaP = new editaProd();
				editaP.setVisible(true);
				
				dispose();
				
			}
		});
		editBtn.setBounds(174, 215, 89, 23);
		contentPane.add(editBtn);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(325, 215, 89, 23);
		contentPane.add(btnNewButton_2);
		
		textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 257, 434, 4);
		contentPane.add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(153, 204, 0));
		textPane_1.setBounds(0, 253, 435, 4);
		contentPane.add(textPane_1);
		
		txtpnMenu = new JTextPane();
		txtpnMenu.setText("iPlace System");
		txtpnMenu.setForeground(Color.WHITE);
		txtpnMenu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		txtpnMenu.setBackground(new Color(153, 204, 0));
		txtpnMenu.setBounds(0, 0, 435, 28);
		contentPane.add(txtpnMenu);
		
		JTextPane txtpnProdutos = new JTextPane();
		txtpnProdutos.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnProdutos.setForeground(Color.WHITE);
		txtpnProdutos.setBackground(Color.DARK_GRAY);
		txtpnProdutos.setText("Produtos");
		txtpnProdutos.setBounds(174, 39, 80, 20);
		contentPane.add(txtpnProdutos);
		
		JButton btnNewButton = new JButton("Relatório");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBounds(325, 44, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuPrincipal mainMenu = new menuPrincipal();
				mainMenu.setVisible(true);
				
				dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 10));
		btnNewButton_1.setBounds(20, 36, 39, 23);
		contentPane.add(btnNewButton_1);

	}
}
