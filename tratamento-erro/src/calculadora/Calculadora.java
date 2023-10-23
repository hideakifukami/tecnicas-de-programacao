package calculadora;

import java.util.Scanner;

public class Calculadora {

	static Scanner sc;

	public static void main(String[] args) throws Exception {
		int n1 = 0, n2 = 0, op, result;
		double quociente, d;
		sc = new Scanner(System.in);
		
		
		do {			
			System.out.println("Informe a operação desejada:"
					+ "\n\n1. Soma"
					+ "\n2. Subtração"
					+ "\n3. Divisão"
					+ "\n4. Quociente da Divisão"
					+ "\n5. Resto da Divisão"
					+ "\n6. Multiplicação"
					+ "\n7. Raiz Quadrada"
					+ "\n0. Sair");
			
			op = sc.nextInt();
			
			if(op >= 0 && op <= 7) {
				System.out.println("Informe o primeiro número: ");
				n1 = sc.nextInt();
				if(op!=7) {
					System.out.println("Informe o segundo número: ");
					n2 = sc.nextInt();
				}
				
	            if (n1 != (int) n1 || n2 != (int) n2) {
					throw new Exception("Valores de entrada precisam ser inteiros!");
	            }
			}
			
			
			
			switch (op) {
			case 1:
				result = n1 + n2;
				System.out.println("Resultado: " + result);
				break;
			case 2:
				result = n1 - n2;
				System.out.println("Resultado: " + result);

				break;
			case 3:
				if(n2 == 0) {
					throw new Exception("Não é possível divisão por 0!");
				}
				
				quociente = n1 / n2;
				System.out.println("Resultado: " + quociente);
				
				break;
			case 4:
				if(n2 == 0) {
					throw new Exception("Não é possível divisão por 0!");
				}
				
				result = n1 / n2;
				System.out.println("Resultado: " + result);

				break;
			case 5:
				if(n2 == 0) {
					throw new Exception("Não é possível divisão por 0!");
				}
				
				result = n1 % n2;
				System.out.println("Resultado: " + result);

				break;
			case 6:
				result = n1 * n2;
				System.out.println("Resultado: " + result);

				break;
			case 7:
				if (n1 < 0) {
					throw new Exception("Não é possível raiz quadrada negativa!");
				}
				result = (int) Math.sqrt(n1);
				System.out.println("Resultado: " + result);

				break;
			case 0:
				System.out.println("Volte Sempre!");
				break;										
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (op!=0);	
	}
}
