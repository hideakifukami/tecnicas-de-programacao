package contaExtends;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UsaContaPolimorfa {

	private static Scanner sc;

	public static void main(String[] args) {
		Conta c = null;
		ArrayList<Conta> listaContas = new ArrayList<Conta>();
		sc = new Scanner(System.in);
		int op, tipoConta, num;
		String nome;
		boolean aux = false;
		
		do {
			System.out.println("Escolha a Opção Desejada: "
					+ "\n"
					+ "\n1 - Criar Conta"
					+ "\n2 - Listar Clientes"
					+ "\n3 - Buscar Cliente"
					+ "\n0 - Sair");
			
			op = sc.nextInt();
						
			switch (op) {
			case 1:
				do {
					System.out.println("Escolha o Tipo de Conta: "
							+ "\n"
							+ "\n1 - Conta Padrão"
							+ "\n2 - Conta Especial"
							+ "\n3 - Conta Poupança"
							+ "\n0 - Retornar ao Menu Anterior");
					
					tipoConta = sc.nextInt();
					
					switch (tipoConta) {
					case 1:
						System.out.println("Informe o Nome do Titular: ");
						nome = sc.next();
						c = new Conta(nome);
						listaContas.add(c);
						break;

					case 2:
						System.out.println("Informe o Nome do Titular: ");
						nome = sc.next();
						c = new ContaEspecial(nome, 100.00);
						listaContas.add(c);
						break;

					case 3:
						System.out.println("Informe o Nome do Titular: ");
						nome = sc.next();
						c = new ContaPoupanca(nome);
						listaContas.add(c);
						break;

					case 0:
						break;
					}
					
					break;
										
				} while (tipoConta != 0);
				
				break;				

			case 2:
				System.out.println(listaContas);
				break;

			case 3:
				System.out.println("Informe o Número da Conta");
				num = sc.nextInt();
				
				for (Conta conta : listaContas) {
					if (Objects.equals(num, conta.getNumero())) {
						System.out.println("Conta Encontrada!");
						System.out.println(conta);
						aux = true;
					}
				}
				
				if (!aux) {
					System.out.println("Conta Não Encontrada!");
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
