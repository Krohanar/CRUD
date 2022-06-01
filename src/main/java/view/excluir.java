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

	// String id, String nome, int cargo
	public excluir(String id, String nome, int cargo) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adell\\Downloads\\Iplace.png"));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);

		JButton btnNewButton_1 = new JButton("N\u00E3o");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaPessoas lp = new listaPessoas(cargo);
				lp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(247, 192, 89, 23);
		getContentPane().add(btnNewButton_1);

		JLabel txtLabel = new JLabel("Deseja realmente excluir o cadastro abaixo?");
		txtLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		txtLabel.setForeground(Color.WHITE);
		txtLabel.setBounds(52, 78, 330, 23);
		getContentPane().add(txtLabel);

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

		nometxt.setColumns(10);
		nometxt.setText(nome);

		JButton btnNewButton = new JButton("Sim");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome_pessoa;

				conexao empresa = new conexao();

               nome_pessoa = nometxt.getText();	
				
				Funcionario g = new Funcionario();
				g.setNome_pessoa(nome_pessoa);
				
				JdbcFuncionario apagarFuncionario = new JdbcFuncionario(empresa.abrirconexao());
				apagarFuncionario.apagarFuncionario(g);
				empresa.fechaconexao();
				
				
				listaPessoas lp = new listaPessoas(cargo);
				lp.setVisible(true);

				dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(92, 192, 89, 23);
		getContentPane().add(btnNewButton);

	}
}
