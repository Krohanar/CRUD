package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Percistencia.JdbcFuncionario;
import Percistencia.JdbcProdutos;
import Percistencia.conexao;
import iplaceModel.Funcionario;
import iplaceModel.Produto;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editaProd extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnMenu;
	private JTextPane textPane;
	private JButton btnNewButton;
	private JButton btnConcludo;
	private JTextPane txtpnAlterarValor;
	private JTextPane txtpnAlterarProduto;
	private JTextPane txtpnId;
	private JTextField pegaIdProd;
	private JTextPane txtpnEditarCadastroDe_1;
	private JTextPane txtpnAlterarQtd;
	private JTextField nomeProduto;
	private JTextField valorProd;

	
// TEM QUE REALIZAR A ALTERACAO APENAS DA QUANTIDADE E VALOR // 	

	/**
	 * Create the frame.
	 */
	public editaProd(String nomeProd, String idProd,int cargo) {
		setTitle("Editar Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		txtpnMenu = new JTextPane();
		txtpnMenu.setEditable(false);
		txtpnMenu.setText("iPlace System");
		txtpnMenu.setForeground(Color.WHITE);
		txtpnMenu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		txtpnMenu.setBackground(new Color(153, 204, 0));
		txtpnMenu.setBounds(0, 0, 434, 28);
		contentPane.add(txtpnMenu);
		
		textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 257, 434, 4);
		contentPane.add(textPane);
		
		nomeProduto = new JTextField();
		nomeProduto.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 9));
		nomeProduto.setBounds(116, 84, 86, 20);
		contentPane.add(nomeProduto);
		nomeProduto.setColumns(10);
		nomeProduto.setText(nomeProd);
		
		pegaIdProd = new JTextField();
		pegaIdProd.setEnabled(false);
		pegaIdProd.setEditable(false);
		pegaIdProd.setColumns(10);
		pegaIdProd.setBackground(Color.LIGHT_GRAY);
		pegaIdProd.setBounds(334, 84, 16, 20);
		contentPane.add(pegaIdProd);
		pegaIdProd.setText(idProd);
		
		JSpinner qtdProd = new JSpinner();
		qtdProd.setBounds(113, 165, 54, 20);
		contentPane.add(qtdProd);	
		
		valorProd = new JTextField();
		valorProd.setBounds(116, 125, 86, 20);
		contentPane.add(valorProd);
		valorProd.setColumns(10);
		
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaProdutos voltarListaProdEdit = new listaProdutos(cargo);
				voltarListaProdEdit.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(63, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		btnConcludo = new JButton("Concluído");
		btnConcludo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int quantidade_produto, valor_produto,codigo_produto;
				
				conexao empresa = new conexao();
	
 			    quantidade_produto =(Integer) qtdProd.getValue();
				valor_produto = Integer.parseInt(valorProd.getText());
				codigo_produto = Integer.parseInt(pegaIdProd.getText());

				Produto a = new Produto();	
			    a.setQuantidade_produto(quantidade_produto);
			    a.setValor_produto(valor_produto);
			    a.setCodigo_produto(codigo_produto);

				JdbcProdutos alteraProduto = new JdbcProdutos(empresa.abrirconexao());
				alteraProduto.alteraProduto(a);
				empresa.fechaconexao();
			
			listaProdutos ListaProdReturn = new listaProdutos(cargo);
			ListaProdReturn.setVisible(true);
				dispose();
				
			}
		});
		btnConcludo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnConcludo.setBackground(Color.WHITE);
		btnConcludo.setBounds(291, 214, 89, 23);
		contentPane.add(btnConcludo);
		
		txtpnAlterarValor = new JTextPane();
		txtpnAlterarValor.setText("Alterar Valor");
		txtpnAlterarValor.setForeground(Color.WHITE);
		txtpnAlterarValor.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarValor.setBackground(Color.DARK_GRAY);
		txtpnAlterarValor.setBounds(34, 125, 79, 20);
		contentPane.add(txtpnAlterarValor);
		
		txtpnAlterarProduto = new JTextPane();
		txtpnAlterarProduto.setText("Alterar Produto");
		txtpnAlterarProduto.setForeground(Color.WHITE);
		txtpnAlterarProduto.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarProduto.setBackground(Color.DARK_GRAY);
		txtpnAlterarProduto.setBounds(24, 84, 89, 20);
		contentPane.add(txtpnAlterarProduto);
		
		txtpnId = new JTextPane();
		txtpnId.setText("ID (automático)");
		txtpnId.setForeground(Color.WHITE);
		txtpnId.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnId.setBackground(Color.DARK_GRAY);
		txtpnId.setBounds(244, 84, 89, 20);
		contentPane.add(txtpnId);
				
		txtpnEditarCadastroDe_1 = new JTextPane();
		txtpnEditarCadastroDe_1.setText("Editar Cadastro de Produto");
		txtpnEditarCadastroDe_1.setForeground(Color.WHITE);
		txtpnEditarCadastroDe_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnEditarCadastroDe_1.setBackground(Color.DARK_GRAY);
		txtpnEditarCadastroDe_1.setBounds(114, 39, 201, 20);
		contentPane.add(txtpnEditarCadastroDe_1);
		
		txtpnAlterarQtd = new JTextPane();
		txtpnAlterarQtd.setText("Alterar Qtd");
		txtpnAlterarQtd.setForeground(Color.WHITE);
		txtpnAlterarQtd.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnAlterarQtd.setBackground(Color.DARK_GRAY);
		txtpnAlterarQtd.setBounds(44, 165, 69, 20);
		contentPane.add(txtpnAlterarQtd);

	}
}
