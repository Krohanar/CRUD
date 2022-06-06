package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.format.datetime.DateFormatter;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

import Percistencia.JdbcFuncionario;
import Percistencia.JdbcProdutos;
import Percistencia.conexao;
import iplaceModel.Produto;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class adicionaProd extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnEditarCadastroDe;
	private JTextField addNomeProdtxt;
	private JTextPane txtpnProduto;
	private JTextPane txtpnValor;
	private JTextField addValortxt;
	private JTextPane txtpnQtd;
	private JSpinner addQnttxt;
	private JButton btnNewButton;
	private JButton btnCadastrar;
	private JTextPane textPane;
	private JTextPane txtpnMenu;
	
// DEVE ADICONAR VALOR QUANTIDADE NOME E DATA // 

	public adicionaProd(int cargo) {
		setTitle("Cadastra Produto");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		txtpnEditarCadastroDe = new JTextPane();
		txtpnEditarCadastroDe.setEditable(false);
		txtpnEditarCadastroDe.setText("Cadastro de novos Produtos");
		txtpnEditarCadastroDe.setForeground(Color.WHITE);
		txtpnEditarCadastroDe.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnEditarCadastroDe.setBackground(Color.DARK_GRAY);
		txtpnEditarCadastroDe.setBounds(114, 39, 219, 20);
		contentPane.add(txtpnEditarCadastroDe);
		
		addNomeProdtxt = new JTextField();
		addNomeProdtxt.setToolTipText("");
		addNomeProdtxt.setColumns(10);
		addNomeProdtxt.setBounds(80, 84, 154, 20);
		contentPane.add(addNomeProdtxt);
		
		txtpnProduto = new JTextPane();
		txtpnProduto.setEditable(false);
		txtpnProduto.setText("Produto:");
		txtpnProduto.setForeground(Color.WHITE);
		txtpnProduto.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnProduto.setBackground(Color.DARK_GRAY);
		txtpnProduto.setBounds(24, 84, 89, 20);
		contentPane.add(txtpnProduto);
		
		txtpnValor = new JTextPane();
		txtpnValor.setEditable(false);
		txtpnValor.setText("Valor:");
		txtpnValor.setForeground(Color.WHITE);
		txtpnValor.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnValor.setBackground(Color.DARK_GRAY);
		txtpnValor.setBounds(34, 125, 36, 20);
		contentPane.add(txtpnValor);
		
		addValortxt = new JTextField();
		addValortxt.setColumns(10);
		addValortxt.setBounds(80, 125, 154, 20);
		contentPane.add(addValortxt);
		
		txtpnQtd = new JTextPane();
		txtpnQtd.setEditable(false);
		txtpnQtd.setText("Qtd:");
		txtpnQtd.setForeground(Color.WHITE);
		txtpnQtd.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		txtpnQtd.setBackground(Color.DARK_GRAY);
		txtpnQtd.setBounds(44, 165, 26, 20);
		contentPane.add(txtpnQtd);
		
		addQnttxt = new JSpinner();
		addQnttxt.setBounds(80, 165, 54, 20);
		contentPane.add(addQnttxt);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaProdutos cancelaProd = new listaProdutos(cargo);
				cancelaProd.setVisible(true);
					dispose();
			}
		});
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(63, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(278, 125, 145, 20);
		contentPane.add(dateChooser);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer codigo_produto;
				 String nome_produto;
				 Date data_cadastro_produto;
				 Integer valor_produto; 
				 Integer quantidade_produto;
				 conexao empresa = new conexao();
				 
				 codigo_produto = null;
				 nome_produto = addNomeProdtxt.getText();
				 data_cadastro_produto= dateChooser.getDate();
				 valor_produto= Integer.parseInt(addValortxt.getText());
				 quantidade_produto= (Integer)addQnttxt.getValue();
				 
				
				
				Produto g = new Produto(codigo_produto,nome_produto,data_cadastro_produto,valor_produto,quantidade_produto);
				
				g.setNome_produto(nome_produto);
				g.setData_cadastro_produto(data_cadastro_produto);
				g.setValor_produto(valor_produto);
				g.setQuantidade_produto(quantidade_produto);

				JdbcProdutos addProd = new JdbcProdutos(empresa.abrirconexao());
				addProd.addProd(g);
				empresa.fechaconexao();
				
				
			}
		});
		btnCadastrar.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(291, 214, 89, 23);
		contentPane.add(btnCadastrar);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 257, 434, 4);
		contentPane.add(textPane);
		
		txtpnMenu = new JTextPane();
		txtpnMenu.setEditable(false);
		txtpnMenu.setText("iPlace System");
		txtpnMenu.setForeground(Color.WHITE);
		txtpnMenu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		txtpnMenu.setBackground(new Color(153, 204, 0));
		txtpnMenu.setBounds(0, 0, 434, 28);
		contentPane.add(txtpnMenu);
		
		JLabel lblNewLabel = new JLabel("Data:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		lblNewLabel.setBounds(244, 125, 36, 14);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
