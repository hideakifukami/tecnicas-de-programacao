package bancoFatecZL;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();		
		conta.titular = JOptionPane.showInputDialog("Digite o nome do titular: ");
		JOptionPane.showMessageDialog(null, conta.titular + " � o nome do dono da conta.");
		
		String confirm = JOptionPane.showInputDialog("Gostaria de fazer um dep�sito? (Y / N) ");	
		
		do {
			int valorDeposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser depositador: "));
			conta.deposita(valorDeposito);			
			JOptionPane.showMessageDialog(null, "O saldo da conta � R$" + conta.saldo);
			confirm = JOptionPane.showInputDialog("Gostaria de fazer um dep�sito? (Y / N) ");
		} while (confirm.equalsIgnoreCase("y"));
		
	}
}
