package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class relatorio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	// Relatorio deve gerar : deve apresentar todos os produtos que foram vendidos em um td periodo junto a quantos foram vendidos 
	// campo com a soma total vendido no mesmo perido 
	
	/**
	 * Create the frame.
	 */
	public relatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDateChooser dateInicio = new JDateChooser();
		dateInicio.setBounds(24, 65, 108, 20);
		contentPane.add(dateInicio);
		
		JDateChooser dateFim = new JDateChooser();
		dateFim.setBounds(280, 65, 108, 20);
		contentPane.add(dateFim);
		
		JLabel deQuando = new JLabel("Até");
		deQuando.setForeground(Color.WHITE);
		deQuando.setBounds(190, 71, 46, 14);
		contentPane.add(deQuando);
		
		JLabel infdate = new JLabel("Insira a data");
		infdate.setForeground(Color.WHITE);
		infdate.setBounds(10, 40, 92, 14);
		contentPane.add(infdate);
		
		JButton geraRT = new JButton("Gerar");
		geraRT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		geraRT.setBounds(167, 99, 89, 23);
		contentPane.add(geraRT);
		
		JLabel lblNewLabel = new JLabel("Relatorio valor total");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(136, 11, 215, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(167, 214, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(24, 133, 379, 53);
		contentPane.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("valor total no periodo");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 217, 115, 14);
		contentPane.add(lblNewLabel_1);
	}
}
