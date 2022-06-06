package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;

import Percistencia.JdbcProdutos;
import Percistencia.JdbcVenda;
import Percistencia.conexao;
import iplaceModel.Produto;
import iplaceModel.Venda;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JScrollPane;

public class relatorio extends JFrame {

	private JPanel contentPane;
	private JTextField totalVendaG;
	private JTable tbRt;

	//informa o produto mais vendido no periodo escolhido 
	//total de vendas no periodo escolhido 
	
	/**
	 * Create the frame.
	 */
	public relatorio(int cargo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDateChooser dateInicio = new JDateChooser();
		dateInicio.addKeyListener(new KeyAdapter() {
		});
		dateInicio.setBounds(83, 37, 108, 20);
		contentPane.add(dateInicio);
		
		JDateChooser dateFim = new JDateChooser();
		dateFim.setBounds(274, 37, 108, 20);
		contentPane.add(dateFim);
		
		JLabel deQuando = new JLabel("Até");
		deQuando.setForeground(Color.WHITE);
		deQuando.setBounds(227, 43, 23, 14);
		contentPane.add(deQuando);
		
		
		JLabel infdate = new JLabel("Insira a data");
		infdate.setForeground(Color.WHITE);
		infdate.setBounds(10, 37, 92, 14);
		contentPane.add(infdate);
		
		totalVendaG = new JTextField();
		totalVendaG.setBounds(296, 192, 86, 20);
		contentPane.add(totalVendaG);
		totalVendaG.setColumns(10);
		
		
		
		JButton geraRT = new JButton("Gerar");
		geraRT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbRt.setVisible(true);
				
				conexao empresa = new conexao();
				Date data_venda;
				
				
				
				JdbcVenda venda = new JdbcVenda(empresa.abrirconexao());

				int qtd = venda.buscaTotalQuantidade(dateInicio.getDate(), dateFim.getDate());
				String qtd_string = String.valueOf(qtd);
				totalVendaG.setText(qtd_string);
				
				ArrayList<Venda> vendas = venda.buscaTotalVenda(dateInicio.getDate(), dateFim.getDate());
				
				// adiciona na tabela

				DefaultTableModel modelo = (DefaultTableModel) tbRt.getModel();
				for (Venda a : vendas) {
					modelo.addRow(new Object[] { a.getId_produto(), a.nome_prod, a.getQuantidade_venda()});
				
					empresa.fechaconexao();
				}
			}
		});
		geraRT.setBounds(200, 220, 89, 23);
		contentPane.add(geraRT);
		
		JLabel lblNewLabel = new JLabel("Relatorio valor total");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(141, 11, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Total de produtos vendidos:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(126, 195, 160, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 68, 350, 113);
		contentPane.add(scrollPane);
		
		tbRt = new JTable();
		tbRt.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome Produto", "Quantidade vendida"
			}
		));
		tbRt.getColumnModel().getColumn(1).setPreferredWidth(102);
		tbRt.getColumnModel().getColumn(2).setPreferredWidth(131);
		scrollPane.setViewportView(tbRt);
		
		JButton btnVolta = new JButton("<");
		btnVolta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaProdutos voltar = new listaProdutos(cargo);
				voltar.setVisible(true);
				dispose();
			}
		});
		btnVolta.setBounds(21, 7, 47, 23);
		contentPane.add(btnVolta);
		
	}
}
