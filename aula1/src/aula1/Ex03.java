package aula1;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Digite seu nome: ");
		String idadeStr = JOptionPane.showInputDialog("Informe sua idade: ");
		int idade = Integer.parseInt(idadeStr);
		JOptionPane.showMessageDialog(null, "Nome: " + name + ".");
		JOptionPane.showMessageDialog(null, "Idade: " + idade + ".");
		
		if (idade < 16) {
			JOptionPane.showMessageDialog(null, "N�o pode votar. ");
		}
		
		else if (idade == 16 || idade == 17 || idade > 65) {
			JOptionPane.showMessageDialog(null, "Voto facultativo. ");
		} else {
			JOptionPane.showMessageDialog(null, "Voto obrigat�rio. ");
		}
		
	}

}
