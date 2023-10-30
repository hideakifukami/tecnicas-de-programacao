package interfacegrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField inputNome;
	private JTextField inputEmail;
	private JTextField inputCPF;
	private JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setBounds(10, 14, 46, 14);
		contentPane.add(labelNome);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(10, 42, 46, 14);
		contentPane.add(labelEmail);
		
		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setBounds(10, 70, 46, 14);
		contentPane.add(labelCPF);
		
		inputNome = new JTextField();
		labelNome.setLabelFor(inputNome);
		inputNome.setBounds(66, 11, 306, 20);
		contentPane.add(inputNome);
		inputNome.setColumns(10);
		
		inputEmail = new JTextField();
		labelEmail.setLabelFor(inputEmail);
		inputEmail.setColumns(10);
		inputEmail.setBounds(66, 39, 306, 20);
		contentPane.add(inputEmail);
		
		inputCPF = new JTextField();
		labelCPF.setLabelFor(inputCPF);
		inputCPF.setColumns(10);
		inputCPF.setBounds(66, 67, 306, 20);
		contentPane.add(inputCPF);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 132, 362, 211);
		contentPane.add(textArea);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = inputNome.getText();
				String email = inputEmail.getText();
				String CPF = inputCPF.getText();
				
				Cliente cliente = new Cliente(nome, email, CPF);
				listaCliente.add(cliente);
				
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
				inputNome.setText("");
				inputEmail.setText("");
				inputCPF.setText("");
				textArea.setText(cliente.toString());
			}
		});
		btnCadastrar.setBounds(66, 98, 114, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaCliente.toString());
			}
		});
		btnListar.setBounds(258, 98, 114, 23);
		contentPane.add(btnListar);
	}
}
