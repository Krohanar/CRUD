package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Percistencia.JdbcFuncionario;
import Percistencia.JdbcProdutos;
import Percistencia.conexao;
import iplaceModel.Funcionario;
import iplaceModel.Produto;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
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
	private JTable tbProdutos;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JTextPane txtpnMenu;
	private JButton btnVendaProd;

	public listaProdutos(int cargo) {
		setTitle("Lista de Produtos");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 445, 301);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 78, 394, 126);
		contentPane.add(scrollPane);

		tbProdutos = new JTable();
		tbProdutos.setBackground(new Color(255, 255, 255));
		tbProdutos.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Nome", "Valor", "Qtd" }));
		scrollPane.setViewportView(tbProdutos);

		JButton adicionarBtn = new JButton("Adicionar");
		adicionarBtn.setEnabled(false);
		adicionarBtn.setBackground(Color.WHITE);
		adicionarBtn.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));

		if (cargo == 1) {
			adicionarBtn.setEnabled(true);
		}
		adicionarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaProd adc = new adicionaProd(cargo);
				adc.setVisible(true);
				dispose();

			}
		});
		adicionarBtn.setBounds(20, 215, 89, 23);
		contentPane.add(adicionarBtn);

		JButton editBtn = new JButton("Editar");
		editBtn.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		editBtn.setBackground(Color.WHITE);
		if (cargo == 1) {
			editBtn.setEnabled(true);
		} else {
			editBtn.setEnabled(false);
		}
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				editaProd editarProd = new editaProd(cargo);
				editarProd.setVisible(true);

				dispose();

			}
		});
		editBtn.setBounds(119, 215, 89, 23);
		contentPane.add(editBtn);

		JButton btnExcluirProd = new JButton("Excluir");
		
		
		btnExcluirProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pegarDadosProd pgp = new pegarDadosProd();
				String nomeProd= pgp.getNomeProd();
				String valorProd= pgp.getValorProd();
				String quantidadeProd=pgp.getQuantidadeProd();
				
//				excluir excluiProd = new excluir(cargo);
//				excluiProd.setVisible(true);
//				int controle = 1;
				dispose();
				
			

			}
		});
		btnExcluirProd.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnExcluirProd.setBackground(Color.WHITE);
		btnExcluirProd.setBounds(218, 215, 89, 23);
		contentPane.add(btnExcluirProd);

		textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 257, 434, 4);
		contentPane.add(textPane);

		textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(153, 204, 0));
		textPane_1.setBounds(0, 253, 435, 4);
		contentPane.add(textPane_1);

		txtpnMenu = new JTextPane();
		txtpnMenu.setEditable(false);
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

		JButton brnVoltarMainMenu = new JButton("<");
		brnVoltarMainMenu.setBackground(Color.WHITE);
		brnVoltarMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuPrincipal voltarMainMenu = new menuPrincipal(cargo);
				voltarMainMenu.setVisible(true);

				dispose();
			}
		});
		brnVoltarMainMenu.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 10));
		brnVoltarMainMenu.setBounds(29, 39, 48, 23);
		contentPane.add(brnVoltarMainMenu);

		btnVendaProd = new JButton("Venda");
		btnVendaProd.setBackground(Color.WHITE);
		btnVendaProd.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnVendaProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnVendaProd.setBounds(317, 215, 89, 23);
		contentPane.add(btnVendaProd);

		JButton atualizarbtn = new JButton("At");
		atualizarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				conexao empresa = new conexao();
				JdbcProdutos produto = new JdbcProdutos(empresa.abrirconexao());
				ArrayList<Produto> produtos = produto.listarProdutos();
				empresa.fechaconexao();

				// adiciona na tabela

				DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
				modelo.setNumRows(0);
				for (Produto a : produtos) {
					modelo.addRow(new Object[] { a.getCodigo_produto(), a.getNome_produto(), a.getValor_produto(),
							a.getQuantidade_produto() });
				}

			}
		});
		atualizarbtn.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		atualizarbtn.setBackground(Color.WHITE);
		atualizarbtn.setBounds(95, 40, 57, 23);
		contentPane.add(atualizarbtn);

	}
	
	public class pegarDadosProd {

		int setarProd = tbProdutos.getSelectedRow();
		String nomeProd = tbProdutos.getModel().getValueAt(setarProd, 0).toString();
		String valorProd = tbProdutos.getModel().getValueAt(setarProd, 2).toString();
		String quantidadeProd = tbProdutos.getModel().getValueAt(setarProd, 3).toString();

		public String getNomeProd() {
			return nomeProd;
		}

		public void setNomeProd(String nomeProd) {
			this.nomeProd = nomeProd;
		}

		public String getValorProd() {
			return valorProd;
		}

		public void setValorProd(String valorProd) {
			this.valorProd = valorProd;
		}

		public String getQuantidadeProd() {
			return quantidadeProd;
		}

		public void setQuantidadeProd(String quantidadeProd) {
			this.quantidadeProd = quantidadeProd;
		}

	}

}


