package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Percistencia.JdbcFuncionario;
import Percistencia.conexao;
import iplaceModel.Funcionario;

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
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;

public class listaPessoas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable tbFuncionario;

	public listaPessoas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton adiciona = new JButton("Adicionar");
		adiciona.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		adiciona.setBackground(Color.WHITE);
		adiciona.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				adicionarPessoa gerente = new adicionarPessoa();
				gerente.setVisible(true);
				dispose();
			}
		});
		adiciona.setBounds(33, 215, 89, 23);
		contentPane.add(adiciona);
		
		JButton edita = new JButton("Editar");
		edita.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		edita.setBackground(Color.WHITE);
		edita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				editarAdmin editAdm = new editarAdmin();
				editAdm.setVisible(true);
				dispose();
				
			}
		});
		edita.setBounds(171, 215, 89, 23);
		contentPane.add(edita);
		
		JButton exclue = new JButton("Excluir");
		exclue.setBackground(Color.WHITE);
		exclue.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		exclue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//TODO
				excluir excluiPessoa = new excluir();
				excluiPessoa.setVisible(true);
				
			}
		});
		exclue.setBounds(312, 215, 89, 23);
		contentPane.add(exclue);
		
				
		JTextPane txtpnMenu = new JTextPane();
		txtpnMenu.setEnabled(false);
		txtpnMenu.setEditable(false);
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
		scrollPane.setBounds(10, 199, 414, -126);
		contentPane.add(scrollPane);
		
//		table.setBackground(Color.WHITE);
		
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
		
		JButton lista = new JButton("Listar");
		lista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				conexao empresa = new conexao();
				JdbcFuncionario atendente = new JdbcFuncionario(empresa.abrirconexao()); 	
			   ArrayList<Funcionario> funcionarios = atendente.listarFuncionario();
			   empresa.fechaconexao();
			   
			   //adiciona na tabela
			   
			   DefaultTableModel modelo = (DefaultTableModel)tbFuncionario.getModel();
			   modelo.setNumRows(0);		   
	   for (Funcionario a:funcionarios) {
		   modelo.addRow(new Object[] {
				   a.getCodigo_pessoa(),a.getNome_pessoa(), a.getIdade(), a.getData_cadastro_funcionario(), a.getCodigo_cargo()
		   });	   
			   } 			
				
			}
		});
		lista.setBounds(333, 53, 68, 20);
		contentPane.add(lista);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 9));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menuPrincipal voltarMain = new menuPrincipal();
				voltarMain.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 39, 46, 23);
		contentPane.add(btnNewButton);

	}
}
