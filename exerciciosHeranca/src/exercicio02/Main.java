package exercicio02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado empregado = new Empregado("Hideaki", 20000);
		Empregado gerente = new Gerente("Henrique", 25000, "Vendas");
		Empregado vendedor = new Vendedor("Johny", 30000, 0.15);
		
		System.out.println(empregado);
		System.out.println(gerente);
		System.out.println(vendedor);
	}

}
