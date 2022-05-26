package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Canvas;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JTextPane;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.windowText);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(153, 204, 0));
		lblNewLabel.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 24));
		lblNewLabel.setBounds(193, 63, 56, 43);
		contentPane.add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(164, 111, 116, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(164, 148, 116, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBounds(116, 113, 47, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setBounds(125, 151, 39, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				//if(txtLogin.equals(ger.getLogin) && txtSenha.equals(gerente.getSenha)) {
					
					
				//}
				
				
				menuPrincipal mm = new menuPrincipal();
				mm.setVisible(true);
				
				
				
				
			}
		});
		btnNewButton.setBounds(164, 186, 116, 23);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnMenu = new JTextPane();
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
	}
}
