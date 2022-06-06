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

public class relatorio extends JFrame {

	private JPanel contentPane;
	private JTextField totalVendaG;
	private JTable tbRt;

	//informa o produto mais vendido no periodo escolhido 
	//total de vendas no periodo escolhido 
	
	/**
	 * Create the frame.
	 */
	public relatorio() {
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
		dateInicio.setBounds(36, 62, 108, 20);
		contentPane.add(dateInicio);
		
		JDateChooser dateFim = new JDateChooser();
		dateFim.setBounds(274, 62, 108, 20);
		contentPane.add(dateFim);
		
		JLabel deQuando = new JLabel("Até");
		deQuando.setForeground(Color.WHITE);
		deQuando.setBounds(187, 68, 46, 14);
		contentPane.add(deQuando);
		
		tbRt = new JTable();
		tbRt.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", null},
			},
			new String[] {
				"NomeProd.:", "Qtd.Prod.:", "DataInicio.:", "DataFim.:"
			}
		));
		tbRt.setBounds(25, 127, 266, 14);
		contentPane.add(tbRt);
		
		
		JLabel infdate = new JLabel("Insira a data");
		infdate.setForeground(Color.WHITE);
		infdate.setBounds(10, 37, 92, 14);
		contentPane.add(infdate);
		
		totalVendaG = new JTextField();
		totalVendaG.setBounds(50, 183, 86, 20);
		contentPane.add(totalVendaG);
		totalVendaG.setColumns(10);
		
		
		
		JButton geraRT = new JButton("Gerar");
		geraRT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				conexao empresa = new conexao();
				Date data_venda;
				
				
				JdbcVenda venda = new JdbcVenda(empresa.abrirconexao());
				ArrayList<Venda> vendas = venda.buscaTotalVenda();

				// adiciona na tabela

				DefaultTableModel modelo = (DefaultTableModel) tbRt.getModel();
				modelo.setNumRows(0);
				for (Venda a : vendas) {
					modelo.addRow(new Object[] { a.getId_produto(), a.getQuantidade_venda(), dateInicio.getData_venda(), dateFim.getData_venda()});
				
					empresa.fechaconexao();
				}
			}
		});
		geraRT.setBounds(173, 227, 89, 23);
		contentPane.add(geraRT);
		
		JLabel lblNewLabel = new JLabel("Relatorio valor total");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(136, 11, 215, 14);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Produto mais vendido:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(36, 114, 137, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total de produtos vendidos:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(36, 162, 160, 14);
		contentPane.add(lblNewLabel_2);
		
	}
}
