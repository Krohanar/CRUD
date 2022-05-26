package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class excluir extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public excluir() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Sim");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(92, 192, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("N\u00E3o");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(247, 192, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Deseja realmente excluir o cadastro abaixo?");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(52, 78, 330, 23);
		add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(153, 204, 0));
		textPane.setBounds(0, 285, 434, 4);
		add(textPane);
		
		textField = new JTextField();
		textField.setBounds(127, 126, 167, 20);
		add(textField);
		textField.setColumns(10);

	}
}
