package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;

public class telaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField nameProd;

	

	/**
	 * Create the frame.
	 */
	public telaVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameProd = new JTextField();
		nameProd.setBounds(165, 58, 86, 20);
		contentPane.add(nameProd);
		nameProd.setColumns(10);
		
		JDateChooser datProd = new JDateChooser();
		datProd.setDateFormatString("yyyy-MM-dd");
		datProd.setBounds(151, 137, 108, 20);
		contentPane.add(datProd);
		
		JSpinner qtdProd = new JSpinner();
		qtdProd.setBounds(192, 106, 30, 20);
		contentPane.add(qtdProd);
		
		JButton vender = new JButton("Adicionar Venda");
		vender.setBounds(45, 203, 115, 23);
		contentPane.add(vender);
		
		JButton btnCancelar = new JButton("Cancelar");
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
	}
}
