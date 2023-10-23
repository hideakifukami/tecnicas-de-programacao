package lojaComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Loja {

	private static Scanner sc;

	public static void main(String[] args) {
		Produto p = null;
		Produto c = null;
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		sc = new Scanner(System.in);
		String nome, autor, className;
		double preco;
		int faixas, duracao, op, tipo, codigo;
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
						System.out.println("Informe o código de barras do produto: ");
						codigo = sc.nextInt();
						System.out.println("Informe o nome do livro: ");
						nome = sc.next();	
						System.out.println("Informe o preço do livro: ");
						preco = sc.nextDouble();
						System.out.println("Informe o autor do livro: ");
						autor = sc.next();
						p = new Livro(nome, preco, codigo, autor);
						listaProdutos.add(p);
						break;

					case 2:
						System.out.println("Informe o código de barras do produto: ");
						codigo = sc.nextInt();
						System.out.println("Informe o nome do CD: ");
						nome = sc.next();	
						System.out.println("Informe o preço do CD: ");
						preco = sc.nextDouble();
						System.out.println("Informe a quatidade de faixas do CD: ");
						faixas = sc.nextInt();
						p = new CD(nome, preco, codigo, faixas);
						listaProdutos.add(p);
						break;

					case 3:
						System.out.println("Informe o código de barras do produto: ");
						codigo = sc.nextInt();
						System.out.println("Informe o nome do DVD: ");
						nome = sc.next();	
						System.out.println("Informe o preço do DVD: ");
						preco = sc.nextDouble();
						System.out.println("Informe a duração do DVD: ");
						duracao = sc.nextInt();
						p = new DVD(nome, preco, codigo, duracao);
						listaProdutos.add(p);
						break;

					case 0:
						break;
					}
					
					break;
										
				} while (tipo != 0);
				
				break;				

			case 2:
				
					Collections.sort(listaProdutos);
					System.out.println(listaProdutos);
					System.out.println("Escolha um produto pelo código:"
							+ "\nPara voltar insira '0'");
					
					codigo = sc.nextInt();
					
					for (Produto produto: listaProdutos) {
						if (Objects.equals(codigo, produto.getCodigo())) {
							System.out.println("Produto encontrado!");
							
							className = produto.getClass().getSimpleName();
							
							switch (className) {
							case "Livro":
								Livro livro = (Livro) produto;
								p = new Livro(livro.getNome(), livro.getPreco(), livro.getCodigo(), livro.getAutor());
								c = new Livro(livro.getNome(), livro.getPreco(), livro.getCodigo() + 10, livro.getAutor());
								listaProdutos.add(p);
								listaProdutos.add(c);								
								break;
								
							case "CD":
								CD cd = (CD) produto;
								p = new CD(cd.getNome(), cd.getPreco(), cd.getCodigo(), cd.getFaixas());
								c = new CD(cd.getNome(), cd.getPreco(), cd.getCodigo() + 10, cd.getFaixas());
								listaProdutos.add(p);
								listaProdutos.add(c);
								break;
								
							case "DVD":
								DVD dvd = (DVD) produto;
								p = new DVD(dvd.getNome(), dvd.getPreco(), dvd.getCodigo(), dvd.getDuracao());
								c = new DVD(dvd.getNome(), dvd.getPreco(), dvd.getCodigo() + 10, dvd.getDuracao());
								listaProdutos.add(p);
								listaProdutos.add(c);
								break;							
							}
							
							aux = true;

						}
					}
					
					if (!aux) {
						System.out.println("Produto não encontrada!");
					}
					
					aux = false;
																			
				break;
								
			case 3:
				System.out.println("Informe o codigo do produto: ");
				codigo = sc.nextInt();
				
				for (Produto produto: listaProdutos) {
					if (Objects.equals(codigo, produto.getCodigo())) {
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
