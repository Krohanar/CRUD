package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Percistencia.JdbcProdutos;
import Percistencia.conexao;
import iplaceModel.Produto;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class excluirProd extends JFrame {

	private JPanel contentPane;
	private JTextField nomeProduto;

	/**
	 * Create the frame.
	 */
	public excluirProd(String nomeProd, String idProd, int cargo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Deseja realmente excluir o produto abaixo?");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(45, 70, 312, 14);
		contentPane.add(lblNewLabel);
		
		nomeProduto = new JTextField();
		nomeProduto.setBounds(104, 126, 194, 23);
		contentPane.add(nomeProduto);
		nomeProduto.setColumns(10);
		nomeProduto.setText(nomeProd);
		
		JButton btnSim = new JButton("Sim");
		btnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                String nome_produto;
				
				conexao empresa = new conexao();
				
				nome_produto = nomeProduto.getText();
				
				Produto g = new Produto();	
				g.setNome_produto(nome_produto);
				
				JdbcProdutos apagarProd = new JdbcProdutos(empresa.abrirconexao());
				apagarProd.apagarProd(g);
				empresa.fechaconexao();
				
				listaProdutos excluirVoltar = new listaProdutos(cargo);
		        excluirVoltar.setVisible(true);
		        dispose();

			}
		});
		btnSim.setBounds(57, 210, 89, 23);
		contentPane.add(btnSim);
		
		JButton btnNao = new JButton("Nao");
		btnNao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listaProdutos excluirVoltar = new listaProdutos(cargo);
		        excluirVoltar.setVisible(true);
		        dispose();
			}
		});
		btnNao.setBounds(252, 210, 89, 23);
		contentPane.add(btnNao);
	}
}
