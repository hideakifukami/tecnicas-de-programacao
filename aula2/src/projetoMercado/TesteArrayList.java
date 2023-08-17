package projetoMercado;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> bandas = new ArrayList<String>();
		bandas.add("Legião Urbana");
		bandas.add("Restart");
		bandas.add("Karnal");
		bandas.add("Raimundos");
		bandas.add("Norvana");
		
		String nome;
		int op;
		double valor;
		
		String menu = "Controle de Produtos: \n"
				+ "1. Adicionar Produto \n"
				+ "2. Listar Produtos \n"
				+ "3. Ordem Alfabética Crescente \n"
				+ "4. Ordem Alfabética Decrescente \n"
				+ "0. Sair ";
				
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<String> nomeProdutos = new ArrayList<String>();
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));	
			
			switch (op) {
			case 1:
				nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
				valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto: "));
				produtos.add(new Produto(nome, valor));
				nomeProdutos.add(nome);
				break;
			
			case 2:	
				JOptionPane.showMessageDialog(null, nomeProdutos);
				break;
				
			case 3:
				Collections.sort(nomeProdutos);
				JOptionPane.showMessageDialog(null, nomeProdutos);

				break;
			
			case 4:	
				Collections.sort(nomeProdutos, Collections.reverseOrder());
				JOptionPane.showMessageDialog(null, nomeProdutos);
				break;
				
			case 0:	
				JOptionPane.showMessageDialog(null, "Até Logo!");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida.");
			}
			
		} while (op!=0);
		
		
		
		
		
		
	}

}
