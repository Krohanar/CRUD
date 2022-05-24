package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;
import java.awt.Toolkit;

public class listaPessoas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	public listaPessoas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bntAdd = new JButton("Adicionar");
		bntAdd.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		bntAdd.setBackground(Color.DARK_GRAY);
		bntAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				adicionarPessoa addP = new adicionarPessoa();
				addP.setVisible(true);
				
			}
		});
		bntAdd.setBounds(33, 215, 89, 23);
		contentPane.add(bntAdd);
		
		JButton bntEdit = new JButton("Editar");
		bntEdit.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		bntEdit.setBackground(Color.DARK_GRAY);
		bntEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				editarAdmin editAdm = new editarAdmin();
				editAdm.setVisible(true);
				
			}
		});
		bntEdit.setBounds(171, 215, 89, 23);
		contentPane.add(bntEdit);
		
		JButton bntDelete = new JButton("Excluir");
		bntDelete.setBackground(Color.DARK_GRAY);
		bntDelete.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		bntDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//TODO
				excluir excluiPessoa = new excluir();
				excluiPessoa.setVisible(true);
				
			}
		});
		bntDelete.setBounds(312, 215, 89, 23);
		contentPane.add(bntDelete);
		
				
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 199, 321, -114);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(33, 78, 368, 126);
		contentPane.add(scrollPane_1);
		
		
		
		table.setBackground(Color.WHITE);
		scrollPane_1.setColumnHeaderView(table);
		
		textField = new JTextField();
		textField.setText("<");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(33, 39, 20, 20);
		contentPane.add(textField);
		
		JTextPane txtpnFuncionrios = new JTextPane();
		txtpnFuncionrios.setText("Funcionários");
		txtpnFuncionrios.setForeground(Color.WHITE);
		txtpnFuncionrios.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnFuncionrios.setBackground(Color.DARK_GRAY);
		txtpnFuncionrios.setBounds(160, 39, 100, 20);
		contentPane.add(txtpnFuncionrios);
	}
}
