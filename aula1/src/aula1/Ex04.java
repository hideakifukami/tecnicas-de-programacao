package aula1;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		String numStr;
		int num = 0;
		int contagem = 0;
		int soma = 0;
		int media = 0;
		
		do {
			numStr = JOptionPane.showInputDialog("Escreva um n�mero inteiro maior ou igual a 0: ");
			num = Integer.parseInt(numStr);
			contagem++;
			soma += num;
		} while (num >= 0);
		
		JOptionPane.showMessageDialog(null, "Quantidade de N�meros: " + contagem + ".");
		JOptionPane.showMessageDialog(null, "M�dia dos N�meros: " + soma/contagem + ".");
	}
}
