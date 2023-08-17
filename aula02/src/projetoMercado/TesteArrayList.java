package projetoMercado;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> bandas = new ArrayList();
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
				
		ArrayList<Produto> produtos = new ArrayList();
		ArrayList<String> nomeProdutos = new ArrayList();
		
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
				JOptionPane.showMessageDialog(null, produtos);
				break;
				
			case 3:
				Arrays.sort(nomeProdutos);

				break;
			
			case 4:	
				
				break;
				
			case 0:	
				
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida.");
			}
			
		} while (op!=0);
		
		
		
		
		
		
	}

}
