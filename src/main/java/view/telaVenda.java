package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import Percistencia.JdbcProdutos;
import Percistencia.JdbcVenda;
import Percistencia.conexao;
import iplaceModel.Produto;
import iplaceModel.Venda;

import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class telaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField txtnameProd;
	private JTextField txtIdProd;
	private JTextField valorProdutotxt;

	/**
	 * Create the frame.
	 */

	public telaVenda(String nomeProd, String idProd, int valor, int cargo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		txtnameProd = new JTextField();
		txtnameProd.setBackground(Color.WHITE);
		txtnameProd.setEnabled(false);
		txtnameProd.setEditable(false);
		txtnameProd.setBounds(165, 58, 86, 20);
		contentPane.add(txtnameProd);
		txtnameProd.setColumns(10);
		txtnameProd.setText(nomeProd);

		JDateChooser datProd = new JDateChooser();
		datProd.setDateFormatString("yyyy-MM-dd");
		datProd.setBounds(151, 137, 108, 20);
		contentPane.add(datProd);

		JSpinner qtdProd = new JSpinner();
		qtdProd.setBounds(192, 106, 30, 20);
		contentPane.add(qtdProd);

		txtIdProd = new JTextField();
		txtIdProd.setForeground(Color.DARK_GRAY);
		txtIdProd.setBackground(Color.WHITE);
		txtIdProd.setBounds(373, 58, 30, 20);
		contentPane.add(txtIdProd);
		txtIdProd.setColumns(10);
		txtIdProd.setText(idProd);
		
		
		valorProdutotxt = new JTextField();
		valorProdutotxt.setForeground(Color.DARK_GRAY);
		valorProdutotxt.setColumns(10);
		valorProdutotxt.setBackground(Color.WHITE);
		valorProdutotxt.setBounds(357, 95, 46, 20);
		valorProdutotxt.setText(Integer.toString(valor)); // Coloca o valor do produto pegando da tabela.
		contentPane.add(valorProdutotxt);
		
		JButton vender = new JButton("Adicionar Venda");
		vender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				conexao empresa = new conexao();
				Integer id_produto;
				Integer quantidade_venda;
				Date data_venda;

				id_produto = Integer.parseInt(txtIdProd.getText());
				quantidade_venda = (Integer) qtdProd.getValue();
				// data_venda= datProd.getDate();

				Venda a = new Venda();

				a.setId_produto(id_produto);
				a.setQuantidade_venda(quantidade_venda);
				a.setData_venda(datProd.getDate());

				JdbcVenda realizaVenda = new JdbcVenda(empresa.abrirconexao());
				realizaVenda.realizaVenda(a);

				Integer quantidade_produto,codigo_produto;
		
				quantidade_produto = (Integer) qtdProd.getValue();
				codigo_produto = Integer.parseInt(txtIdProd.getText());
				
				Produto d = new Produto();
				d.setQuantidade_produto(quantidade_produto);
				d.setCodigo_produto(codigo_produto);

				JdbcProdutos menos = new JdbcProdutos(empresa.abrirconexao());
				menos.diminuiQuantidade(d);

				empresa.fechaconexao();

			}
		});
		vender.setBounds(45, 203, 115, 23);
		contentPane.add(vender);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listaProdutos voltarListaProdvenda = new listaProdutos(cargo);
				voltarListaProdvenda.setVisible(true);
				dispose();
				
			}
		});
		btnCancelar.setBounds(261, 203, 89, 23);
		contentPane.add(btnCancelar);

		JLabel lblNewLabel = new JLabel("Carrinho de compra");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 167, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNomeDoProduto = new JLabel("Nome do produto selecionado");
		lblNomeDoProduto.setForeground(Color.WHITE);
		lblNomeDoProduto.setBounds(10, 61, 170, 14);
		contentPane.add(lblNomeDoProduto);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setBounds(10, 109, 128, 14);
		contentPane.add(lblQuantidade);

		JLabel lblDataDeVenda = new JLabel("Data da venda");
		lblDataDeVenda.setForeground(Color.WHITE);
		lblDataDeVenda.setBounds(10, 143, 115, 14);
		contentPane.add(lblDataDeVenda);
		
		JLabel valorlb = new JLabel("Valor do Produto");
		valorlb.setForeground(Color.WHITE);
		valorlb.setBounds(250, 98, 86, 14);
		contentPane.add(valorlb);
		
		JLabel idprodutolb = new JLabel("ID");
		idprodutolb.setForeground(Color.WHITE);
		idprodutolb.setBounds(277, 61, 51, 14);
		contentPane.add(idprodutolb);
		

		

	}
}
