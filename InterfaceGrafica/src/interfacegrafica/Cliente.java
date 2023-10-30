package interfacegrafica;

import javax.swing.JOptionPane;

public class Cliente {
	private String nome;
	private String email;
	private String CPF;
	
	public Cliente(String nome, String email, String CPF) {
		this.nome = nome;
		this.email = email;
		this.CPF = CPF;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + " | Email: " + email + " | CPF: " + CPF + "\n";
	}
	
}
