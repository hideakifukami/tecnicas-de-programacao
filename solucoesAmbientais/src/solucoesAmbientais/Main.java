package solucoesAmbientais;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IndustriaCliente> clientes = new ArrayList<IndustriaCliente>();
		int op, i;
		boolean aux = false;
		String nomeEmpresa, cnpjEmpresa, telefoneEmpresa;
		String menu = "Bem vindo � Solu��es Ambientais! \n"				
				+ "\n Escolha uma op��o: \n"
				+ "1. Cadastrar Cliente \n"
				+ "2. Listar Clientes \n"
				+ "3. Buscar Cliente \n"
				+ "4. Relat�rio Individual \n"
				+ "5. Relat�rio Geral \n"
				+ "0. Sair do Sistema";
		
		do {
			
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (op) {
			case 1:
				nomeEmpresa = JOptionPane.showInputDialog("Informe o nome da empresa a ser cadastrada: ");
				cnpjEmpresa = JOptionPane.showInputDialog("Informe o CNPJ da empresa: ");
				telefoneEmpresa = JOptionPane.showInputDialog("Informe o telefone da empresa: ");
				clientes.add(new IndustriaCliente(nomeEmpresa, cnpjEmpresa, telefoneEmpresa));
				break;

			case 2:
				JOptionPane.showMessageDialog(null, clientes);
				
				break;

			case 3:
				cnpjEmpresa = JOptionPane.showInputDialog("Informe o CNPJ da empresa: ");
				
				for (i = 0; i < clientes.size(); i++) {
					if (clientes.get(i).cnpj.equals(cnpjEmpresa)) {
						JOptionPane.showMessageDialog(null, "Cliente Encontrado! \n" + clientes.get(i).toString());
						aux = true;
					}
				}
				

				if (!aux) {
					JOptionPane.showMessageDialog(null, "Cliente N�o Encontrado!");
				}
				
				aux = false;
				
				break;

			case 4:
				
				break;

			case 5:
				
				break;

			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado! Volte Sempre!");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			}
			
		} while (op != 0);
		
		
	}

}
