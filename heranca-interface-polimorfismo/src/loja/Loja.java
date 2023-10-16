package loja;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Loja {

	private static Scanner sc;

	public static void main(String[] args) {
		Produto p = null;
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		sc = new Scanner(System.in);
		String nome, autor;
		double preco;
		int faixas, duracao, op, tipo;
		boolean aux = false;
		
		do {
			System.out.println("Escolha a Opção Desejada: "
					+ "\n"
					+ "\n1 - Cadastrar Produto"
					+ "\n2 - Listar Produtos"
					+ "\n3 - Buscar Produto"
					+ "\n0 - Sair");
			
			op = sc.nextInt();
						
			switch (op) {
			case 1:
				do {
					System.out.println("Escolha o Tipo de Produto: "
							+ "\n"
							+ "\n1 - Livro"
							+ "\n2 - CD"
							+ "\n3 - DVD"
							+ "\n0 - Retornar ao Menu Anterior");
					
					tipo = sc.nextInt();
					
					switch (tipo) {
					case 1:
						System.out.println("Informe o nome do livro: ");
						nome = sc.next();	
						System.out.println("Informe o preço do livro: ");
						preco = sc.nextDouble();
						System.out.println("Informe o autor do livro: ");
						autor = sc.next();
						p = new Livro(nome, preco, autor);
						listaProdutos.add(p);
						break;

					case 2:
						System.out.println("Informe o nome do CD: ");
						nome = sc.next();	
						System.out.println("Informe o preço do CD: ");
						preco = sc.nextDouble();
						System.out.println("Informe a quatidade de faixas do CD: ");
						faixas = sc.nextInt();
						p = new CD(nome, preco, faixas);
						listaProdutos.add(p);
						break;

					case 3:
						System.out.println("Informe o nome do DVD: ");
						nome = sc.next();	
						System.out.println("Informe o preço do DVD: ");
						preco = sc.nextDouble();
						System.out.println("Informe a duração do DVD: ");
						duracao = sc.nextInt();
						p = new DVD(nome, preco, duracao);
						listaProdutos.add(p);
						break;

					case 0:
						break;
					}
					
					break;
										
				} while (tipo != 0);
				
				break;				

			case 2:
				System.out.println(listaProdutos);
				break;

			case 3:
				System.out.println("Informe o nome do produto: ");
				nome = sc.next();
				
				for (Produto produto: listaProdutos) {
					if (Objects.equals(nome, produto.getNome())) {
						System.out.println("Produto encontrado!");
						System.out.println(produto);
						aux = true;
					}
				}
				
				if (!aux) {
					System.out.println("Produto não encontrada!");
				}
				
				aux = false;
				
				break;
				
			case 0:
				System.out.println("Volte Sempre!");
				break;
			
			}
			
		} while (op != 0);
		
		
	}

}
