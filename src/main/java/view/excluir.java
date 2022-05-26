package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Percistencia.JdbcFuncionario;
import Percistencia.conexao;
import iplaceModel.Funcionario;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class excluir extends JFrame {
	private JTextField nometxt;
	private JPanel contentPane;

	/**
	 * Create the panel.
	 */
	public excluir(String id, String nome) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		JButton btnNewButton_1 = new JButton("N\u00E3o");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(247, 192, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Deseja realmente excluir o cadastro abaixo?");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(52, 78, 330, 23);
		getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 285, 434, 4);
		getContentPane().add(textPane);
		
		nometxt = new JTextField();
		nometxt.setHorizontalAlignment(SwingConstants.CENTER);
		nometxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nometxt.setEditable(false);
		nometxt.setBounds(115, 126, 194, 23);
		getContentPane().add(nometxt);
		nometxt.setText(nome);
		nometxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Sim");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome_pessoa, data_cadastro_funcionario;
				
				conexao empresa = new conexao();
				
				
				Funcionario g = new Funcionario();
				g.setCodigo_pessoa(Integer.parseInt(id));

	
				JdbcFuncionario apagar = new JdbcFuncionario(empresa.abrirconexao());
				apagar.apagarFuncionario(g);
				empresa.fechaconexao();
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(92, 192, 89, 23);
		getContentPane().add(btnNewButton);

	}
}
