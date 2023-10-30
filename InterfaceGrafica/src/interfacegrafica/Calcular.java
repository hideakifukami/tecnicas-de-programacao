package interfacegrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calcular extends JFrame {

	private JPanel contentPane;
	private JTextField input1;
	private JTextField input2;
	private JTextField input3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcular frame = new Calcular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calcular() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Numero 1");
		label1.setBackground(Color.WHITE);
		label1.setBounds(28, 47, 63, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Numero 2");
		label2.setBounds(28, 75, 63, 14);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Resultado");
		label3.setBounds(28, 103, 63, 14);
		contentPane.add(label3);
		
		input1 = new JTextField();
		label1.setLabelFor(input1);
		input1.setBounds(130, 41, 284, 20);
		contentPane.add(input1);
		input1.setColumns(10);
		
		input2 = new JTextField();
		label2.setLabelFor(input2);
		input2.setColumns(10);
		input2.setBounds(130, 69, 284, 20);
		contentPane.add(input2);
		
		input3 = new JTextField();
		label3.setLabelFor(input3);
		input3.setColumns(10);
		input3.setBounds(130, 97, 284, 20);
		contentPane.add(input3);
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1,n2,result;
				
				try {
					n1 = Double.parseDouble(input1.getText());
					n2 = Double.parseDouble(input2.getText());
					result = n1 + n2;
					input3.setText(String.valueOf(result));					
				} catch (Exception error) {					
					input3.setText("Entrada inválida.");					
				}
				
				
				
			}
		});
		btnSomar.setBounds(28, 151, 89, 23);
		contentPane.add(btnSomar);
		
		JButton btnSubtrair = new JButton("Subtrair");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1,n2,result;
				
				try {
					n1 = Double.parseDouble(input1.getText());
					n2 = Double.parseDouble(input2.getText());
					result = n1 - n2;
					input3.setText(String.valueOf(result));					
				} catch (Exception error) {
					input3.setText("Entrada inválida.");					
				}
				
			}
		});
		btnSubtrair.setBounds(127, 151, 89, 23);
		contentPane.add(btnSubtrair);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1,n2,result;
				
				try {
					n1 = Double.parseDouble(input1.getText());
					n2 = Double.parseDouble(input2.getText());
					result = n1 * n2;
					input3.setText(String.valueOf(result));					
				} catch (Exception error) {
					input3.setText("Entrada inválida.");					
				}
				
			}
		});
		btnMultiplicar.setBounds(226, 151, 89, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1,n2,result;
				
				try {
					n1 = Double.parseDouble(input1.getText());
					n2 = Double.parseDouble(input2.getText());
					result = n1 / n2;
					input3.setText(String.valueOf(result));					
				} catch (Exception error) {
					input3.setText("Entrada inválida.");					
				}
				
			}
		});
		btnDividir.setBounds(325, 151, 89, 23);
		contentPane.add(btnDividir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1.setText("");
				input2.setText("");
				input3.setText("");
			}
		});
		btnLimpar.setBounds(28, 185, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(325, 185, 89, 23);
		contentPane.add(btnFechar);
	}
}
