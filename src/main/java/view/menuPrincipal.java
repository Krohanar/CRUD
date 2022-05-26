package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import java.awt.Window.Type;

public class menuPrincipal extends JFrame {

	private static final long serialVersionUID = -9023214099854740452L;
	private JPanel contentPane;

	public menuPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnFuncionario = new JButton("Funcionários");
		btnFuncionario.setForeground(new Color(0, 0, 0));
		btnFuncionario.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		btnFuncionario.setBackground(Color.WHITE);
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaPessoas listaP = new listaPessoas();
				listaP.setVisible(true);
				dispose();
			}
		});

		btnFuncionario.setBounds(238, 93, 143, 114);
		contentPane.add(btnFuncionario);


		JButton bntProduto = new JButton("Produtos");
		bntProduto.setForeground(new Color(0, 0, 0));
		bntProduto.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		bntProduto.setBackground(Color.WHITE);
		bntProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaProdutos listaProd = new listaProdutos();
				listaProd.setVisible(true);
				dispose();
			}
		});		
		
		bntProduto.setBounds(53, 93, 141, 114);
		contentPane.add(bntProduto);
				
		JButton bntSair = new JButton("LogOut");
		bntSair.setBackground(new Color(153, 204, 0));
		bntSair.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 9));
		bntSair.setForeground(new Color(0, 0, 0));
		bntSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		bntSair.setBounds(373, 0, 61, 28);
		contentPane.add(bntSair);
		
		JTextPane txtpnMenu = new JTextPane();
		txtpnMenu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		txtpnMenu.setForeground(new Color(255, 255, 255));
		txtpnMenu.setBackground(new Color(153, 204, 0));
		txtpnMenu.setText("iPlace System");
		txtpnMenu.setBounds(0, 0, 434, 28);
		contentPane.add(txtpnMenu);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 257, 434, 4);
		contentPane.add(textPane);
		
		JTextPane txtpnMenu_1 = new JTextPane();
		txtpnMenu_1.setText("Menu");
		txtpnMenu_1.setForeground(Color.WHITE);
		txtpnMenu_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtpnMenu_1.setBackground(Color.DARK_GRAY);
		txtpnMenu_1.setBounds(189, 49, 53, 20);
		contentPane.add(txtpnMenu_1);
	}
}
